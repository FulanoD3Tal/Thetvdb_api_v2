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
package com.fulanodetalcompany.thetvdb.apiv2.Common;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import retrofit2.Response;

/**
 * A generic class to handle with the error of the restful api
 * @version 0.0.1
 * @author Roberto Alonso De la Garza Mendoza
 * @param <T>
 */
public class RequestErrorHandler<T> {

    /**
     * GSON free parser for the error message
     */
    JsonParser parser = new JsonParser();

    /**
     * Get the http code error
     * @param response the http request object
     * @return the code as Integer
     */
    private int getErrorCode(Response<T> response) {
        return response.code();
    }
    
    /**
     * Return an exception of the code fit in one the cases
     * @param response the http request object
     * @throws UnauthenticatedException If the request haven´t authentication
     * credentials
     */
    public void HandleError(Response<T> response) throws UnauthenticatedException {
        switch (getErrorCode(response)) {
            case 401:
                throw new UnauthenticatedException(decodeErrorMesage(response));
        }

    }
    /**
     * Return the error message of the response
     * @param response the http request
     * @return the message
     */
    private String decodeErrorMesage(Response<T> response) {
        JsonObject error_message;
        error_message = parser.parse(response.errorBody().toString())
                .getAsJsonObject();

        return error_message.get("message").getAsString();
    }

}
