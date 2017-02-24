/*
 * MarvelComicsLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.marvel.gateway.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ComicSummary 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4881838111919933144L;
    private String resourceURI;
    private String name;
    /** GETTER
     * The path to the individual comic resource.
     */
    @JsonGetter("resourceURI")
    public String getResourceURI ( ) { 
        return this.resourceURI;
    }
    
    /** SETTER
     * The path to the individual comic resource.
     */
    @JsonSetter("resourceURI")
    public void setResourceURI (String value) { 
        this.resourceURI = value;
    }
 
    /** GETTER
     * The canonical name of the comic.
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * The canonical name of the comic.
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
}
 