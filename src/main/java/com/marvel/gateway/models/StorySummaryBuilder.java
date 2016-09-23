/*
 * MarvelComicsLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 09/23/2016
 */
package com.marvel.gateway.models;

import java.util.*;

public class StorySummaryBuilder {
    //the instance to build
    private StorySummary storySummary;

    /**
     * Default constructor to initialize the instance
     */
    public StorySummaryBuilder() {
        storySummary = new StorySummary();
    }

    /**
     * The canonical name of the story.
     */
    public StorySummaryBuilder name(String name) {
        storySummary.setName(name);
        return this;
    }

    /**
     * The path to the individual story resource.
     */
    public StorySummaryBuilder resourceURI(String resourceURI) {
        storySummary.setResourceURI(resourceURI);
        return this;
    }

    /**
     * The type of the story (interior or cover).
     */
    public StorySummaryBuilder type(String type) {
        storySummary.setType(type);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public StorySummary build() {
        return storySummary;
    }
}