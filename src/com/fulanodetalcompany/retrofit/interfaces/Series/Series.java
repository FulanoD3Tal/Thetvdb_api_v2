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
package com.fulanodetalcompany.retrofit.interfaces.Series;

import com.fulanodetalcompany.gson.models.Common.ResultData;
import com.fulanodetalcompany.gson.models.Common.ResultDataList;
import com.fulanodetalcompany.gson.models.Series.Actor;
import com.fulanodetalcompany.gson.models.Series.Serie;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;

/**
 * @version 0.0.1
 * @author Roberto Alonso De la Garza Mendoza
 */
public interface Series {
    /**
     * Get all info of the Serie
     * @param token the authentication credentials
     * @param serieId the id of the serie
     * @return a serie with the same id
     */
    @GET("series/{id}")
    Call<ResultData<Serie>>
            getSerieInfo(
                    @Header("Authorization") String token,
                    @Path("id") int serieId
            );
            
    /**
     * Get all info the Serie
     * @param token the authentication credentials
     * @param language the language of the serie
     * @param serieId the id of the serie
     * @return a serie with the same id
     */
    @GET("series/{id}")
    Call<ResultData<Serie>>
            getSerieInfo(
                    @Header("Authorization") String token,
                    @Header("Accept-Language") String language,
                    @Path("id") int serieId
            );
    
    /**
     * Get a list of all the pricipal actors of the Serie
     * 
     * @param token the authentication credentials
     * @param serieId the id of the serie
     * @return 
     */
    @GET("series/{id}/actors")
    Call<ResultDataList<Actor>>
            getActorsInfo(
                    @Header("Authorization") String token,
                    @Path("id") int serieId
            );
}
