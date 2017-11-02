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
package com.fulanodetalcompany.thetvdb.apiv2.Authentication;

import com.fulanodetalcompany.gson.models.Authentication.AuthenticationRequest;
import com.fulanodetalcompany.gson.models.Authentication.AuthenticationToken;
import com.fulanodetalcompany.retrofit.interfaces.Authentication.Authentication;
import com.fulanodetalcompany.thetvdb.apiv2.Common.RequestErrorHandler;
import com.fulanodetalcompany.thetvdb.apiv2.Common.UnauthenticatedException;
import java.io.IOException;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 *
 * @version 0.0.1
 * @author Roberto Alonso De la Garza Mendoza
 */
public class AuthenticationClass extends RequestErrorHandler<AuthenticationToken>{

    Retrofit retrofit;
    Authentication authentication;

    /**
     *
     * @param base_url
     */
    public AuthenticationClass(String base_url) {
        this.retrofit = new Retrofit.Builder()
                .baseUrl(base_url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        this.authentication = retrofit.create(Authentication.class);
    }

    public String getToken(String apikey, String userkey, String username) throws IOException, UnauthenticatedException {
        return getToken(
                new AuthenticationRequest(
                        apikey,
                        userkey,
                        username));
    }

    public String getToken(AuthenticationRequest auth_request) throws IOException, UnauthenticatedException {
        Response<AuthenticationToken> execute;
        execute = this.authentication
                .getToken(auth_request)
                .execute();

        if (execute.isSuccessful()) {
            return execute.body().getToken();
        } else {
            HandleError(execute);
        }
        return null;
    }
    
    public String refreshToken(String token) throws IOException, UnauthenticatedException{
        return refreshToken(
                new AuthenticationToken(
                        token));
    }
    
    public String refreshToken(AuthenticationToken token) throws IOException, UnauthenticatedException{
        Response<AuthenticationToken> execute;
        execute = this.authentication
                .refreshToken(String.format("Bearer %s", token.getToken()))
                .execute();
        if (execute.isSuccessful()) {
            return execute.body().getToken();
        } else {
            HandleError(execute);
        }
        return null;
    }

}
