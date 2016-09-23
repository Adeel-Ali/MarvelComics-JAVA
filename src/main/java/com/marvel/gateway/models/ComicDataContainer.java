/*
 * MarvelComicsLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 09/23/2016
 */
package com.marvel.gateway.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ComicDataContainer 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5750457893247873596L;
    private int count;
    private int limit;
    private int offset;
    private List<Comic> results;
    private int total;
    /** GETTER
     * The total number of results returned by this call.
     */
    @JsonGetter("count")
    public int getCount ( ) { 
        return this.count;
    }
    
    /** SETTER
     * The total number of results returned by this call.
     */
    @JsonSetter("count")
    public void setCount (int value) { 
        this.count = value;
    }
 
    /** GETTER
     * The requested result limit.
     */
    @JsonGetter("limit")
    public int getLimit ( ) { 
        return this.limit;
    }
    
    /** SETTER
     * The requested result limit.
     */
    @JsonSetter("limit")
    public void setLimit (int value) { 
        this.limit = value;
    }
 
    /** GETTER
     * The requested offset (number of skipped results) of the call.
     */
    @JsonGetter("offset")
    public int getOffset ( ) { 
        return this.offset;
    }
    
    /** SETTER
     * The requested offset (number of skipped results) of the call.
     */
    @JsonSetter("offset")
    public void setOffset (int value) { 
        this.offset = value;
    }
 
    /** GETTER
     * The list of comics returned by the call
     */
    @JsonGetter("results")
    public List<Comic> getResults ( ) { 
        return this.results;
    }
    
    /** SETTER
     * The list of comics returned by the call
     */
    @JsonSetter("results")
    public void setResults (List<Comic> value) { 
        this.results = value;
    }
 
    /** GETTER
     * The total number of resources available given the current filter set.
     */
    @JsonGetter("total")
    public int getTotal ( ) { 
        return this.total;
    }
    
    /** SETTER
     * The total number of resources available given the current filter set.
     */
    @JsonSetter("total")
    public void setTotal (int value) { 
        this.total = value;
    }
 
}
 