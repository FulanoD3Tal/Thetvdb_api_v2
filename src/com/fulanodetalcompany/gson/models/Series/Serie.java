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
 * This represent a Serie of the api
 *
 * @version 0.0.2
 * @author Roberto Alonso De la Garza Mendoza
 */
public class Serie {

    /**
     * List of alternative names of the serie
     */
    private List<String> aliases;
    /**
     * List of the genres of the series
     */
    @SerializedName("genre")
    private List<String> genres;
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
     * The network Id for external purpose
     */
    private String networkId;
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
     * The seriesId for external purpose
     */
    private String seriesId;
    /**
     * The average duration of the episodes
     */
    @SerializedName("runtime")
    private String duration;
    /**
     * The number of the last update
     */
    private int lastUpdated;
    /**
     * Day of the week when episode go on air
     */
    private String airsDayOfWeek;
    /**
     * Time of the day when episode go on air
     */
    private String airsTime;
    /**
     * Source of rating
     */
    private String rating;
    /**
     * The score of the rating
     */
    @SerializedName("siteRating")
    private double score_rating;
    /**
     * The count of votes in the source rating
     */
    @SerializedName("siteRatingCount")
    private int votes_rating;
    /**
     * Id in IMDB
     */
    private String imdbId;
    /**
     * TODO create javadoc
     */
    private String zap2itId;
    /**
     * The date when this series was added to thetvdb.com
     */
    private String added;

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

    /**
     * List of the genres of the series
     *
     * @return the genres
     */
    public List<String> getGenres() {
        return genres;
    }

    /**
     * List of the genres of the series
     *
     * @param genres the genres to set
     */
    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    /**
     * The network Id for external purpose
     *
     * @return the networkId
     */
    public String getNetworkId() {
        return networkId;
    }

    /**
     * The network Id for external purpose
     *
     * @param networkId the networkId to set
     */
    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

    /**
     * The seriesId for external purpose
     *
     * @return the seriesId
     */
    public String getSeriesId() {
        return seriesId;
    }

    /**
     * The seriesId for external purpose
     *
     * @param seriesId the seriesId to set
     */
    public void setSeriesId(String seriesId) {
        this.seriesId = seriesId;
    }

    /**
     * The average duration of the episodes
     *
     * @return the duration
     */
    public String getDuration() {
        return duration;
    }

    /**
     * The average duration of the episodes
     *
     * @param duration the duration to set
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }

    /**
     * The number of the last update
     *
     * @return the lastUpdated
     */
    public int getLastUpdated() {
        return lastUpdated;
    }

    /**
     * The number of the last update
     *
     * @param lastUpdated the lastUpdated to set
     */
    public void setLastUpdated(int lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * Day of the week when episode go on air
     *
     * @return the airsDayOfWeek
     */
    public String getAirsDayOfWeek() {
        return airsDayOfWeek;
    }

    /**
     * Day of the week when episode go on air
     *
     * @param airsDayOfWeek the airsDayOfWeek to set
     */
    public void setAirsDayOfWeek(String airsDayOfWeek) {
        this.airsDayOfWeek = airsDayOfWeek;
    }

    /**
     * Time of the day when episode go on air
     *
     * @return the airsTime
     */
    public String getAirsTime() {
        return airsTime;
    }

    /**
     * Time of the day when episode go on air
     *
     * @param airsTime the airsTime to set
     */
    public void setAirsTime(String airsTime) {
        this.airsTime = airsTime;
    }

    /**
     * Source of rating
     *
     * @return the rating
     */
    public String getRating() {
        return rating;
    }

    /**
     * Source of rating
     *
     * @param rating the rating to set
     */
    public void setRating(String rating) {
        this.rating = rating;
    }

    /**
     * The score of the rating
     *
     * @return the score_rating
     */
    public double getScore_rating() {
        return score_rating;
    }

    /**
     * The score of the rating
     *
     * @param score_rating the score_rating to set
     */
    public void setScore_rating(double score_rating) {
        this.score_rating = score_rating;
    }

    /**
     * The count of votes in the source rating
     *
     * @return the votes_rating
     */
    public int getVotes_rating() {
        return votes_rating;
    }

    /**
     * The count of votes in the source rating
     *
     * @param votes_rating the votes_rating to set
     */
    public void setVotes_rating(int votes_rating) {
        this.votes_rating = votes_rating;
    }

    /**
     * Id in IMDB
     *
     * @return the imdbId
     */
    public String getImdbId() {
        return imdbId;
    }

    /**
     * Id in IMDB
     *
     * @param imdbId the imdbId to set
     */
    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    /**
     * The date when this series was added to thetvdb.com
     *
     * @return the added
     */
    public String getAdded() {
        return added;
    }

    /**
     * The date when this series was added to thetvdb.com
     *
     * @param added the added to set
     */
    public void setAdded(String added) {
        this.added = added;
    }

    @Override
    public String toString() {
        return "Serie{" + "aliases=" + aliases + ", genres=" + genres + ", banner=" + banner + ", release_date=" + release_date + ", id=" + id + ", network=" + network + ", networkId=" + networkId + ", synopsis=" + synopsis + ", name=" + name + ", status=" + status + ", seriesId=" + seriesId + ", duration=" + duration + ", lastUpdated=" + lastUpdated + ", airsDayOfWeek=" + airsDayOfWeek + ", airsTime=" + airsTime + ", rating=" + rating + ", score_rating=" + score_rating + ", votes_rating=" + votes_rating + ", imdbId=" + imdbId + ", zap2itId=" + zap2itId + ", added=" + added + '}';
    }

}
