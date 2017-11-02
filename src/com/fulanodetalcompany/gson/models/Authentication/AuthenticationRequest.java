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
 * @version 0.0.1
 * @author Roberto Alonso De la Garza Mendoza
 */
public class AuthenticationRequest {

    private String apikey,
                    userkey,
                    username;

    public AuthenticationRequest() {
    }

    /**
     *
     * @param apikey
     * @param userkey
     * @param username
     */
    public AuthenticationRequest(String apikey, String userkey, String username) {
        this.apikey = apikey;
        this.userkey = userkey;
        this.username = username;
    }

    /**
     *
     * @return
     */
    public String getApikey() {
        return apikey;
    }

    /**
     *
     * @param apikey
     */
    public void setApikey(String apikey) {
        this.apikey = apikey;
    }

    /**
     *
     * @return
     */
    public String getUserkey() {
        return userkey;
    }

    /**
     *
     * @param userkey
     */
    public void setUserkey(String userkey) {
        this.userkey = userkey;
    }

    /**
     *
     * @return
     */
    public String getUsername() {
        return username;
    }

    /**
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

}
