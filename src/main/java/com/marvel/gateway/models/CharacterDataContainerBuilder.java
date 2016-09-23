/*
 * MarvelComicsLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 09/23/2016
 */
package com.marvel.gateway.models;

import java.util.*;

public class CharacterDataContainerBuilder {
    //the instance to build
    private CharacterDataContainer characterDataContainer;

    /**
     * Default constructor to initialize the instance
     */
    public CharacterDataContainerBuilder() {
        characterDataContainer = new CharacterDataContainer();
    }

    /**
     * The total number of results returned by this call.
     */
    public CharacterDataContainerBuilder count(int count) {
        characterDataContainer.setCount(count);
        return this;
    }

    /**
     * The requested result limit.
     */
    public CharacterDataContainerBuilder limit(int limit) {
        characterDataContainer.setLimit(limit);
        return this;
    }

    /**
     * The requested offset (number of skipped results) of the call.
     */
    public CharacterDataContainerBuilder offset(int offset) {
        characterDataContainer.setOffset(offset);
        return this;
    }

    /**
     * The list of characters returned by the call.
     */
    public CharacterDataContainerBuilder results(List<MCharacter> results) {
        characterDataContainer.setResults(results);
        return this;
    }

    /**
     * The total number of resources available given the current filter set.
     */
    public CharacterDataContainerBuilder total(int total) {
        characterDataContainer.setTotal(total);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CharacterDataContainer build() {
        return characterDataContainer;
    }
}