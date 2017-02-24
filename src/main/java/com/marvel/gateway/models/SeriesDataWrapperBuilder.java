/*
 * MarvelComicsLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.marvel.gateway.models;

import java.util.*;

public class SeriesDataWrapperBuilder {
    //the instance to build
    private SeriesDataWrapper seriesDataWrapper;

    /**
     * Default constructor to initialize the instance
     */
    public SeriesDataWrapperBuilder() {
        seriesDataWrapper = new SeriesDataWrapper();
    }

    /**
     * The HTTP status code of the returned result.
     */
    public SeriesDataWrapperBuilder code(int code) {
        seriesDataWrapper.setCode(code);
        return this;
    }

    /**
     * A string description of the call status.
     */
    public SeriesDataWrapperBuilder status(String status) {
        seriesDataWrapper.setStatus(status);
        return this;
    }

    /**
     * The copyright notice for the returned result.
     */
    public SeriesDataWrapperBuilder copyright(String copyright) {
        seriesDataWrapper.setCopyright(copyright);
        return this;
    }

    /**
     * The attribution notice for this result.  Please display either this notice or the contents of the attributionHTML field on all screens which contain data from the Marvel Comics API.
     */
    public SeriesDataWrapperBuilder attributionText(String attributionText) {
        seriesDataWrapper.setAttributionText(attributionText);
        return this;
    }

    /**
     * An HTML representation of the attribution notice for this result.  Please display either this notice or the contents of the attributionText field on all screens which contain data from the Marvel Comics API.
     */
    public SeriesDataWrapperBuilder attributionHTML(String attributionHTML) {
        seriesDataWrapper.setAttributionHTML(attributionHTML);
        return this;
    }

    /**
     * The results returned by the call.
     */
    public SeriesDataWrapperBuilder data(SeriesDataContainer data) {
        seriesDataWrapper.setData(data);
        return this;
    }

    /**
     * A digest value of the content returned by the call.
     */
    public SeriesDataWrapperBuilder etag(String etag) {
        seriesDataWrapper.setEtag(etag);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SeriesDataWrapper build() {
        return seriesDataWrapper;
    }
}