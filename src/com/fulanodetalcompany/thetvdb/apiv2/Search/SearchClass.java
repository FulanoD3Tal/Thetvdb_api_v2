/*
 * Copyright 2017 Roberto Alonso De la Garza Mendoza.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.fulanodetalcompany.thetvdb.apiv2.Search;

import com.fulanodetalcompany.gson.models.Common.ResultDataList;
import com.fulanodetalcompany.gson.models.Series.Serie;
import com.fulanodetalcompany.retrofit.interfaces.Search.Search;
import com.fulanodetalcompany.thetvdb.apiv2.Common.NotFoundException;
import com.fulanodetalcompany.thetvdb.apiv2.Common.RequestErrorHandler;
import com.fulanodetalcompany.thetvdb.apiv2.Common.UnauthenticatedException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.io.IOException;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @version 0.0.1
 * @author Roberto Alonso De la Garza Mendoza
 */
public class SearchClass extends RequestErrorHandler {

    private Retrofit retrofit;
    private Search search;
    private String token;

    /**
     * Constructor with the base url for the api
     *
     * @param base_url
     * @param token
     */
    public SearchClass(String base_url, String token) {
        Gson gson = new GsonBuilder()
                .setDateFormat("yyy-MM-dd")
                .registerTypeAdapter(Date.class, new JsonDeserializer<Date>() {
                    @Override
                    public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                        DateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
                        String date_string = json.getAsString();
                        try {
                            return date_string.isEmpty() ? null : formater.parse(date_string);
                        } catch (ParseException ex) {
                            Logger.getLogger(SearchClass.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        return null;
                    }
                })
                .serializeNulls()
                .create();

        this.retrofit = new Retrofit.Builder()
                .baseUrl(base_url)
                .addConverterFactory(
                        GsonConverterFactory.create(gson)
                )
                .build();
        this.search = retrofit.create(Search.class);
        this.token = String.format("Bearer %s", token);
    }

    /**
     * @return the token
     */
    public String getToken() {
        return token;
    }

    /**
     * @param token the token to set
     */
    public void setToken(String token) {
        this.token = String.format("Bearer %s", token);
    }

    public List<Serie> searchByName(String name) throws IOException, UnauthenticatedException, NotFoundException {
        return this.searchByName(null, name);
    }

    public List<Serie> searchByName(String language, String name) throws IOException, UnauthenticatedException, NotFoundException {
        Response<ResultDataList<Serie>> execute = null;
        if (language == null) {
            execute = this.search
                    .searchByName(
                            token,
                            name
                    )
                    .execute();
        } else {
            execute = this.search
                    .searchbyName(
                            token,
                            language,
                            name
                    )
                    .execute();
        }

        if (getErrorCode(execute) == NOT_FOUND_CODE) {
            throw new NotFoundException(execute.message());
        }

        if (execute.isSuccessful()) {
            return execute.body().getResults();
        } else {
            HandleError(execute);
            return null;
        }
    }

}
