/*
 * MarvelComicsLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 09/23/2016
 */
package com.marvel.gateway;

import com.marvel.gateway.controllers.*;
import com.marvel.gateway.http.client.HttpClient;

public class MarvelComicsClient {
    /**
     * Singleton access to Stories controller
     * @return	Returns the StoriesController instance 
     */
    public StoriesController getStories() {
        return StoriesController.getInstance();
    }

    /**
     * Singleton access to Series controller
     * @return	Returns the SeriesController instance 
     */
    public SeriesController getSeries() {
        return SeriesController.getInstance();
    }

    /**
     * Singleton access to Events controller
     * @return	Returns the EventsController instance 
     */
    public EventsController getEvents() {
        return EventsController.getInstance();
    }

    /**
     * Singleton access to Creators controller
     * @return	Returns the CreatorsController instance 
     */
    public CreatorsController getCreators() {
        return CreatorsController.getInstance();
    }

    /**
     * Singleton access to Comics controller
     * @return	Returns the ComicsController instance 
     */
    public ComicsController getComics() {
        return ComicsController.getInstance();
    }

    /**
     * Singleton access to Characters controller
     * @return	Returns the CharactersController instance 
     */
    public CharactersController getCharacters() {
        return CharactersController.getInstance();
    }

    /**
     * Get the shared http client currently being used for API calls
     * @return The http client instance currently being used
     */
    public HttpClient getSharedHttpClient() {
        return BaseController.getClientInstance();
    }
    
    /**
     * Set a shared http client to be used for API calls
     * @param httpClient The http client to use
     */
    public void setSharedHttpClient(HttpClient httpClient) {
        BaseController.setClientInstance(httpClient);
    }

    /**
     * Default constructor 
     */     
    public MarvelComicsClient() {	
	}

    /**
     * Client initialization constructor 
     */     
    public MarvelComicsClient(String referer, String apikey) {
        this();
        Configuration.referer = referer;
        Configuration.apikey = apikey;
    }
}