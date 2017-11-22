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
package com.fulanodetalcompany.gson.models.Common;

import com.google.gson.annotations.SerializedName;

/**
 * Generic object to encapsule response in the next form<br>
 * <pre>
 * {@code
 * 
 *  {
 *      data:
 *          object:{
 *                  key : value,
 *                  ...
 *              }
 * }
 * 
 * }
 * </pre>
 * 
 * where object is the model with the info
 * 
 * @version 0.0.1
 * @author Roberto Alonso De la Garza Mendoza
 * @param <T>
 */
public class ResultData<T> {
    @SerializedName("data")
    private T result;

    /**
     * @return the result
     */
    public T getResult() {
        return result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(T result) {
        this.result = result;
    }
}
