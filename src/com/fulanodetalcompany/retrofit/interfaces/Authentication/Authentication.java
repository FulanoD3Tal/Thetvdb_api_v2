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
package com.fulanodetalcompany.retrofit.interfaces.Authentication;

import com.fulanodetalcompany.gson.models.Authentication.AuthenticationRequest;
import com.fulanodetalcompany.gson.models.Authentication.AuthenticationToken;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

/**
 * Interface that represent the restful api methods
 * for the Authentication
 * 
 * @version 0.0.1
 * @author Roberto Alonso De la Garza Mendoza
 */
public interface Authentication {
    
    /**
     * Get a token to use as authentication in the api
     * @param request a body with the element to sign in
     * @return a token string
     */
    @POST("login")
    Call<AuthenticationToken> getToken(@Body AuthenticationRequest request);
    
    /**
     * Get a new token without sign in again
     * @param token the actual token
     * @return a token string
     */
    @GET("refresh_token")
    Call<AuthenticationToken> refreshToken(@Header("Authorization") String token);
}   
