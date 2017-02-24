/*
 * MarvelComicsLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.marvel.gateway.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreatorDataContainer 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5606766653552946591L;
    private int offset;
    private int limit;
    private int total;
    private int count;
    private List<Creator> results;
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
     * The list of creators returned by the call.
     */
    @JsonGetter("results")
    public List<Creator> getResults ( ) { 
        return this.results;
    }
    
    /** SETTER
     * The list of creators returned by the call.
     */
    @JsonSetter("results")
    public void setResults (List<Creator> value) { 
        this.results = value;
    }
 
}
 