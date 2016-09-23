/*
 * MarvelComicsLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 09/23/2016
 */
package com.marvel.gateway.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Comic 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5037842575004890847L;
    private CharacterList characters;
    private List<ComicSummary> collectedIssues;
    private List<ComicSummary> collections;
    private CreatorList creators;
    private List<ComicDate> dates;
    private String description;
    private String diamondCode;
    private int digitalId;
    private String ean;
    private EventList events;
    private String format;
    private int id;
    private List<Image> images;
    private String isbn;
    private String issn;
    private int issueNumber;
    private Date modified;
    private int pageCount;
    private List<ComicPrice> prices;
    private String resourceURI;
    private SeriesSummary series;
    private StoryList stories;
    private List<TextObject> textObjects;
    private Thumbnail thumbnail;
    private String title;
    private String upc;
    private List<Url> urls;
    private String variantDescription;
    private List<ComicSummary> variants;
    /** GETTER
     * A resource list containing the characters which appear in this comic.
     */
    @JsonGetter("characters")
    public CharacterList getCharacters ( ) { 
        return this.characters;
    }
    
    /** SETTER
     * A resource list containing the characters which appear in this comic.
     */
    @JsonSetter("characters")
    public void setCharacters (CharacterList value) { 
        this.characters = value;
    }
 
    /** GETTER
     * A list of issues collected in this comic (will generally be empty for periodical formats such as "comic" or "magazine").
     */
    @JsonGetter("collectedIssues")
    public List<ComicSummary> getCollectedIssues ( ) { 
        return this.collectedIssues;
    }
    
    /** SETTER
     * A list of issues collected in this comic (will generally be empty for periodical formats such as "comic" or "magazine").
     */
    @JsonSetter("collectedIssues")
    public void setCollectedIssues (List<ComicSummary> value) { 
        this.collectedIssues = value;
    }
 
    /** GETTER
     * A list of collections which include this comic (will generally be empty if the comic's format is a collection).
     */
    @JsonGetter("collections")
    public List<ComicSummary> getCollections ( ) { 
        return this.collections;
    }
    
    /** SETTER
     * A list of collections which include this comic (will generally be empty if the comic's format is a collection).
     */
    @JsonSetter("collections")
    public void setCollections (List<ComicSummary> value) { 
        this.collections = value;
    }
 
    /** GETTER
     * A resource list containing the creators associated with this comic.
     */
    @JsonGetter("creators")
    public CreatorList getCreators ( ) { 
        return this.creators;
    }
    
    /** SETTER
     * A resource list containing the creators associated with this comic.
     */
    @JsonSetter("creators")
    public void setCreators (CreatorList value) { 
        this.creators = value;
    }
 
    /** GETTER
     * A list of key dates for this comic.
     */
    @JsonGetter("dates")
    public List<ComicDate> getDates ( ) { 
        return this.dates;
    }
    
    /** SETTER
     * A list of key dates for this comic.
     */
    @JsonSetter("dates")
    public void setDates (List<ComicDate> value) { 
        this.dates = value;
    }
 
    /** GETTER
     * The preferred description of the comic.
     */
    @JsonGetter("description")
    public String getDescription ( ) { 
        return this.description;
    }
    
    /** SETTER
     * The preferred description of the comic.
     */
    @JsonSetter("description")
    public void setDescription (String value) { 
        this.description = value;
    }
 
    /** GETTER
     * The Diamond code for the comic.
     */
    @JsonGetter("diamondCode")
    public String getDiamondCode ( ) { 
        return this.diamondCode;
    }
    
    /** SETTER
     * The Diamond code for the comic.
     */
    @JsonSetter("diamondCode")
    public void setDiamondCode (String value) { 
        this.diamondCode = value;
    }
 
    /** GETTER
     * The ID of the digital comic representation of this comic. Will be 0 if the comic is not available digitally.
     */
    @JsonGetter("digitalId")
    public int getDigitalId ( ) { 
        return this.digitalId;
    }
    
    /** SETTER
     * The ID of the digital comic representation of this comic. Will be 0 if the comic is not available digitally.
     */
    @JsonSetter("digitalId")
    public void setDigitalId (int value) { 
        this.digitalId = value;
    }
 
    /** GETTER
     * The EAN barcode for the comic.
     */
    @JsonGetter("ean")
    public String getEan ( ) { 
        return this.ean;
    }
    
    /** SETTER
     * The EAN barcode for the comic.
     */
    @JsonSetter("ean")
    public void setEan (String value) { 
        this.ean = value;
    }
 
    /** GETTER
     * A resource list containing the events in which this comic appears.
     */
    @JsonGetter("events")
    public EventList getEvents ( ) { 
        return this.events;
    }
    
    /** SETTER
     * A resource list containing the events in which this comic appears.
     */
    @JsonSetter("events")
    public void setEvents (EventList value) { 
        this.events = value;
    }
 
    /** GETTER
     * The publication format of the comic e.g. comic, hardcover, trade paperback.
     */
    @JsonGetter("format")
    public String getFormat ( ) { 
        return this.format;
    }
    
    /** SETTER
     * The publication format of the comic e.g. comic, hardcover, trade paperback.
     */
    @JsonSetter("format")
    public void setFormat (String value) { 
        this.format = value;
    }
 
    /** GETTER
     * The unique ID of the comic resource.
     */
    @JsonGetter("id")
    public int getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * The unique ID of the comic resource.
     */
    @JsonSetter("id")
    public void setId (int value) { 
        this.id = value;
    }
 
    /** GETTER
     * A list of promotional images associated with this comic.
     */
    @JsonGetter("images")
    public List<Image> getImages ( ) { 
        return this.images;
    }
    
    /** SETTER
     * A list of promotional images associated with this comic.
     */
    @JsonSetter("images")
    public void setImages (List<Image> value) { 
        this.images = value;
    }
 
    /** GETTER
     * The ISBN for the comic (generally only populated for collection formats).
     */
    @JsonGetter("isbn")
    public String getIsbn ( ) { 
        return this.isbn;
    }
    
    /** SETTER
     * The ISBN for the comic (generally only populated for collection formats).
     */
    @JsonSetter("isbn")
    public void setIsbn (String value) { 
        this.isbn = value;
    }
 
    /** GETTER
     * The ISSN barcode for the comic.
     */
    @JsonGetter("issn")
    public String getIssn ( ) { 
        return this.issn;
    }
    
    /** SETTER
     * The ISSN barcode for the comic.
     */
    @JsonSetter("issn")
    public void setIssn (String value) { 
        this.issn = value;
    }
 
    /** GETTER
     * The number of the issue in the series (will generally be 0 for collection formats).
     */
    @JsonGetter("issueNumber")
    public int getIssueNumber ( ) { 
        return this.issueNumber;
    }
    
    /** SETTER
     * The number of the issue in the series (will generally be 0 for collection formats).
     */
    @JsonSetter("issueNumber")
    public void setIssueNumber (int value) { 
        this.issueNumber = value;
    }
 
    /** GETTER
     * The date the resource was most recently modified.
     */
    @JsonGetter("modified")
    public Date getModified ( ) { 
        return this.modified;
    }
    
    /** SETTER
     * The date the resource was most recently modified.
     */
    @JsonSetter("modified")
    public void setModified (Date value) { 
        this.modified = value;
    }
 
    /** GETTER
     * The number of story pages in the comic.
     */
    @JsonGetter("pageCount")
    public int getPageCount ( ) { 
        return this.pageCount;
    }
    
    /** SETTER
     * The number of story pages in the comic.
     */
    @JsonSetter("pageCount")
    public void setPageCount (int value) { 
        this.pageCount = value;
    }
 
    /** GETTER
     * A list of prices for this comic.
     */
    @JsonGetter("prices")
    public List<ComicPrice> getPrices ( ) { 
        return this.prices;
    }
    
    /** SETTER
     * A list of prices for this comic.
     */
    @JsonSetter("prices")
    public void setPrices (List<ComicPrice> value) { 
        this.prices = value;
    }
 
    /** GETTER
     * The canonical URL identifier for this resource.
     */
    @JsonGetter("resourceURI")
    public String getResourceURI ( ) { 
        return this.resourceURI;
    }
    
    /** SETTER
     * The canonical URL identifier for this resource.
     */
    @JsonSetter("resourceURI")
    public void setResourceURI (String value) { 
        this.resourceURI = value;
    }
 
    /** GETTER
     * A summary representation of the series to which this comic belongs.
     */
    @JsonGetter("series")
    public SeriesSummary getSeries ( ) { 
        return this.series;
    }
    
    /** SETTER
     * A summary representation of the series to which this comic belongs.
     */
    @JsonSetter("series")
    public void setSeries (SeriesSummary value) { 
        this.series = value;
    }
 
    /** GETTER
     * A resource list containing the stories which appear in this comic.
     */
    @JsonGetter("stories")
    public StoryList getStories ( ) { 
        return this.stories;
    }
    
    /** SETTER
     * A resource list containing the stories which appear in this comic.
     */
    @JsonSetter("stories")
    public void setStories (StoryList value) { 
        this.stories = value;
    }
 
    /** GETTER
     * A set of descriptive text blurbs for the comic.
     */
    @JsonGetter("textObjects")
    public List<TextObject> getTextObjects ( ) { 
        return this.textObjects;
    }
    
    /** SETTER
     * A set of descriptive text blurbs for the comic.
     */
    @JsonSetter("textObjects")
    public void setTextObjects (List<TextObject> value) { 
        this.textObjects = value;
    }
 
    /** GETTER
     * The representative image for this comic.
     */
    @JsonGetter("thumbnail")
    public Thumbnail getThumbnail ( ) { 
        return this.thumbnail;
    }
    
    /** SETTER
     * The representative image for this comic.
     */
    @JsonSetter("thumbnail")
    public void setThumbnail (Thumbnail value) { 
        this.thumbnail = value;
    }
 
    /** GETTER
     * The canonical title of the comic.
     */
    @JsonGetter("title")
    public String getTitle ( ) { 
        return this.title;
    }
    
    /** SETTER
     * The canonical title of the comic.
     */
    @JsonSetter("title")
    public void setTitle (String value) { 
        this.title = value;
    }
 
    /** GETTER
     * The UPC barcode number for the comic (generally only populated for periodical formats).
     */
    @JsonGetter("upc")
    public String getUpc ( ) { 
        return this.upc;
    }
    
    /** SETTER
     * The UPC barcode number for the comic (generally only populated for periodical formats).
     */
    @JsonSetter("upc")
    public void setUpc (String value) { 
        this.upc = value;
    }
 
    /** GETTER
     * A set of public web site URLs for the resource.
     */
    @JsonGetter("urls")
    public List<Url> getUrls ( ) { 
        return this.urls;
    }
    
    /** SETTER
     * A set of public web site URLs for the resource.
     */
    @JsonSetter("urls")
    public void setUrls (List<Url> value) { 
        this.urls = value;
    }
 
    /** GETTER
     * If the issue is a variant (e.g. an alternate cover, second printing, or director’s cut), a text description of the variant.
     */
    @JsonGetter("variantDescription")
    public String getVariantDescription ( ) { 
        return this.variantDescription;
    }
    
    /** SETTER
     * If the issue is a variant (e.g. an alternate cover, second printing, or director’s cut), a text description of the variant.
     */
    @JsonSetter("variantDescription")
    public void setVariantDescription (String value) { 
        this.variantDescription = value;
    }
 
    /** GETTER
     * A list of variant issues for this comic (includes the "original" issue if the current issue is a variant).
     */
    @JsonGetter("variants")
    public List<ComicSummary> getVariants ( ) { 
        return this.variants;
    }
    
    /** SETTER
     * A list of variant issues for this comic (includes the "original" issue if the current issue is a variant).
     */
    @JsonSetter("variants")
    public void setVariants (List<ComicSummary> value) { 
        this.variants = value;
    }
 
}
 