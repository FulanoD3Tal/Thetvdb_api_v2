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
package com.fulanodetalcompany.gson.models.Series;

import java.util.Date;

/**
 * This represent an Actor in the api
 * 
 * @version 0.0.1
 * @author Roberto Alonso De la Garza Mendoza
 */
public class Actor {
    /**
     * The id of the actor
     */
    private int id;
    /**
     * The id of the Serie where the actor play
     * @see Serie
     */
    private int seriesId;
    /**
     * The name of the actor
     */
    private String name;
    /**
     * The caracter the actor play
     */
    private String role;
    /**
     * The credits order of the actor in the Serie
     */
    private int sortOrder;
    /**
     * The image of the actor
     */
    private String image;
    /**
     * The user who upload the image of the actor<br>
     * in the website thetvdb.com 
     */
    private int imageAuthor;
    /**
     * The date when the image was upload the first time
     */
    private Date imageAdded;
    /**
     * The date of the last update
     */
    private Date lastUpdated;

    /**
     * The id of the actor
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * The id of the actor
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * The id of the Serie where the actor play
     * @see Serie
     * @return the seriesId
     */
    public int getSeriesId() {
        return seriesId;
    }

    /**
     * The id of the Serie where the actor play
     * @see Serie
     * @param seriesId the seriesId to set
     */
    public void setSeriesId(int seriesId) {
        this.seriesId = seriesId;
    }

    /**
     * The name of the actor
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * The name of the actor
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The caracter the actor play
     * @return the role
     */
    public String getRole() {
        return role;
    }

    /**
     * The caracter the actor play
     * @param role the role to set
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * The credits order of the actor in the Serie
     * @return the sortOrder
     */
    public int getSortOrder() {
        return sortOrder;
    }

    /**
     * The credits order of the actor in the Serie
     * @param sortOrder the sortOrder to set
     */
    public void setSortOrder(int sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * The image of the actor
     * @return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * The image of the actor
     * @param image the image to set
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * The user who upload the image of the actor<br>
     * in the website thetvdb.com
     * @return the imageAuthor
     */
    public int getImageAuthor() {
        return imageAuthor;
    }

    /**
     * The user who upload the image of the actor<br>
     * in the website thetvdb.com
     * @param imageAuthor the imageAuthor to set
     */
    public void setImageAuthor(int imageAuthor) {
        this.imageAuthor = imageAuthor;
    }

    /**
     * The date when the image was upload the first time
     * @return the imageAdded
     */
    public Date getImageAdded() {
        return imageAdded;
    }

    /**
     * The date when the image was upload the first time
     * @param imageAdded the imageAdded to set
     */
    public void setImageAdded(Date imageAdded) {
        this.imageAdded = imageAdded;
    }

    /**
     * The date of the last update
     * @return the lastUpdated
     */
    public Date getLastUpdated() {
        return lastUpdated;
    }

    /**
     * The date of the last update
     * @param lastUpdated the lastUpdated to set
     */
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Override
    public String toString() {
        return "Actor{" + "id=" + id + ", seriesId=" + seriesId + ", name=" + name + ", role=" + role + ", sortOrder=" + sortOrder + ", image=" + image + ", imageAuthor=" + imageAuthor + ", imageAdded=" + imageAdded + ", lastUpdated=" + lastUpdated + '}';
    }
    
    
}
