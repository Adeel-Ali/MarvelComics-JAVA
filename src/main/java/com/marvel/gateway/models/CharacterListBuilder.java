/*
 * MarvelComicsLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.marvel.gateway.models;

import java.util.*;

public class CharacterListBuilder {
    //the instance to build
    private CharacterList characterList;

    /**
     * Default constructor to initialize the instance
     */
    public CharacterListBuilder() {
        characterList = new CharacterList();
    }

    /**
     * The number of total available characters in this list. Will always be greater than or equal to the "returned" value.
     */
    public CharacterListBuilder available(int available) {
        characterList.setAvailable(available);
        return this;
    }

    /**
     * The number of characters returned in this collection (up to 20).
     */
    public CharacterListBuilder returned(int returned) {
        characterList.setReturned(returned);
        return this;
    }

    /**
     * The path to the full list of characters in this collection.
     */
    public CharacterListBuilder collectionURI(String collectionURI) {
        characterList.setCollectionURI(collectionURI);
        return this;
    }

    /**
     * The list of returned characters in this collection.
     */
    public CharacterListBuilder items(List<CharacterSummary> items) {
        characterList.setItems(items);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CharacterList build() {
        return characterList;
    }
}