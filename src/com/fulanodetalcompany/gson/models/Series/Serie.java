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

import com.google.gson.annotations.SerializedName;
import java.util.Date;
import java.util.List;

/**
 * @version 0.0.1
 * @author Roberto Alonso De la Garza Mendoza
 */
public class Serie {

    /**
     * List of alternative names of the serie
     */
    private List<String> aliases;
    /**
     * The rute of the banner to show;
     */
    private String banner;
    /**
     * The lauch release_date
     */
    @SerializedName("firstAired")
    private Date release_date;
    /**
     * The id of the serie
     */
    private int id;
    /**
     * The network where the serie is emited
     */
    private String network;
    /**
     * The synopsis of the serie
     */
    @SerializedName("overview")
    private String synopsis;
    /**
     * The name of the serie
     */
    @SerializedName("seriesName")
    private String name;
    /**
     * The status of the serie
     */
    private String status;

    /**
     * List of alternative names of the serie
     *
     * @return the aliases
     */
    public List<String> getAliases() {
        return aliases;
    }

    /**
     * List of alternative names of the serie
     *
     * @param aliases the aliases to set
     */
    public void setAliases(List<String> aliases) {
        this.aliases = aliases;
    }

    /**
     * The rute of the banner to show;
     *
     * @return the banner
     */
    public String getBanner() {
        return banner;
    }

    /**
     * The rute of the banner to show;
     *
     * @param banner the banner to set
     */
    public void setBanner(String banner) {
        this.banner = banner;
    }

    /**
     * The lauch release_date
     *
     * @return the release_date
     */
    public Date getRelease_date() {
        return release_date;
    }

    /**
     * The lauch release_date
     *
     * @param release_date the release_date to set
     */
    public void setRelease_date(Date release_date) {
        this.release_date = release_date;
    }

    /**
     * The id of the serie
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * The id of the serie
     *
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * The network where the serie is emited
     *
     * @return the network
     */
    public String getNetwork() {
        return network;
    }

    /**
     * The network where the serie is emited
     *
     * @param network the network to set
     */
    public void setNetwork(String network) {
        this.network = network;
    }

    /**
     * The synopsis of the serie
     *
     * @return the synopsis
     */
    public String getSynopsis() {
        return synopsis;
    }

    /**
     * The synopsis of the serie
     *
     * @param synopsis the synopsis to set
     */
    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    /**
     * The name of the serie
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * The name of the serie
     *
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The status of the serie
     *
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * The status of the serie
     *
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Serie{" + "aliases=" + aliases + ", banner=" + banner + ", release_date=" + release_date + ", id=" + id + ", network=" + network + ", synopsis=" + synopsis + ", name=" + name + ", status=" + status + '}';
    }

}
