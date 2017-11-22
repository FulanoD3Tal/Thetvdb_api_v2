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
package com.fulanodetalcompany.gson.models.Languages;

/**
 * This represent a language from the api
 * 
 * @version 0.0.1
 * @author Roberto Alonso De la Garza Mendoza
 */
public class Language {
    /**
     * The id of the language<br>
     * gived in the next format<br>
     * <pre>
     *  00
     * </pre>
     */
    private String id;
    /**
     * The origin name of the language writen in the same language<br>
     * 
     */
    private String name;
    /**
     * The three letter abreviation of the language
     */
    private String abbreviation;
    /**
     * The english name of the language
     */
    private String englishName;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the abbreviation
     */
    public String getAbbreviation() {
        return abbreviation;
    }

    /**
     * @param abbreviation the abbreviation to set
     */
    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    /**
     * @return the englishName
     */
    public String getEnglishName() {
        return englishName;
    }

    /**
     * @param englishName the englishName to set
     */
    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    @Override
    public String toString() {
        return "Language{" + "id=" + id + ", name=" + name + ", abbreviation=" + abbreviation + ", englishName=" + englishName + '}';
    }
    
    
}
