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
package com.fulanodetalcompany.retrofit.interfaces.Search;

import com.fulanodetalcompany.gson.models.Common.ResultDataList;
import com.fulanodetalcompany.gson.models.Series.Serie;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

/**
 * @version 0.0.1
 * @author Roberto Alonso De la Garza Mendoza
 */
public interface Search {

    /**
     * Get a list of series than match with the search
     *
     * @param token the authentication credentials
     * @param name the name of the serie
     * @return a list of series
     */
    @GET("search/series")
    Call<ResultDataList<Serie>>
            searchByName(
                    @Header("Authorization") String token,
                    @Query("name") String name
            );

    /**
     * Get a list of series than match with the search and the language
     *
     * @param token the authentication credentials
     * @param language the language of the series
     * @param name the name of the serie
     * @return a list of serie
     */
    @GET("search/series")
    Call<ResultDataList<Serie>>
            searchbyName(
                    @Header("Authorization") String token,
                    @Header("Accept-Language") String language,
                    @Query("name") String name
            );
}
