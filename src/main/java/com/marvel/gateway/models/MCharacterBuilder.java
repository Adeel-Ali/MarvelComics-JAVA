/*
 * MarvelComicsLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.marvel.gateway.models;

import java.util.*;

public class MCharacterBuilder {
    //the instance to build
    private MCharacter mCharacter;

    /**
     * Default constructor to initialize the instance
     */
    public MCharacterBuilder() {
        mCharacter = new MCharacter();
    }

    /**
     * The unique ID of the character resource.
     */
    public MCharacterBuilder id(int id) {
        mCharacter.setId(id);
        return this;
    }

    /**
     * The name of the character.
     */
    public MCharacterBuilder name(String name) {
        mCharacter.setName(name);
        return this;
    }

    /**
     * A short bio or description of the character.
     */
    public MCharacterBuilder description(String description) {
        mCharacter.setDescription(description);
        return this;
    }

    /**
     * The date the resource was most recently modified.
     */
    public MCharacterBuilder modified(Date modified) {
        mCharacter.setModified(modified);
        return this;
    }

    /**
     * The canonical URL identifier for this resource.
     */
    public MCharacterBuilder resourceURI(String resourceURI) {
        mCharacter.setResourceURI(resourceURI);
        return this;
    }

    /**
     * A set of public web site URLs for the resource.
     */
    public MCharacterBuilder urls(List<Url> urls) {
        mCharacter.setUrls(urls);
        return this;
    }

    /**
     * The representative image for this character.
     */
    public MCharacterBuilder thumbnail(Thumbnail thumbnail) {
        mCharacter.setThumbnail(thumbnail);
        return this;
    }

    /**
     * A resource list containing comics which feature this character.
     */
    public MCharacterBuilder comics(ComicList comics) {
        mCharacter.setComics(comics);
        return this;
    }

    /**
     * A resource list of stories in which this character appears.
     */
    public MCharacterBuilder stories(StoryList stories) {
        mCharacter.setStories(stories);
        return this;
    }

    /**
     * A resource list of events in which this character appears.
     */
    public MCharacterBuilder events(EventList events) {
        mCharacter.setEvents(events);
        return this;
    }

    /**
     * A resource list of series in which this character appears.
     */
    public MCharacterBuilder series(SeriesList series) {
        mCharacter.setSeries(series);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public MCharacter build() {
        return mCharacter;
    }
}