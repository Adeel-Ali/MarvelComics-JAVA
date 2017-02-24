/*
 * MarvelComicsLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.marvel.gateway.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CharacterDataWrapper 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4713866741576797415L;
    private int code;
    private String status;
    private String copyright;
    private String attributionText;
    private String attributionHTML;
    private CharacterDataContainer data;
    private String etag;
    /** GETTER
     * The HTTP status code of the returned result.
     */
    @JsonGetter("code")
    public int getCode ( ) { 
        return this.code;
    }
    
    /** SETTER
     * The HTTP status code of the returned result.
     */
    @JsonSetter("code")
    public void setCode (int value) { 
        this.code = value;
    }
 
    /** GETTER
     * A string description of the call status.
     */
    @JsonGetter("status")
    public String getStatus ( ) { 
        return this.status;
    }
    
    /** SETTER
     * A string description of the call status.
     */
    @JsonSetter("status")
    public void setStatus (String value) { 
        this.status = value;
    }
 
    /** GETTER
     * The copyright notice for the returned result.
     */
    @JsonGetter("copyright")
    public String getCopyright ( ) { 
        return this.copyright;
    }
    
    /** SETTER
     * The copyright notice for the returned result.
     */
    @JsonSetter("copyright")
    public void setCopyright (String value) { 
        this.copyright = value;
    }
 
    /** GETTER
     * The attribution notice for this result.  Please display either this notice or the contents of the attributionHTML field on all screens which contain data from the Marvel Comics API.
     */
    @JsonGetter("attributionText")
    public String getAttributionText ( ) { 
        return this.attributionText;
    }
    
    /** SETTER
     * The attribution notice for this result.  Please display either this notice or the contents of the attributionHTML field on all screens which contain data from the Marvel Comics API.
     */
    @JsonSetter("attributionText")
    public void setAttributionText (String value) { 
        this.attributionText = value;
    }
 
    /** GETTER
     * An HTML representation of the attribution notice for this result.  Please display either this notice or the contents of the attributionText field on all screens which contain data from the Marvel Comics API.
     */
    @JsonGetter("attributionHTML")
    public String getAttributionHTML ( ) { 
        return this.attributionHTML;
    }
    
    /** SETTER
     * An HTML representation of the attribution notice for this result.  Please display either this notice or the contents of the attributionText field on all screens which contain data from the Marvel Comics API.
     */
    @JsonSetter("attributionHTML")
    public void setAttributionHTML (String value) { 
        this.attributionHTML = value;
    }
 
    /** GETTER
     * The results returned by the call.
     */
    @JsonGetter("data")
    public CharacterDataContainer getData ( ) { 
        return this.data;
    }
    
    /** SETTER
     * The results returned by the call.
     */
    @JsonSetter("data")
    public void setData (CharacterDataContainer value) { 
        this.data = value;
    }
 
    /** GETTER
     * A digest value of the content returned by the call.
     */
    @JsonGetter("etag")
    public String getEtag ( ) { 
        return this.etag;
    }
    
    /** SETTER
     * A digest value of the content returned by the call.
     */
    @JsonSetter("etag")
    public void setEtag (String value) { 
        this.etag = value;
    }
 
}
 