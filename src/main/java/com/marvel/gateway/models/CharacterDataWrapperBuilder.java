/*
 * MarvelComicsLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 09/23/2016
 */
package com.marvel.gateway.models;

import java.util.*;

public class CharacterDataWrapperBuilder {
    //the instance to build
    private CharacterDataWrapper characterDataWrapper;

    /**
     * Default constructor to initialize the instance
     */
    public CharacterDataWrapperBuilder() {
        characterDataWrapper = new CharacterDataWrapper();
    }

    /**
     * An HTML representation of the attribution notice for this result.  Please display either this notice or the contents of the attributionText field on all screens which contain data from the Marvel Comics API.
     */
    public CharacterDataWrapperBuilder attributionHTML(String attributionHTML) {
        characterDataWrapper.setAttributionHTML(attributionHTML);
        return this;
    }

    /**
     * The attribution notice for this result.  Please display either this notice or the contents of the attributionHTML field on all screens which contain data from the Marvel Comics API.
     */
    public CharacterDataWrapperBuilder attributionText(String attributionText) {
        characterDataWrapper.setAttributionText(attributionText);
        return this;
    }

    /**
     * The HTTP status code of the returned result.
     */
    public CharacterDataWrapperBuilder code(int code) {
        characterDataWrapper.setCode(code);
        return this;
    }

    /**
     * The copyright notice for the returned result.
     */
    public CharacterDataWrapperBuilder copyright(String copyright) {
        characterDataWrapper.setCopyright(copyright);
        return this;
    }

    /**
     * The results returned by the call.
     */
    public CharacterDataWrapperBuilder data(CharacterDataContainer data) {
        characterDataWrapper.setData(data);
        return this;
    }

    /**
     * A digest value of the content returned by the call.
     */
    public CharacterDataWrapperBuilder etag(String etag) {
        characterDataWrapper.setEtag(etag);
        return this;
    }

    /**
     * A string description of the call status.
     */
    public CharacterDataWrapperBuilder status(String status) {
        characterDataWrapper.setStatus(status);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CharacterDataWrapper build() {
        return characterDataWrapper;
    }
}