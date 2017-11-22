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
package com.fulanodetalcompany.retrofit.interfaces.Languages;

import com.fulanodetalcompany.gson.models.Common.ResultData;
import com.fulanodetalcompany.gson.models.Common.ResultDataList;
import com.fulanodetalcompany.gson.models.Languages.Language;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;

/**
 * A interface that represent the restful api methods
 * for the Language
 * 
 * @version 0.0.1
 * @author Roberto Alonso De la Garza Mendoza
 */
public interface Languages {
    
    /**
     * Get a list of avaliable language to use as filter
     * @param token to use as authentication
     * @return List of avaliable languages
     */
    @GET("languages")
    Call<ResultDataList<Language>> getAvaliableLanguages(@Header("Authorization") String token);
    
    /**
     * Get a language object for the given id
     * @param token to use as authentication
     * @param languageId the language id
     * @return A language object
     */
    @GET("languages/{id}")
    Call<ResultData<Language>> getLanguageInfo(@Header("Authorization") String token,@Path("id") int languageId);
}
