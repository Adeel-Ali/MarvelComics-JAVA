/*
 * MarvelComicsLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.marvel.gateway.models;

import java.util.*;

public class SeriesBuilder {
    //the instance to build
    private Series series;

    /**
     * Default constructor to initialize the instance
     */
    public SeriesBuilder() {
        series = new Series();
    }

    /**
     * The unique ID of the series resource.
     */
    public SeriesBuilder id(int id) {
        series.setId(id);
        return this;
    }

    /**
     * The canonical title of the series.
     */
    public SeriesBuilder title(String title) {
        series.setTitle(title);
        return this;
    }

    /**
     * A description of the series.
     */
    public SeriesBuilder description(String description) {
        series.setDescription(description);
        return this;
    }

    /**
     * The canonical URL identifier for this resource.
     */
    public SeriesBuilder resourceURI(String resourceURI) {
        series.setResourceURI(resourceURI);
        return this;
    }

    /**
     * A set of public web site URLs for the resource.
     */
    public SeriesBuilder urls(List<Url> urls) {
        series.setUrls(urls);
        return this;
    }

    /**
     * The first year of publication for the series.
     */
    public SeriesBuilder startYear(int startYear) {
        series.setStartYear(startYear);
        return this;
    }

    /**
     * The last year of publication for the series (conventionally, 2099 for ongoing series) .
     */
    public SeriesBuilder endYear(int endYear) {
        series.setEndYear(endYear);
        return this;
    }

    /**
     * The age-appropriateness rating for the series.
     */
    public SeriesBuilder rating(String rating) {
        series.setRating(rating);
        return this;
    }

    /**
     * The date the resource was most recently modified.
     */
    public SeriesBuilder modified(Date modified) {
        series.setModified(modified);
        return this;
    }

    /**
     * The representative image for this series.
     */
    public SeriesBuilder thumbnail(Thumbnail thumbnail) {
        series.setThumbnail(thumbnail);
        return this;
    }

    /**
     * A resource list containing comics in this series.
     */
    public SeriesBuilder comics(ComicList comics) {
        series.setComics(comics);
        return this;
    }

    /**
     * A resource list containing stories which occur in comics in this series.
     */
    public SeriesBuilder stories(StoryList stories) {
        series.setStories(stories);
        return this;
    }

    /**
     * A resource list containing events which take place in comics in this series.
     */
    public SeriesBuilder events(EventList events) {
        series.setEvents(events);
        return this;
    }

    /**
     * A resource list containing characters which appear in comics in this series.
     */
    public SeriesBuilder characters(CharacterList characters) {
        series.setCharacters(characters);
        return this;
    }

    /**
     * A resource list of creators whose work appears in comics in this series.
     */
    public SeriesBuilder creators(CreatorList creators) {
        series.setCreators(creators);
        return this;
    }

    /**
     * A summary representation of the series which follows this series.
     */
    public SeriesBuilder next(SeriesSummary next) {
        series.setNext(next);
        return this;
    }

    /**
     * A summary representation of the series which preceded this series.
     */
    public SeriesBuilder previous(SeriesSummary previous) {
        series.setPrevious(previous);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Series build() {
        return series;
    }
}