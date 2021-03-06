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
package com.fulanodetalcompany.gson.models.Authentication;

/**
 * This represent the http response from an AuthenticationRquest<br>
 * the only element that contains is the response as a token than<br>
 * can be use to all other operations in the api
 *
 * @version 0.0.1
 * @author Roberto Alonso De la Garza Mendoza
 */
public class AuthenticationToken {

    String token;

    /**
     *
     */
    public AuthenticationToken() {
    }

    /**
     * Create an instante of the object
     *
     * @param token
     */
    public AuthenticationToken(String token) {
        this.token = token;
    }

    /**
     * get the token
     *
     * @return
     */
    public String getToken() {
        return token;
    }

    /**
     * set token
     *
     * @param token
     */
    public void setToken(String token) {
        this.token = token;
    }

}
