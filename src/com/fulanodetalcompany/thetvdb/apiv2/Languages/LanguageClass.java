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
package com.fulanodetalcompany.thetvdb.apiv2.Languages;

import com.fulanodetalcompany.gson.models.Common.ResultData;
import com.fulanodetalcompany.gson.models.Common.ResultDataList;
import com.fulanodetalcompany.gson.models.Languages.Language;
import com.fulanodetalcompany.retrofit.interfaces.Languages.Languages;
import com.fulanodetalcompany.thetvdb.apiv2.Common.RequestErrorHandler;
import com.fulanodetalcompany.thetvdb.apiv2.Common.UnauthenticatedException;
import java.io.IOException;
import java.util.List;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * A class to handle the Language Selection Process
 *
 * @version 0.0.1
 * @author Roberto Alonso De la Garza Mendoza
 */
public class LanguageClass extends RequestErrorHandler {

    private Retrofit retrofit;
    private Languages languages;
    private String token;

    /**
     * Constructor with the base url for the api
     *
     * @param base_url the url of the api
     * @param token the authentication token
     */
    public LanguageClass(String base_url, String token) {
        this.retrofit = new Retrofit.Builder()
                .baseUrl(base_url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        this.languages = retrofit.create(Languages.class);
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

    /**
     * Get a list of the avaliable Languages
     *
     * @return a list of languages
     * @throws IOException
     * @throws UnauthenticatedException If the credentials are not corrects
     */
    public List<Language> getAvaliableLanguages() throws IOException, UnauthenticatedException {
        Response<ResultDataList<Language>> execute;
        execute = this.languages
                .getAvaliableLanguages(token)
                .execute();
        if (execute.isSuccessful()) {
            return execute.body().getResults();
        } else {
            HandleError(execute);
        }
        return null;
    }

    /**
     * Get the info of a single language
     *
     * @param language_id the id of the language
     * @return Language object
     * @throws IOException
     * @throws UnauthenticatedException If the credentials are not correct
     */
    public Language getLanguageInfo(int language_id) throws IOException, UnauthenticatedException {
        Response<ResultData<Language>> execute;
        execute = this.languages
                .getLanguageInfo(token, language_id)
                .execute();
        if (execute.isSuccessful()) {
            return execute.body().getResult();
        } else {
            HandleError(execute);
        }
        return null;
    }

}
