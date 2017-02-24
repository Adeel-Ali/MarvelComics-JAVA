# Getting started

## How to Build

The generated code uses a few Maven dependencies e.g., Jackson, UniRest,
and Apache HttpClient. The reference to these dependencies is already
added in the pom.xml file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Eclipse click on ``` File -> Import ```.

![Importing SDK into Eclipse - Step 1](https://apidocs.io/illustration/java?step=import0&workspaceFolder=MarvelComics-Java&workspaceName=MarvelComics&projectName=MarvelComicsLib&rootNamespace=com.marvel.gateway)

* In the import dialog, select ``` Existing Java Project ``` and click ``` Next ```.

![Importing SDK into Eclipse - Step 2](https://apidocs.io/illustration/java?step=import1&workspaceFolder=MarvelComics-Java&workspaceName=MarvelComics&projectName=MarvelComicsLib&rootNamespace=com.marvel.gateway)

* Browse to locate the folder containing the source code. Select the detected location of the project and click ``` Finish ```.

![Importing SDK into Eclipse - Step 3](https://apidocs.io/illustration/java?step=import2&workspaceFolder=MarvelComics-Java&workspaceName=MarvelComics&projectName=MarvelComicsLib&rootNamespace=com.marvel.gateway)

* Upon successful import, the project will be automatically built by Eclipse after automatically resolving the dependencies.

![Importing SDK into Eclipse - Step 4](https://apidocs.io/illustration/java?step=import3&workspaceFolder=MarvelComics-Java&workspaceName=MarvelComics&projectName=MarvelComicsLib&rootNamespace=com.marvel.gateway)

## How to Use

The following section explains how to use the MarvelComics library in a new console project.

### 1. Starting a new project

For starting a new project, click the menu command ``` File > New > Project ```.

![Add a new project in Eclipse](https://apidocs.io/illustration/java?step=createNewProject0&workspaceFolder=MarvelComics-Java&workspaceName=MarvelComics&projectName=MarvelComicsLib&rootNamespace=com.marvel.gateway)

Next, choose ``` Maven > Maven Project ```and click ``` Next ```.

![Create a new Maven Project - Step 1](https://apidocs.io/illustration/java?step=createNewProject1&workspaceFolder=MarvelComics-Java&workspaceName=MarvelComics&projectName=MarvelComicsLib&rootNamespace=com.marvel.gateway)

Here, make sure to use the current workspace by choosing ``` Use default Workspace location ```, as shown in the picture below and click ``` Next ```.

![Create a new Maven Project - Step 2](https://apidocs.io/illustration/java?step=createNewProject2&workspaceFolder=MarvelComics-Java&workspaceName=MarvelComics&projectName=MarvelComicsLib&rootNamespace=com.marvel.gateway)

Following this, select the *quick start* project type to create a simple project with an existing class and a ``` main ``` method. To do this, choose ``` maven-archetype-quickstart ``` item from the list and click ``` Next ```.

![Create a new Maven Project - Step 3](https://apidocs.io/illustration/java?step=createNewProject3&workspaceFolder=MarvelComics-Java&workspaceName=MarvelComics&projectName=MarvelComicsLib&rootNamespace=com.marvel.gateway)

In the last step, provide a ``` Group Id ``` and ``` Artifact Id ``` as shown in the picture below and click ``` Finish ```.

![Create a new Maven Project - Step 4](https://apidocs.io/illustration/java?step=createNewProject4&workspaceFolder=MarvelComics-Java&workspaceName=MarvelComics&projectName=MarvelComicsLib&rootNamespace=com.marvel.gateway)

### 2. Add reference of the library project

The created Maven project manages its dependencies using its ``` pom.xml ``` file. In order to add a dependency on the *MarvelComicsLib* client library, double click on the ``` pom.xml ``` file in the ``` Package Explorer ```. Opening the ``` pom.xml ``` file will render a graphical view on the cavas. Here, switch to the ``` Dependencies ``` tab and click the ``` Add ``` button as shown in the picture below.

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/java?step=testProject0&workspaceFolder=MarvelComics-Java&workspaceName=MarvelComics&projectName=MarvelComicsLib&rootNamespace=com.marvel.gateway)

Clicking the ``` Add ``` button will open a dialog where you need to specify MarvelComics in ``` Group Id ``` and MarvelComicsLib in the ``` Artifact Id ``` fields. Once added click ``` OK ```. Save the ``` pom.xml ``` file.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?step=testProject1&workspaceFolder=MarvelComics-Java&workspaceName=MarvelComics&projectName=MarvelComicsLib&rootNamespace=com.marvel.gateway)

### 3. Write sample code

Once the ``` SimpleConsoleApp ``` is created, a file named ``` App.java ``` will be visible in the *Package Explorer* with a ``` main ``` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?step=testProject2&workspaceFolder=MarvelComics-Java&workspaceName=MarvelComics&projectName=MarvelComicsLib&rootNamespace=com.marvel.gateway)

## How to Test

The generated code and the server can be tested using automatically generated test cases. 
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project *MarvelComicsLib* from the package explorer.
2. Select "Run -> Run as -> JUnit Test" or use "Alt + Shift + X" followed by "T" to run the Tests.

## Initialization

### Authentication
In order to setup authentication and initialization of the API client, you need the following information.

| Parameter | Description |
|-----------|-------------|
| referer | TODO: add a description |
| apikey | TODO: add a description |



API client can be initialized as following.

```java
// Initializing Object Mapper for Serialization and Deserialization purposes
public static ObjectMapper mapper = new ObjectMapper()
{
	private static final long serialVersionUID = -174113593500315394L;
	{
		configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		setSerializationInclusion(JsonInclude.Include.NON_NULL);
	}
};

// Configuration parameters and credentials
String referer = "referer";
String apikey = "apikey";

MarvelComicsClient client = new MarvelComicsClient(referer, apikey);
```

## Class Reference

### <a name="list_of_controllers"></a>List of Controllers

* [CharactersController](#characters_controller)
* [ComicsController](#comics_controller)
* [CreatorsController](#creators_controller)
* [EventsController](#events_controller)
* [SeriesController](#series_controller)
* [StoriesController](#stories_controller)

### <a name="characters_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.marvel.gateway.controllers.CharactersController") CharactersController

#### Get singleton instance

The singleton instance of the ``` CharactersController ``` class can be accessed from the API Client.

```java
CharactersController characters = client.getCharacters();
```

#### <a name="get_comics_character_collection_async"></a>![Method: ](https://apidocs.io/img/method.png "com.marvel.gateway.controllers.CharactersController.getComicsCharacterCollectionAsync") getComicsCharacterCollectionAsync

> Fetches lists of comics filtered by a character id.


```java
void getComicsCharacterCollectionAsync(
        final String characterId,
        final String format,
        final FormatTypeEnum formatType,
        final String noVariants,
        final DateDescriptorEnum dateDescriptor,
        final String dateRange,
        final String title,
        final String titleStartsWith,
        final String startYear,
        final String issueNumber,
        final String diamondCode,
        final String digitalId,
        final String upc,
        final String isbn,
        final String ean,
        final String issn,
        final String hasDigitalIssue,
        final String modifiedSince,
        final String creators,
        final String series,
        final String events,
        final String stories,
        final String sharedAppearances,
        final String collaborators,
        final String orderBy,
        final String limit,
        final String offset,
        final APICallBack<ComicDataWrapper> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| characterId |  ``` Required ```  | A single character id. |
| format |  ``` Optional ```  | Filter by the issue format (e.g. comic, digital comic, hardcover). (Acceptable values are: "comic", "magazine", "trade paperback", "hardcover", "digest", "graphic novel", "digital comic", "infinite comic") |
| formatType |  ``` Optional ```  | Filter by the issue format type (comic or collection). |
| noVariants |  ``` Optional ```  | Exclude variant comics from the result set. (Acceptable values are: "true") |
| dateDescriptor |  ``` Optional ```  | Return comics within a predefined date range. |
| dateRange |  ``` Optional ```  | Return comics within a predefined date range.  Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02).  Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format. |
| title |  ``` Optional ```  | Return only issues in series whose title matches the input. |
| titleStartsWith |  ``` Optional ```  | Return only issues in series whose title starts with the input. |
| startYear |  ``` Optional ```  | Return only issues in series whose start year matches the input. |
| issueNumber |  ``` Optional ```  | Return only issues in series whose issue number matches the input. |
| diamondCode |  ``` Optional ```  | Filter by diamond code. |
| digitalId |  ``` Optional ```  | Filter by digital comic id. |
| upc |  ``` Optional ```  | Filter by UPC. |
| isbn |  ``` Optional ```  | Filter by ISBN. |
| ean |  ``` Optional ```  | Filter by EAN. |
| issn |  ``` Optional ```  | Filter by ISSN. |
| hasDigitalIssue |  ``` Optional ```  | Include only results which are available digitally. (Acceptable values are: "true") |
| modifiedSince |  ``` Optional ```  | Return only comics which have been modified since the specified date. |
| creators |  ``` Optional ```  | Return only comics which feature work by the specified creators (accepts a comma-separated list of ids). |
| series |  ``` Optional ```  | Return only comics which are part of the specified series (accepts a comma-separated list of ids). |
| events |  ``` Optional ```  | Return only comics which take place in the specified events (accepts a comma-separated list of ids). |
| stories |  ``` Optional ```  | Return only comics which contain the specified stories (accepts a comma-separated list of ids). |
| sharedAppearances |  ``` Optional ```  | Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear). |
| collaborators |  ``` Optional ```  | Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work). |
| orderBy |  ``` Optional ```  | Order the result set by a field or fields. Add a "-" to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (Acceptable values are: "focDate", "onsaleDate", "title", "issueNumber", "modified", "-focDate", "-onsaleDate", "-title", "-issueNumber", "-modified") |
| limit |  ``` Optional ```  | Limit the result set to the specified number of resources. |
| offset |  ``` Optional ```  | Skip the specified number of resources in the result set. |


#### Example Usage

```java
String characterId = "characterId";
String format = "format";
FormatTypeEnum formatType = FormatTypeEnum.fromString("collection");
String noVariants = "noVariants";
DateDescriptorEnum dateDescriptor = DateDescriptorEnum.fromString("lastWeek");
String dateRange = "dateRange";
String title = "title";
String titleStartsWith = "titleStartsWith";
String startYear = "startYear";
String issueNumber = "issueNumber";
String diamondCode = "diamondCode";
String digitalId = "digitalId";
String upc = "upc";
String isbn = "isbn";
String ean = "ean";
String issn = "issn";
String hasDigitalIssue = "hasDigitalIssue";
String modifiedSince = "modifiedSince";
String creators = "creators";
String series = "series";
String events = "events";
String stories = "stories";
String sharedAppearances = "sharedAppearances";
String collaborators = "collaborators";
String orderBy = "orderBy";
String limit = "limit";
String offset = "offset";
// Invoking the API call with sample inputs
characters.getComicsCharacterCollectionAsync(characterId, format, formatType, noVariants, dateDescriptor, dateRange, title, titleStartsWith, startYear, issueNumber, diamondCode, digitalId, upc, isbn, ean, issn, hasDigitalIssue, modifiedSince, creators, series, events, stories, sharedAppearances, collaborators, orderBy, limit, offset, new APICallBack<ComicDataWrapper>() {
    public void onSuccess(HttpContext context, ComicDataWrapper response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 409 | Limit greater than 100. |



#### <a name="get_character_events_collection_async"></a>![Method: ](https://apidocs.io/img/method.png "com.marvel.gateway.controllers.CharactersController.getCharacterEventsCollectionAsync") getCharacterEventsCollectionAsync

> Fetches lists of events filtered by a character id.


```java
void getCharacterEventsCollectionAsync(
        final String characterId,
        final String name,
        final String nameStartsWith,
        final String modifiedSince,
        final String creators,
        final String series,
        final String comics,
        final String stories,
        final String orderBy,
        final String limit,
        final String offset,
        final APICallBack<EventDataWrapper> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| characterId |  ``` Required ```  | A single character id. |
| name |  ``` Optional ```  | Filter the event list by name. |
| nameStartsWith |  ``` Optional ```  | Return events with names that begin with the specified string (e.g. Sp). |
| modifiedSince |  ``` Optional ```  | Return only events which have been modified since the specified date. |
| creators |  ``` Optional ```  | Return only events which feature work by the specified creators (accepts a comma-separated list of ids). |
| series |  ``` Optional ```  | Return only events which are part of the specified series (accepts a comma-separated list of ids). |
| comics |  ``` Optional ```  | Return only events which take place in the specified comics (accepts a comma-separated list of ids). |
| stories |  ``` Optional ```  | Return only events which contain the specified stories (accepts a comma-separated list of ids). |
| orderBy |  ``` Optional ```  | Order the result set by a field or fields. Add a "-" to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (Acceptable values are: "name", "startDate", "modified", "-name", "-startDate", "-modified") |
| limit |  ``` Optional ```  | Limit the result set to the specified number of resources. |
| offset |  ``` Optional ```  | Skip the specified number of resources in the result set. |


#### Example Usage

```java
String characterId = "characterId";
String name = "name";
String nameStartsWith = "nameStartsWith";
String modifiedSince = "modifiedSince";
String creators = "creators";
String series = "series";
String comics = "comics";
String stories = "stories";
String orderBy = "orderBy";
String limit = "limit";
String offset = "offset";
// Invoking the API call with sample inputs
characters.getCharacterEventsCollectionAsync(characterId, name, nameStartsWith, modifiedSince, creators, series, comics, stories, orderBy, limit, offset, new APICallBack<EventDataWrapper>() {
    public void onSuccess(HttpContext context, EventDataWrapper response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 409 | Limit greater than 100. |



#### <a name="get_character_series_collection_async"></a>![Method: ](https://apidocs.io/img/method.png "com.marvel.gateway.controllers.CharactersController.getCharacterSeriesCollectionAsync") getCharacterSeriesCollectionAsync

> Fetches lists of series filtered by a character id.


```java
void getCharacterSeriesCollectionAsync(
        final String characterId,
        final String title,
        final String titleStartsWith,
        final String startYear,
        final String modifiedSince,
        final String comics,
        final String stories,
        final String events,
        final String creators,
        final String seriesType,
        final String contains,
        final String orderBy,
        final String limit,
        final String offset,
        final APICallBack<SeriesDataWrapper> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| characterId |  ``` Required ```  | A single character id. |
| title |  ``` Optional ```  | Filter by series title. |
| titleStartsWith |  ``` Optional ```  | Return series with titles that begin with the specified string (e.g. Sp). |
| startYear |  ``` Optional ```  | Return only series matching the specified start year. |
| modifiedSince |  ``` Optional ```  | Return only series which have been modified since the specified date. |
| comics |  ``` Optional ```  | Return only series which contain the specified comics (accepts a comma-separated list of ids). |
| stories |  ``` Optional ```  | Return only series which contain the specified stories (accepts a comma-separated list of ids). |
| events |  ``` Optional ```  | Return only series which have comics that take place during the specified events (accepts a comma-separated list of ids). |
| creators |  ``` Optional ```  | Return only series which feature work by the specified creators (accepts a comma-separated list of ids). |
| seriesType |  ``` Optional ```  | Filter the series by publication frequency type. (Acceptable values are: "collection", "one shot", "limited", "ongoing") |
| contains |  ``` Optional ```  | Return only series containing one or more comics with the specified format. (Acceptable values are: "comic", "magazine", "trade paperback", "hardcover", "digest", "graphic novel", "digital comic", "infinite comic") |
| orderBy |  ``` Optional ```  | Order the result set by a field or fields. Add a "-" to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (Acceptable values are: "title", "modified", "startYear", "-title", "-modified", "-startYear") |
| limit |  ``` Optional ```  | Limit the result set to the specified number of resources. |
| offset |  ``` Optional ```  | Skip the specified number of resources in the result set. |


#### Example Usage

```java
String characterId = "characterId";
String title = "title";
String titleStartsWith = "titleStartsWith";
String startYear = "startYear";
String modifiedSince = "modifiedSince";
String comics = "comics";
String stories = "stories";
String events = "events";
String creators = "creators";
String seriesType = "seriesType";
String contains = "contains";
String orderBy = "orderBy";
String limit = "limit";
String offset = "offset";
// Invoking the API call with sample inputs
characters.getCharacterSeriesCollectionAsync(characterId, title, titleStartsWith, startYear, modifiedSince, comics, stories, events, creators, seriesType, contains, orderBy, limit, offset, new APICallBack<SeriesDataWrapper>() {
    public void onSuccess(HttpContext context, SeriesDataWrapper response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 409 | Limit greater than 100. |



#### <a name="get_character_story_collection_async"></a>![Method: ](https://apidocs.io/img/method.png "com.marvel.gateway.controllers.CharactersController.getCharacterStoryCollectionAsync") getCharacterStoryCollectionAsync

> Fetches lists of stories filtered by a character id.


```java
void getCharacterStoryCollectionAsync(
        final String characterId,
        final String modifiedSince,
        final String comics,
        final String series,
        final String events,
        final String creators,
        final String orderBy,
        final String limit,
        final String offset,
        final APICallBack<StoryDataWrapper> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| characterId |  ``` Required ```  | A single character id. |
| modifiedSince |  ``` Optional ```  | Return only stories which have been modified since the specified date. |
| comics |  ``` Optional ```  | Return only stories contained in the specified (accepts a comma-separated list of ids). |
| series |  ``` Optional ```  | Return only stories contained the specified series (accepts a comma-separated list of ids). |
| events |  ``` Optional ```  | Return only stories which take place during the specified events (accepts a comma-separated list of ids). |
| creators |  ``` Optional ```  | Return only stories which feature work by the specified creators (accepts a comma-separated list of ids). |
| orderBy |  ``` Optional ```  | Order the result set by a field or fields. Add a "-" to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (Acceptable values are: "id", "modified", "-id", "-modified") |
| limit |  ``` Optional ```  | Limit the result set to the specified number of resources. |
| offset |  ``` Optional ```  | Skip the specified number of resources in the result set. |


#### Example Usage

```java
String characterId = "characterId";
String modifiedSince = "modifiedSince";
String comics = "comics";
String series = "series";
String events = "events";
String creators = "creators";
String orderBy = "orderBy";
String limit = "limit";
String offset = "offset";
// Invoking the API call with sample inputs
characters.getCharacterStoryCollectionAsync(characterId, modifiedSince, comics, series, events, creators, orderBy, limit, offset, new APICallBack<StoryDataWrapper>() {
    public void onSuccess(HttpContext context, StoryDataWrapper response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 409 | Limit greater than 100. |



#### <a name="get_character_individual_async"></a>![Method: ](https://apidocs.io/img/method.png "com.marvel.gateway.controllers.CharactersController.getCharacterIndividualAsync") getCharacterIndividualAsync

> Fetches a single character by id.


```java
void getCharacterIndividualAsync(
        final String characterId,
        final APICallBack<MCharacter> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| characterId |  ``` Required ```  | A single character id. |


#### Example Usage

```java
String characterId = "characterId";
// Invoking the API call with sample inputs
characters.getCharacterIndividualAsync(characterId, new APICallBack<MCharacter>() {
    public void onSuccess(HttpContext context, MCharacter response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 404 | Character not found. |



#### <a name="get_character_collection_async"></a>![Method: ](https://apidocs.io/img/method.png "com.marvel.gateway.controllers.CharactersController.getCharacterCollectionAsync") getCharacterCollectionAsync

> Fetches lists of characters.


```java
void getCharacterCollectionAsync(
        final String name,
        final String nameStartsWith,
        final String modifiedSince,
        final String comics,
        final String series,
        final String events,
        final String stories,
        final String orderBy,
        final String limit,
        final String offset,
        final APICallBack<CharacterDataWrapper> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| name |  ``` Optional ```  | Return only characters matching the specified full character name (e.g. Spider-Man). |
| nameStartsWith |  ``` Optional ```  | Return characters with names that begin with the specified string (e.g. Sp). |
| modifiedSince |  ``` Optional ```  | Return only characters which have been modified since the specified date. |
| comics |  ``` Optional ```  | Return only characters which appear in the specified comics (accepts a comma-separated list of ids). |
| series |  ``` Optional ```  | Return only characters which appear the specified series (accepts a comma-separated list of ids). |
| events |  ``` Optional ```  | Return only characters which appear in the specified events (accepts a comma-separated list of ids). |
| stories |  ``` Optional ```  | Return only characters which appear the specified stories (accepts a comma-separated list of ids). |
| orderBy |  ``` Optional ```  | Order the result set by a field or fields. Add a "-" to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (Acceptable values are: "name", "modified", "-name", "-modified") |
| limit |  ``` Optional ```  | Limit the result set to the specified number of resources. |
| offset |  ``` Optional ```  | Skip the specified number of resources in the result set. |


#### Example Usage

```java
String name = "name";
String nameStartsWith = "nameStartsWith";
String modifiedSince = "modifiedSince";
String comics = "comics";
String series = "series";
String events = "events";
String stories = "stories";
String orderBy = "name";
String limit = "limit";
String offset = "offset";
// Invoking the API call with sample inputs
characters.getCharacterCollectionAsync(name, nameStartsWith, modifiedSince, comics, series, events, stories, orderBy, limit, offset, new APICallBack<CharacterDataWrapper>() {
    public void onSuccess(HttpContext context, CharacterDataWrapper response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 409 | Limit greater than 100. |



[Back to List of Controllers](#list_of_controllers)

### <a name="comics_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.marvel.gateway.controllers.ComicsController") ComicsController

#### Get singleton instance

The singleton instance of the ``` ComicsController ``` class can be accessed from the API Client.

```java
ComicsController comics = client.getComics();
```

#### <a name="get_comic_character_collection_async"></a>![Method: ](https://apidocs.io/img/method.png "com.marvel.gateway.controllers.ComicsController.getComicCharacterCollectionAsync") getComicCharacterCollectionAsync

> Fetches lists of characters filtered by a comic id.


```java
void getComicCharacterCollectionAsync(
        final String comicId,
        final String name,
        final String nameStartsWith,
        final String modifiedSince,
        final String series,
        final String events,
        final String stories,
        final String orderBy,
        final String limit,
        final String offset,
        final APICallBack<CharacterDataWrapper> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| comicId |  ``` Required ```  | A single comic. |
| name |  ``` Optional ```  | Return only characters matching the specified full character name (e.g. Spider-Man). |
| nameStartsWith |  ``` Optional ```  | Return characters with names that begin with the specified string (e.g. Sp). |
| modifiedSince |  ``` Optional ```  | Return only characters which have been modified since the specified date. |
| series |  ``` Optional ```  | Return only characters which appear the specified series (accepts a comma-separated list of ids). |
| events |  ``` Optional ```  | Return only characters which appear comics that took place in the specified events (accepts a comma-separated list of ids). |
| stories |  ``` Optional ```  | Return only characters which appear the specified stories (accepts a comma-separated list of ids). |
| orderBy |  ``` Optional ```  | Order the result set by a field or fields. Add a "-" to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (Acceptable values are: "name", "modified", "-name", "-modified") |
| limit |  ``` Optional ```  | Limit the result set to the specified number of resources. |
| offset |  ``` Optional ```  | Skip the specified number of resources in the result set. |


#### Example Usage

```java
String comicId = "comicId";
String name = "name";
String nameStartsWith = "nameStartsWith";
String modifiedSince = "modifiedSince";
String series = "series";
String events = "events";
String stories = "stories";
String orderBy = "orderBy";
String limit = "limit";
String offset = "offset";
// Invoking the API call with sample inputs
comics.getComicCharacterCollectionAsync(comicId, name, nameStartsWith, modifiedSince, series, events, stories, orderBy, limit, offset, new APICallBack<CharacterDataWrapper>() {
    public void onSuccess(HttpContext context, CharacterDataWrapper response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 409 | Limit greater than 100. |



#### <a name="get_creator_collection_by_comic_id_async"></a>![Method: ](https://apidocs.io/img/method.png "com.marvel.gateway.controllers.ComicsController.getCreatorCollectionByComicIdAsync") getCreatorCollectionByComicIdAsync

> Fetches lists of creators filtered by a comic id.


```java
void getCreatorCollectionByComicIdAsync(
        final String comicId,
        final String firstName,
        final String middleName,
        final String lastName,
        final String suffix,
        final String nameStartsWith,
        final String firstNameStartsWith,
        final String middleNameStartsWith,
        final String lastNameStartsWith,
        final String modifiedSince,
        final String comics,
        final String series,
        final String stories,
        final String orderBy,
        final String limit,
        final String offset,
        final APICallBack<CreatorDataWrapper> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| comicId |  ``` Required ```  | A single comic. |
| firstName |  ``` Optional ```  | Filter by creator first name (e.g. brian). |
| middleName |  ``` Optional ```  | Filter by creator middle name (e.g. Michael). |
| lastName |  ``` Optional ```  | Filter by creator last name (e.g. Bendis). |
| suffix |  ``` Optional ```  | Filter by suffix or honorific (e.g. Jr., Sr.). |
| nameStartsWith |  ``` Optional ```  | Filter by creator names that match critera (e.g. B, St L). |
| firstNameStartsWith |  ``` Optional ```  | Filter by creator first names that match critera (e.g. B, St L). |
| middleNameStartsWith |  ``` Optional ```  | Filter by creator middle names that match critera (e.g. Mi). |
| lastNameStartsWith |  ``` Optional ```  | Filter by creator last names that match critera (e.g. Ben). |
| modifiedSince |  ``` Optional ```  | Return only creators which have been modified since the specified date. |
| comics |  ``` Optional ```  | Return only creators who worked on in the specified comics (accepts a comma-separated list of ids). |
| series |  ``` Optional ```  | Return only creators who worked on the specified series (accepts a comma-separated list of ids). |
| stories |  ``` Optional ```  | Return only creators who worked on the specified stories (accepts a comma-separated list of ids). |
| orderBy |  ``` Optional ```  | Order the result set by a field or fields. Add a "-" to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (Acceptable values are: "lastName", "firstName", "middleName", "suffix", "modified", "-lastName", "-firstName", "-middleName", "-suffix", "-modified") |
| limit |  ``` Optional ```  | Limit the result set to the specified number of resources. |
| offset |  ``` Optional ```  | Skip the specified number of resources in the result set. |


#### Example Usage

```java
String comicId = "comicId";
String firstName = "firstName";
String middleName = "middleName";
String lastName = "lastName";
String suffix = "suffix";
String nameStartsWith = "nameStartsWith";
String firstNameStartsWith = "firstNameStartsWith";
String middleNameStartsWith = "middleNameStartsWith";
String lastNameStartsWith = "lastNameStartsWith";
String modifiedSince = "modifiedSince";
String comics = "comics";
String series = "series";
String stories = "stories";
String orderBy = "orderBy";
String limit = "limit";
String offset = "offset";
// Invoking the API call with sample inputs
comics.getCreatorCollectionByComicIdAsync(comicId, firstName, middleName, lastName, suffix, nameStartsWith, firstNameStartsWith, middleNameStartsWith, lastNameStartsWith, modifiedSince, comics, series, stories, orderBy, limit, offset, new APICallBack<CreatorDataWrapper>() {
    public void onSuccess(HttpContext context, CreatorDataWrapper response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 409 | Limit greater than 100. |



#### <a name="get_issue_events_collection_async"></a>![Method: ](https://apidocs.io/img/method.png "com.marvel.gateway.controllers.ComicsController.getIssueEventsCollectionAsync") getIssueEventsCollectionAsync

> Fetches lists of events filtered by a comic id.


```java
void getIssueEventsCollectionAsync(
        final String comicId,
        final String name,
        final String nameStartsWith,
        final String modifiedSince,
        final String creators,
        final String characters,
        final String series,
        final String stories,
        final String orderBy,
        final String limit,
        final String offset,
        final APICallBack<EventDataWrapper> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| comicId |  ``` Required ```  | A single comic. |
| name |  ``` Optional ```  | Filter the event list by name. |
| nameStartsWith |  ``` Optional ```  | Return events with names that begin with the specified string (e.g. Sp). |
| modifiedSince |  ``` Optional ```  | Return only events which have been modified since the specified date. |
| creators |  ``` Optional ```  | Return only events which feature work by the specified creators (accepts a comma-separated list of ids). |
| characters |  ``` Optional ```  | Return only events which feature the specified characters (accepts a comma-separated list of ids). |
| series |  ``` Optional ```  | Return only events which are part of the specified series (accepts a comma-separated list of ids). |
| stories |  ``` Optional ```  | Return only events which contain the specified stories (accepts a comma-separated list of ids). |
| orderBy |  ``` Optional ```  | Order the result set by a field or fields. Add a "-" to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (Acceptable values are: "name", "startDate", "modified", "-name", "-startDate", "-modified") |
| limit |  ``` Optional ```  | Limit the result set to the specified number of resources. |
| offset |  ``` Optional ```  | Skip the specified number of resources in the result set. |


#### Example Usage

```java
String comicId = "comicId";
String name = "name";
String nameStartsWith = "nameStartsWith";
String modifiedSince = "modifiedSince";
String creators = "creators";
String characters = "characters";
String series = "series";
String stories = "stories";
String orderBy = "orderBy";
String limit = "limit";
String offset = "offset";
// Invoking the API call with sample inputs
comics.getIssueEventsCollectionAsync(comicId, name, nameStartsWith, modifiedSince, creators, characters, series, stories, orderBy, limit, offset, new APICallBack<EventDataWrapper>() {
    public void onSuccess(HttpContext context, EventDataWrapper response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 409 | Limit greater than 100. |



#### <a name="get_comic_story_collection_by_comic_id_async"></a>![Method: ](https://apidocs.io/img/method.png "com.marvel.gateway.controllers.ComicsController.getComicStoryCollectionByComicIdAsync") getComicStoryCollectionByComicIdAsync

> Fetches lists of stories filtered by a comic id.


```java
void getComicStoryCollectionByComicIdAsync(
        final String comicId,
        final String modifiedSince,
        final String series,
        final String events,
        final String creators,
        final String characters,
        final String orderBy,
        final String limit,
        final String offset,
        final APICallBack<StoryDataWrapper> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| comicId |  ``` Required ```  | A single comic. |
| modifiedSince |  ``` Optional ```  | Return only stories which have been modified since the specified date. |
| series |  ``` Optional ```  | Return only stories contained the specified series (accepts a comma-separated list of ids). |
| events |  ``` Optional ```  | Return only stories which take place during the specified events (accepts a comma-separated list of ids). |
| creators |  ``` Optional ```  | Return only stories which feature work by the specified creators (accepts a comma-separated list of ids). |
| characters |  ``` Optional ```  | Return only stories which feature the specified characters (accepts a comma-separated list of ids). |
| orderBy |  ``` Optional ```  | Order the result set by a field or fields. Add a "-" to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (Acceptable values are: "id", "modified", "-id", "-modified") |
| limit |  ``` Optional ```  | Limit the result set to the specified number of resources. |
| offset |  ``` Optional ```  | Skip the specified number of resources. |


#### Example Usage

```java
String comicId = "comicId";
String modifiedSince = "modifiedSince";
String series = "series";
String events = "events";
String creators = "creators";
String characters = "characters";
String orderBy = "orderBy";
String limit = "limit";
String offset = "offset";
// Invoking the API call with sample inputs
comics.getComicStoryCollectionByComicIdAsync(comicId, modifiedSince, series, events, creators, characters, orderBy, limit, offset, new APICallBack<StoryDataWrapper>() {
    public void onSuccess(HttpContext context, StoryDataWrapper response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 409 | Limit greater than 100. |



#### <a name="get_comic_individual_async"></a>![Method: ](https://apidocs.io/img/method.png "com.marvel.gateway.controllers.ComicsController.getComicIndividualAsync") getComicIndividualAsync

> Fetches a single comic by id.


```java
void getComicIndividualAsync(
        final String comicId,
        final APICallBack<Comic> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| comicId |  ``` Required ```  | A single comic. |


#### Example Usage

```java
String comicId = "comicId";
// Invoking the API call with sample inputs
comics.getComicIndividualAsync(comicId, new APICallBack<Comic>() {
    public void onSuccess(HttpContext context, Comic response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 404 | Comic not found. |



#### <a name="get_comics_collection_async"></a>![Method: ](https://apidocs.io/img/method.png "com.marvel.gateway.controllers.ComicsController.getComicsCollectionAsync") getComicsCollectionAsync

> Fetches lists of comics.


```java
void getComicsCollectionAsync(
        final String format,
        final FormatTypeEnum formatType,
        final String noVariants,
        final DateDescriptorEnum dateDescriptor,
        final String dateRange,
        final String title,
        final String titleStartsWith,
        final String startYear,
        final String issueNumber,
        final String diamondCode,
        final String digitalId,
        final String upc,
        final String isbn,
        final String ean,
        final String issn,
        final String hasDigitalIssue,
        final String modifiedSince,
        final String creators,
        final String characters,
        final String series,
        final String events,
        final String stories,
        final String sharedAppearances,
        final String collaborators,
        final String orderBy,
        final String limit,
        final String offset,
        final APICallBack<ComicDataWrapper> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| format |  ``` Optional ```  | Filter by the issue format (e.g. comic, digital comic, hardcover). (Acceptable values are: "comic", "magazine", "trade paperback", "hardcover", "digest", "graphic novel", "digital comic", "infinite comic") |
| formatType |  ``` Optional ```  | Filter by the issue format type (comic or collection). |
| noVariants |  ``` Optional ```  | Exclude variants (alternate covers, secondary printings, director's cuts, etc.) from the result set. (Acceptable values are: "true") |
| dateDescriptor |  ``` Optional ```  | Return comics within a predefined date range. |
| dateRange |  ``` Optional ```  | Return comics within a predefined date range.  Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02).  Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format. |
| title |  ``` Optional ```  | Return only issues in series whose title matches the input. |
| titleStartsWith |  ``` Optional ```  | Return only issues in series whose title starts with the input. |
| startYear |  ``` Optional ```  | Return only issues in series whose start year matches the input. |
| issueNumber |  ``` Optional ```  | Return only issues in series whose issue number matches the input. |
| diamondCode |  ``` Optional ```  | Filter by diamond code. |
| digitalId |  ``` Optional ```  | Filter by digital comic id. |
| upc |  ``` Optional ```  | Filter by UPC. |
| isbn |  ``` Optional ```  | Filter by ISBN. |
| ean |  ``` Optional ```  | Filter by EAN. |
| issn |  ``` Optional ```  | Filter by ISSN. |
| hasDigitalIssue |  ``` Optional ```  | Include only results which are available digitally. (Acceptable values are: "true") |
| modifiedSince |  ``` Optional ```  | Return only comics which have been modified since the specified date. |
| creators |  ``` Optional ```  | Return only comics which feature work by the specified creators (accepts a comma-separated list of ids). |
| characters |  ``` Optional ```  | Return only comics which feature the specified characters (accepts a comma-separated list of ids). |
| series |  ``` Optional ```  | Return only comics which are part of the specified series (accepts a comma-separated list of ids). |
| events |  ``` Optional ```  | Return only comics which take place in the specified events (accepts a comma-separated list of ids). |
| stories |  ``` Optional ```  | Return only comics which contain the specified stories (accepts a comma-separated list of ids). |
| sharedAppearances |  ``` Optional ```  | Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear). Accepts a comma-separated list of ids. |
| collaborators |  ``` Optional ```  | Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work). Accepts a comma-separated list of ids. |
| orderBy |  ``` Optional ```  | Order the result set by a field or fields. Add a "-" to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (Acceptable values are: "focDate", "onsaleDate", "title", "issueNumber", "modified", "-focDate", "-onsaleDate", "-title", "-issueNumber", "-modified") |
| limit |  ``` Optional ```  | Limit the result set to the specified number of resources. |
| offset |  ``` Optional ```  | Skip the specified number of resources in the result set. |


#### Example Usage

```java
String format = "comic";
FormatTypeEnum formatType = FormatTypeEnum.fromString("collection");
String noVariants = "true";
DateDescriptorEnum dateDescriptor = DateDescriptorEnum.fromString("lastWeek");
String dateRange = "dateRange";
String title = "title";
String titleStartsWith = "titleStartsWith";
String startYear = "startYear";
String issueNumber = "issueNumber";
String diamondCode = "diamondCode";
String digitalId = "digitalId";
String upc = "upc";
String isbn = "isbn";
String ean = "ean";
String issn = "issn";
String hasDigitalIssue = "true";
String modifiedSince = "modifiedSince";
String creators = "creators";
String characters = "characters";
String series = "series";
String events = "events";
String stories = "stories";
String sharedAppearances = "sharedAppearances";
String collaborators = "collaborators";
String orderBy = "focDate";
String limit = "limit";
String offset = "offset";
// Invoking the API call with sample inputs
comics.getComicsCollectionAsync(format, formatType, noVariants, dateDescriptor, dateRange, title, titleStartsWith, startYear, issueNumber, diamondCode, digitalId, upc, isbn, ean, issn, hasDigitalIssue, modifiedSince, creators, characters, series, events, stories, sharedAppearances, collaborators, orderBy, limit, offset, new APICallBack<ComicDataWrapper>() {
    public void onSuccess(HttpContext context, ComicDataWrapper response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 409 | Limit greater than 100. |



[Back to List of Controllers](#list_of_controllers)

### <a name="creators_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.marvel.gateway.controllers.CreatorsController") CreatorsController

#### Get singleton instance

The singleton instance of the ``` CreatorsController ``` class can be accessed from the API Client.

```java
CreatorsController creators = client.getCreators();
```

#### <a name="get_comics_collection_by_creator_id_async"></a>![Method: ](https://apidocs.io/img/method.png "com.marvel.gateway.controllers.CreatorsController.getComicsCollectionByCreatorIdAsync") getComicsCollectionByCreatorIdAsync

> Fetches lists of comics filtered by a creator id.


```java
void getComicsCollectionByCreatorIdAsync(
        final String creatorId,
        final String format,
        final FormatTypeEnum formatType,
        final String noVariants,
        final DateDescriptorEnum dateDescriptor,
        final String dateRange,
        final String title,
        final String titleStartsWith,
        final String startYear,
        final String issueNumber,
        final String diamondCode,
        final String digitalId,
        final String upc,
        final String isbn,
        final String ean,
        final String issn,
        final String hasDigitalIssue,
        final String modifiedSince,
        final String characters,
        final String series,
        final String events,
        final String stories,
        final String sharedAppearances,
        final String collaborators,
        final String orderBy,
        final String limit,
        final String offset,
        final APICallBack<ComicDataWrapper> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| creatorId |  ``` Required ```  | A single creator id. |
| format |  ``` Optional ```  | Filter by the issue format (e.g. comic, digital comic, hardcover). (Acceptable values are: "comic", "magazine", "trade paperback", "hardcover", "digest", "graphic novel", "digital comic", "infinite comic") |
| formatType |  ``` Optional ```  | Filter by the issue format type (comic or collection). |
| noVariants |  ``` Optional ```  | Exclude variant comics from the result set. (Acceptable values are: "true") |
| dateDescriptor |  ``` Optional ```  | Return comics within a predefined date range. |
| dateRange |  ``` Optional ```  | Return comics within a predefined date range.  Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02).  Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format. |
| title |  ``` Optional ```  | Return only issues in series whose title matches the input. |
| titleStartsWith |  ``` Optional ```  | Return only issues in series whose title starts with the input. |
| startYear |  ``` Optional ```  | Return only issues in series whose start year matches the input. |
| issueNumber |  ``` Optional ```  | Return only issues in series whose issue number matches the input. |
| diamondCode |  ``` Optional ```  | Filter by diamond code. |
| digitalId |  ``` Optional ```  | Filter by digital comic id. |
| upc |  ``` Optional ```  | Filter by UPC. |
| isbn |  ``` Optional ```  | Filter by ISBN. |
| ean |  ``` Optional ```  | Filter by EAN. |
| issn |  ``` Optional ```  | Filter by ISSN. |
| hasDigitalIssue |  ``` Optional ```  | Include only results which are available digitally. (Acceptable values are: "true") |
| modifiedSince |  ``` Optional ```  | Return only comics which have been modified since the specified date. |
| characters |  ``` Optional ```  | Return only comics which feature the specified characters (accepts a comma-separated list of ids). |
| series |  ``` Optional ```  | Return only comics which are part of the specified series (accepts a comma-separated list of ids). |
| events |  ``` Optional ```  | Return only comics which take place in the specified events (accepts a comma-separated list of ids). |
| stories |  ``` Optional ```  | Return only comics which contain the specified stories (accepts a comma-separated list of ids). |
| sharedAppearances |  ``` Optional ```  | Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear). |
| collaborators |  ``` Optional ```  | Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work). |
| orderBy |  ``` Optional ```  | Order the result set by a field or fields. Add a "-" to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (Acceptable values are: "focDate", "onsaleDate", "title", "issueNumber", "modified", "-focDate", "-onsaleDate", "-title", "-issueNumber", "-modified") |
| limit |  ``` Optional ```  | Limit the result set to the specified number of resources. |
| offset |  ``` Optional ```  | Skip the specified number of resources in the result set. |


#### Example Usage

```java
String creatorId = "creatorId";
String format = "format";
FormatTypeEnum formatType = FormatTypeEnum.fromString("collection");
String noVariants = "noVariants";
DateDescriptorEnum dateDescriptor = DateDescriptorEnum.fromString("lastWeek");
String dateRange = "dateRange";
String title = "title";
String titleStartsWith = "titleStartsWith";
String startYear = "startYear";
String issueNumber = "issueNumber";
String diamondCode = "diamondCode";
String digitalId = "digitalId";
String upc = "upc";
String isbn = "isbn";
String ean = "ean";
String issn = "issn";
String hasDigitalIssue = "hasDigitalIssue";
String modifiedSince = "modifiedSince";
String characters = "characters";
String series = "series";
String events = "events";
String stories = "stories";
String sharedAppearances = "sharedAppearances";
String collaborators = "collaborators";
String orderBy = "orderBy";
String limit = "limit";
String offset = "offset";
// Invoking the API call with sample inputs
creators.getComicsCollectionByCreatorIdAsync(creatorId, format, formatType, noVariants, dateDescriptor, dateRange, title, titleStartsWith, startYear, issueNumber, diamondCode, digitalId, upc, isbn, ean, issn, hasDigitalIssue, modifiedSince, characters, series, events, stories, sharedAppearances, collaborators, orderBy, limit, offset, new APICallBack<ComicDataWrapper>() {
    public void onSuccess(HttpContext context, ComicDataWrapper response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 409 | Limit greater than 100. |



#### <a name="get_creator_events_collection_async"></a>![Method: ](https://apidocs.io/img/method.png "com.marvel.gateway.controllers.CreatorsController.getCreatorEventsCollectionAsync") getCreatorEventsCollectionAsync

> Fetches lists of events filtered by a creator id.


```java
void getCreatorEventsCollectionAsync(
        final String creatorId,
        final String name,
        final String nameStartsWith,
        final String modifiedSince,
        final String characters,
        final String series,
        final String comics,
        final String stories,
        final String orderBy,
        final String limit,
        final String offset,
        final APICallBack<EventDataWrapper> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| creatorId |  ``` Required ```  | A single creator id. |
| name |  ``` Optional ```  | Filter the event list by name. |
| nameStartsWith |  ``` Optional ```  | Return events with names that begin with the specified string (e.g. Sp). |
| modifiedSince |  ``` Optional ```  | Return only events which have been modified since the specified date. |
| characters |  ``` Optional ```  | Return only events which feature the specified characters (accepts a comma-separated list of ids). |
| series |  ``` Optional ```  | Return only events which are part of the specified series (accepts a comma-separated list of ids). |
| comics |  ``` Optional ```  | Return only events which take place in the specified comics (accepts a comma-separated list of ids). |
| stories |  ``` Optional ```  | Return only events which contain the specified stories (accepts a comma-separated list of ids). |
| orderBy |  ``` Optional ```  | Order the result set by a field or fields. Add a "-" to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (Acceptable values are: "name", "startDate", "modified", "-name", "-startDate", "-modified") |
| limit |  ``` Optional ```  | Limit the result set to the specified number of resources. |
| offset |  ``` Optional ```  | Skip the specified number of resources in the result set. |


#### Example Usage

```java
String creatorId = "creatorId";
String name = "name";
String nameStartsWith = "nameStartsWith";
String modifiedSince = "modifiedSince";
String characters = "characters";
String series = "series";
String comics = "comics";
String stories = "stories";
String orderBy = "orderBy";
String limit = "limit";
String offset = "offset";
// Invoking the API call with sample inputs
creators.getCreatorEventsCollectionAsync(creatorId, name, nameStartsWith, modifiedSince, characters, series, comics, stories, orderBy, limit, offset, new APICallBack<EventDataWrapper>() {
    public void onSuccess(HttpContext context, EventDataWrapper response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 409 | Limit greater than 100. |



#### <a name="get_creator_series_collection_async"></a>![Method: ](https://apidocs.io/img/method.png "com.marvel.gateway.controllers.CreatorsController.getCreatorSeriesCollectionAsync") getCreatorSeriesCollectionAsync

> Fetches lists of series filtered by a creator id.


```java
void getCreatorSeriesCollectionAsync(
        final String creatorId,
        final String title,
        final String titleStartsWith,
        final String startYear,
        final String modifiedSince,
        final String comics,
        final String stories,
        final String events,
        final String characters,
        final String seriesType,
        final String contains,
        final String orderBy,
        final String limit,
        final String offset,
        final APICallBack<SeriesDataWrapper> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| creatorId |  ``` Required ```  | A single creator id. |
| title |  ``` Optional ```  | Filter by series title. |
| titleStartsWith |  ``` Optional ```  | Return series with titles that begin with the specified string (e.g. Sp). |
| startYear |  ``` Optional ```  | Return only series matching the specified start year. |
| modifiedSince |  ``` Optional ```  | Return only series which have been modified since the specified date. |
| comics |  ``` Optional ```  | Return only series which contain the specified comics (accepts a comma-separated list of ids). |
| stories |  ``` Optional ```  | Return only series which contain the specified stories (accepts a comma-separated list of ids). |
| events |  ``` Optional ```  | Return only series which have comics that take place during the specified events (accepts a comma-separated list of ids). |
| characters |  ``` Optional ```  | Return only series which feature the specified characters (accepts a comma-separated list of ids). |
| seriesType |  ``` Optional ```  | Filter the series by publication frequency type. (Acceptable values are: "collection", "one shot", "limited", "ongoing") |
| contains |  ``` Optional ```  | Return only series containing one or more comics with the specified format. (Acceptable values are: "comic", "magazine", "trade paperback", "hardcover", "digest", "graphic novel", "digital comic", "infinite comic") |
| orderBy |  ``` Optional ```  | Order the result set by a field or fields. Add a "-" to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (Acceptable values are: "title", "modified", "startYear", "-title", "-modified", "-startYear") |
| limit |  ``` Optional ```  | Limit the result set to the specified number of resources. |
| offset |  ``` Optional ```  | Skip the specified number of resources in the result set. |


#### Example Usage

```java
String creatorId = "creatorId";
String title = "title";
String titleStartsWith = "titleStartsWith";
String startYear = "startYear";
String modifiedSince = "modifiedSince";
String comics = "comics";
String stories = "stories";
String events = "events";
String characters = "characters";
String seriesType = "seriesType";
String contains = "contains";
String orderBy = "orderBy";
String limit = "limit";
String offset = "offset";
// Invoking the API call with sample inputs
creators.getCreatorSeriesCollectionAsync(creatorId, title, titleStartsWith, startYear, modifiedSince, comics, stories, events, characters, seriesType, contains, orderBy, limit, offset, new APICallBack<SeriesDataWrapper>() {
    public void onSuccess(HttpContext context, SeriesDataWrapper response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 409 | Limit greater than 100. |



#### <a name="get_creator_story_collection_async"></a>![Method: ](https://apidocs.io/img/method.png "com.marvel.gateway.controllers.CreatorsController.getCreatorStoryCollectionAsync") getCreatorStoryCollectionAsync

> Fetches lists of stories filtered by a creator id.


```java
void getCreatorStoryCollectionAsync(
        final String creatorId,
        final String modifiedSince,
        final String comics,
        final String series,
        final String events,
        final String characters,
        final String orderBy,
        final String limit,
        final String offset,
        final APICallBack<StoryDataWrapper> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| creatorId |  ``` Required ```  | A single creator id. |
| modifiedSince |  ``` Optional ```  | Return only stories which have been modified since the specified date. |
| comics |  ``` Optional ```  | Return only stories contained in the specified comics (accepts a comma-separated list of ids). |
| series |  ``` Optional ```  | Return only stories contained the specified series (accepts a comma-separated list of ids). |
| events |  ``` Optional ```  | Return only stories which take place during the specified events (accepts a comma-separated list of ids). |
| characters |  ``` Optional ```  | Return only stories which feature the specified characters (accepts a comma-separated list of ids). |
| orderBy |  ``` Optional ```  | Order the result set by a field or fields. Add a "-" to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (Acceptable values are: "id", "modified", "-id", "-modified") |
| limit |  ``` Optional ```  | Limit the result set to the specified number of resources. |
| offset |  ``` Optional ```  | Skip the specified number of resources in the result set. |


#### Example Usage

```java
String creatorId = "creatorId";
String modifiedSince = "modifiedSince";
String comics = "comics";
String series = "series";
String events = "events";
String characters = "characters";
String orderBy = "orderBy";
String limit = "limit";
String offset = "offset";
// Invoking the API call with sample inputs
creators.getCreatorStoryCollectionAsync(creatorId, modifiedSince, comics, series, events, characters, orderBy, limit, offset, new APICallBack<StoryDataWrapper>() {
    public void onSuccess(HttpContext context, StoryDataWrapper response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 409 | Limit greater than 100. |



#### <a name="get_creator_individual_async"></a>![Method: ](https://apidocs.io/img/method.png "com.marvel.gateway.controllers.CreatorsController.getCreatorIndividualAsync") getCreatorIndividualAsync

> Fetches a single creator by id.


```java
void getCreatorIndividualAsync(
        final String creatorId,
        final APICallBack<Creator> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| creatorId |  ``` Required ```  | A single creator id. |


#### Example Usage

```java
String creatorId = "creatorId";
// Invoking the API call with sample inputs
creators.getCreatorIndividualAsync(creatorId, new APICallBack<Creator>() {
    public void onSuccess(HttpContext context, Creator response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 404 | Creator not found. |



#### <a name="get_creator_collection_async"></a>![Method: ](https://apidocs.io/img/method.png "com.marvel.gateway.controllers.CreatorsController.getCreatorCollectionAsync") getCreatorCollectionAsync

> Fetches lists of creators.


```java
void getCreatorCollectionAsync(
        final String firstName,
        final String middleName,
        final String lastName,
        final String suffix,
        final String nameStartsWith,
        final String firstNameStartsWith,
        final String middleNameStartsWith,
        final String lastNameStartsWith,
        final String modifiedSince,
        final String comics,
        final String series,
        final String events,
        final String stories,
        final String orderBy,
        final String limit,
        final String offset,
        final APICallBack<CreatorDataWrapper> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| firstName |  ``` Optional ```  | Filter by creator first name (e.g. Brian). |
| middleName |  ``` Optional ```  | Filter by creator middle name (e.g. Michael). |
| lastName |  ``` Optional ```  | Filter by creator last name (e.g. Bendis). |
| suffix |  ``` Optional ```  | Filter by suffix or honorific (e.g. Jr., Sr.). |
| nameStartsWith |  ``` Optional ```  | Filter by creator names that match critera (e.g. B, St L). |
| firstNameStartsWith |  ``` Optional ```  | Filter by creator first names that match critera (e.g. B, St L). |
| middleNameStartsWith |  ``` Optional ```  | Filter by creator middle names that match critera (e.g. Mi). |
| lastNameStartsWith |  ``` Optional ```  | Filter by creator last names that match critera (e.g. Ben). |
| modifiedSince |  ``` Optional ```  | Return only creators which have been modified since the specified date. |
| comics |  ``` Optional ```  | Return only creators who worked on in the specified comics (accepts a comma-separated list of ids). |
| series |  ``` Optional ```  | Return only creators who worked on the specified series (accepts a comma-separated list of ids). |
| events |  ``` Optional ```  | Return only creators who worked on comics that took place in the specified events (accepts a comma-separated list of ids). |
| stories |  ``` Optional ```  | Return only creators who worked on the specified stories (accepts a comma-separated list of ids). |
| orderBy |  ``` Optional ```  | Order the result set by a field or fields. Add a "-" to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (Acceptable values are: "lastName", "firstName", "middleName", "suffix", "modified", "-lastName", "-firstName", "-middleName", "-suffix", "-modified") |
| limit |  ``` Optional ```  | Limit the result set to the specified number of resources. |
| offset |  ``` Optional ```  | Skip the specified number of resources in the result set. |


#### Example Usage

```java
String firstName = "firstName";
String middleName = "middleName";
String lastName = "lastName";
String suffix = "suffix";
String nameStartsWith = "nameStartsWith";
String firstNameStartsWith = "firstNameStartsWith";
String middleNameStartsWith = "middleNameStartsWith";
String lastNameStartsWith = "lastNameStartsWith";
String modifiedSince = "modifiedSince";
String comics = "comics";
String series = "series";
String events = "events";
String stories = "stories";
String orderBy = "lastName";
String limit = "limit";
String offset = "offset";
// Invoking the API call with sample inputs
creators.getCreatorCollectionAsync(firstName, middleName, lastName, suffix, nameStartsWith, firstNameStartsWith, middleNameStartsWith, lastNameStartsWith, modifiedSince, comics, series, events, stories, orderBy, limit, offset, new APICallBack<CreatorDataWrapper>() {
    public void onSuccess(HttpContext context, CreatorDataWrapper response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 409 | Limit greater than 100. |



[Back to List of Controllers](#list_of_controllers)

### <a name="events_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.marvel.gateway.controllers.EventsController") EventsController

#### Get singleton instance

The singleton instance of the ``` EventsController ``` class can be accessed from the API Client.

```java
EventsController events = client.getEvents();
```

#### <a name="get_event_character_collection_async"></a>![Method: ](https://apidocs.io/img/method.png "com.marvel.gateway.controllers.EventsController.getEventCharacterCollectionAsync") getEventCharacterCollectionAsync

> Fetches lists of characters filtered by an event id.


```java
void getEventCharacterCollectionAsync(
        final String eventId,
        final String name,
        final String nameStartsWith,
        final String modifiedSince,
        final String comics,
        final String series,
        final String stories,
        final String orderBy,
        final String limit,
        final String offset,
        final APICallBack<CharacterDataWrapper> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| eventId |  ``` Required ```  | A single event. |
| name |  ``` Optional ```  | Return only characters matching the specified full character name (e.g. Spider-Man). |
| nameStartsWith |  ``` Optional ```  | Return characters with names that begin with the specified string (e.g. Sp). |
| modifiedSince |  ``` Optional ```  | Return only characters which have been modified since the specified date. |
| comics |  ``` Optional ```  | Return only characters which appear in the specified comics (accepts a comma-separated list of ids). |
| series |  ``` Optional ```  | Return only characters which appear the specified series (accepts a comma-separated list of ids). |
| stories |  ``` Optional ```  | Return only characters which appear the specified stories (accepts a comma-separated list of ids). |
| orderBy |  ``` Optional ```  | Order the result set by a field or fields. Add a "-" to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (Acceptable values are: "name", "modified", "-name", "-modified") |
| limit |  ``` Optional ```  | Limit the result set to the specified number of resources. |
| offset |  ``` Optional ```  | Skip the specified number of resources in the result set. |


#### Example Usage

```java
String eventId = "eventId";
String name = "name";
String nameStartsWith = "nameStartsWith";
String modifiedSince = "modifiedSince";
String comics = "comics";
String series = "series";
String stories = "stories";
String orderBy = "orderBy";
String limit = "limit";
String offset = "offset";
// Invoking the API call with sample inputs
events.getEventCharacterCollectionAsync(eventId, name, nameStartsWith, modifiedSince, comics, series, stories, orderBy, limit, offset, new APICallBack<CharacterDataWrapper>() {
    public void onSuccess(HttpContext context, CharacterDataWrapper response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 409 | Limit greater than 100. |



#### <a name="get_comics_collection_by_event_id_async"></a>![Method: ](https://apidocs.io/img/method.png "com.marvel.gateway.controllers.EventsController.getComicsCollectionByEventIdAsync") getComicsCollectionByEventIdAsync

> Fetches lists of comics filtered by an event id.


```java
void getComicsCollectionByEventIdAsync(
        final String eventId,
        final String format,
        final FormatTypeEnum formatType,
        final String noVariants,
        final DateDescriptorEnum dateDescriptor,
        final String dateRange,
        final String title,
        final String titleStartsWith,
        final String startYear,
        final String issueNumber,
        final String diamondCode,
        final String digitalId,
        final String upc,
        final String isbn,
        final String ean,
        final String issn,
        final String hasDigitalIssue,
        final String modifiedSince,
        final String creators,
        final String characters,
        final String series,
        final String events,
        final String stories,
        final String sharedAppearances,
        final String collaborators,
        final String orderBy,
        final String limit,
        final String offset,
        final APICallBack<ComicDataWrapper> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| eventId |  ``` Required ```  | A single event. |
| format |  ``` Optional ```  | Filter by the issue format (e.g. comic, digital comic, hardcover). (Acceptable values are: "comic", "magazine", "trade paperback", "hardcover", "digest", "graphic novel", "digital comic", "infinite comic") |
| formatType |  ``` Optional ```  | Filter by the issue format type (comic or collection). |
| noVariants |  ``` Optional ```  | Exclude variant comics from the result set. (Acceptable values are: "true") |
| dateDescriptor |  ``` Optional ```  | Return comics within a predefined date range. |
| dateRange |  ``` Optional ```  | Return comics within a predefined date range.  Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02).  Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format. |
| title |  ``` Optional ```  | Return only issues in series whose title matches the input. |
| titleStartsWith |  ``` Optional ```  | Return only issues in series whose title starts with the input. |
| startYear |  ``` Optional ```  | Return only issues in series whose start year matches the input. |
| issueNumber |  ``` Optional ```  | Return only issues in series whose issue number matches the input. |
| diamondCode |  ``` Optional ```  | Filter by diamond code. |
| digitalId |  ``` Optional ```  | Filter by digital comic id. |
| upc |  ``` Optional ```  | Filter by UPC. |
| isbn |  ``` Optional ```  | Filter by ISBN. |
| ean |  ``` Optional ```  | Filter by EAN. |
| issn |  ``` Optional ```  | Filter by ISSN. |
| hasDigitalIssue |  ``` Optional ```  | Include only results which are available digitally. (Acceptable values are: "true") |
| modifiedSince |  ``` Optional ```  | Return only comics which have been modified since the specified date. |
| creators |  ``` Optional ```  | Return only comics which feature work by the specified creators (accepts a comma-separated list of ids). |
| characters |  ``` Optional ```  | Return only comics which feature the specified characters (accepts a comma-separated list of ids). |
| series |  ``` Optional ```  | Return only comics which are part of the specified series (accepts a comma-separated list of ids). |
| events |  ``` Optional ```  | Return only comics which take place in the specified events (accepts a comma-separated list of ids). |
| stories |  ``` Optional ```  | Return only comics which contain the specified stories (accepts a comma-separated list of ids). |
| sharedAppearances |  ``` Optional ```  | Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear). |
| collaborators |  ``` Optional ```  | Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work). |
| orderBy |  ``` Optional ```  | Order the result set by a field or fields. Add a "-" to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (Acceptable values are: "focDate", "onsaleDate", "title", "issueNumber", "modified", "-focDate", "-onsaleDate", "-title", "-issueNumber", "-modified") |
| limit |  ``` Optional ```  | Limit the result set to the specified number of resources. |
| offset |  ``` Optional ```  | Skip the specified number of resources in the result set. |


#### Example Usage

```java
String eventId = "eventId";
String format = "format";
FormatTypeEnum formatType = FormatTypeEnum.fromString("collection");
String noVariants = "noVariants";
DateDescriptorEnum dateDescriptor = DateDescriptorEnum.fromString("lastWeek");
String dateRange = "dateRange";
String title = "title";
String titleStartsWith = "titleStartsWith";
String startYear = "startYear";
String issueNumber = "issueNumber";
String diamondCode = "diamondCode";
String digitalId = "digitalId";
String upc = "upc";
String isbn = "isbn";
String ean = "ean";
String issn = "issn";
String hasDigitalIssue = "hasDigitalIssue";
String modifiedSince = "modifiedSince";
String creators = "creators";
String characters = "characters";
String series = "series";
String events = "events";
String stories = "stories";
String sharedAppearances = "sharedAppearances";
String collaborators = "collaborators";
String orderBy = "orderBy";
String limit = "limit";
String offset = "offset";
// Invoking the API call with sample inputs
events.getComicsCollectionByEventIdAsync(eventId, format, formatType, noVariants, dateDescriptor, dateRange, title, titleStartsWith, startYear, issueNumber, diamondCode, digitalId, upc, isbn, ean, issn, hasDigitalIssue, modifiedSince, creators, characters, series, events, stories, sharedAppearances, collaborators, orderBy, limit, offset, new APICallBack<ComicDataWrapper>() {
    public void onSuccess(HttpContext context, ComicDataWrapper response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 409 | Limit greater than 100. |



#### <a name="get_creator_collection_by_event_id_async"></a>![Method: ](https://apidocs.io/img/method.png "com.marvel.gateway.controllers.EventsController.getCreatorCollectionByEventIdAsync") getCreatorCollectionByEventIdAsync

> Fetches lists of creators filtered by an event id.


```java
void getCreatorCollectionByEventIdAsync(
        final String eventId,
        final String firstName,
        final String middleName,
        final String lastName,
        final String suffix,
        final String nameStartsWith,
        final String firstNameStartsWith,
        final String middleNameStartsWith,
        final String lastNameStartsWith,
        final String modifiedSince,
        final String comics,
        final String series,
        final String stories,
        final String orderBy,
        final String limit,
        final String offset,
        final APICallBack<CreatorDataWrapper> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| eventId |  ``` Required ```  | A single event. |
| firstName |  ``` Optional ```  | Filter by creator first name (e.g. brian). |
| middleName |  ``` Optional ```  | Filter by creator middle name (e.g. Michael). |
| lastName |  ``` Optional ```  | Filter by creator last name (e.g. Bendis). |
| suffix |  ``` Optional ```  | Filter by suffix or honorific (e.g. Jr., Sr.). |
| nameStartsWith |  ``` Optional ```  | Filter by creator names that match critera (e.g. B, St L). |
| firstNameStartsWith |  ``` Optional ```  | Filter by creator first names that match critera (e.g. B, St L). |
| middleNameStartsWith |  ``` Optional ```  | Filter by creator middle names that match critera (e.g. Mi). |
| lastNameStartsWith |  ``` Optional ```  | Filter by creator last names that match critera (e.g. Ben). |
| modifiedSince |  ``` Optional ```  | Return only creators which have been modified since the specified date. |
| comics |  ``` Optional ```  | Return only creators who worked on in the specified comics (accepts a comma-separated list of ids). |
| series |  ``` Optional ```  | Return only creators who worked on the specified series (accepts a comma-separated list of ids). |
| stories |  ``` Optional ```  | Return only creators who worked on the specified stories (accepts a comma-separated list of ids). |
| orderBy |  ``` Optional ```  | Order the result set by a field or fields. Add a "-" to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (Acceptable values are: "lastName", "firstName", "middleName", "suffix", "modified", "-lastName", "-firstName", "-middleName", "-suffix", "-modified") |
| limit |  ``` Optional ```  | Limit the result set to the specified number of resources. |
| offset |  ``` Optional ```  | Skip the specified number of resources in the result set. |


#### Example Usage

```java
String eventId = "eventId";
String firstName = "firstName";
String middleName = "middleName";
String lastName = "lastName";
String suffix = "suffix";
String nameStartsWith = "nameStartsWith";
String firstNameStartsWith = "firstNameStartsWith";
String middleNameStartsWith = "middleNameStartsWith";
String lastNameStartsWith = "lastNameStartsWith";
String modifiedSince = "modifiedSince";
String comics = "comics";
String series = "series";
String stories = "stories";
String orderBy = "orderBy";
String limit = "limit";
String offset = "offset";
// Invoking the API call with sample inputs
events.getCreatorCollectionByEventIdAsync(eventId, firstName, middleName, lastName, suffix, nameStartsWith, firstNameStartsWith, middleNameStartsWith, lastNameStartsWith, modifiedSince, comics, series, stories, orderBy, limit, offset, new APICallBack<CreatorDataWrapper>() {
    public void onSuccess(HttpContext context, CreatorDataWrapper response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 409 | Limit greater than 100. |



#### <a name="get_event_series_collection_async"></a>![Method: ](https://apidocs.io/img/method.png "com.marvel.gateway.controllers.EventsController.getEventSeriesCollectionAsync") getEventSeriesCollectionAsync

> Fetches lists of series filtered by an event id.


```java
void getEventSeriesCollectionAsync(
        final String eventId,
        final String title,
        final String titleStartsWith,
        final String startYear,
        final String modifiedSince,
        final String comics,
        final String stories,
        final String creators,
        final String characters,
        final String seriesType,
        final String contains,
        final String orderBy,
        final String limit,
        final String offset,
        final APICallBack<SeriesDataWrapper> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| eventId |  ``` Required ```  | A single event. |
| title |  ``` Optional ```  | Filter by series title. |
| titleStartsWith |  ``` Optional ```  | Return series with titles that begin with the specified string (e.g. Sp). |
| startYear |  ``` Optional ```  | Return only series matching the specified start year. |
| modifiedSince |  ``` Optional ```  | Return only series which have been modified since the specified date. |
| comics |  ``` Optional ```  | Return only series which contain the specified comics (accepts a comma-separated list of ids). |
| stories |  ``` Optional ```  | Return only series which contain the specified stories (accepts a comma-separated list of ids). |
| creators |  ``` Optional ```  | Return only series which feature work by the specified creators (accepts a comma-separated list of ids). |
| characters |  ``` Optional ```  | Return only series which feature the specified characters (accepts a comma-separated list of ids). |
| seriesType |  ``` Optional ```  | Filter the series by publication frequency type. (Acceptable values are: "collection", "one shot", "limited", "ongoing") |
| contains |  ``` Optional ```  | Return only series containing one or more comics with the specified format. (Acceptable values are: "comic", "magazine", "trade paperback", "hardcover", "digest", "graphic novel", "digital comic", "infinite comic") |
| orderBy |  ``` Optional ```  | Order the result set by a field or fields. Add a "-" to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (Acceptable values are: "title", "modified", "startYear", "-title", "-modified", "-startYear") |
| limit |  ``` Optional ```  | Limit the result set to the specified number of resources. |
| offset |  ``` Optional ```  | Skip the specified number of resources in the result set. |


#### Example Usage

```java
String eventId = "eventId";
String title = "title";
String titleStartsWith = "titleStartsWith";
String startYear = "startYear";
String modifiedSince = "modifiedSince";
String comics = "comics";
String stories = "stories";
String creators = "creators";
String characters = "characters";
String seriesType = "seriesType";
String contains = "contains";
String orderBy = "orderBy";
String limit = "limit";
String offset = "offset";
// Invoking the API call with sample inputs
events.getEventSeriesCollectionAsync(eventId, title, titleStartsWith, startYear, modifiedSince, comics, stories, creators, characters, seriesType, contains, orderBy, limit, offset, new APICallBack<SeriesDataWrapper>() {
    public void onSuccess(HttpContext context, SeriesDataWrapper response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 409 | Limit greater than 100. |



#### <a name="get_event_story_collection_async"></a>![Method: ](https://apidocs.io/img/method.png "com.marvel.gateway.controllers.EventsController.getEventStoryCollectionAsync") getEventStoryCollectionAsync

> Fetches lists of stories filtered by an event id.


```java
void getEventStoryCollectionAsync(
        final String eventId,
        final String modifiedSince,
        final String comics,
        final String series,
        final String creators,
        final String characters,
        final String orderBy,
        final String limit,
        final String offset,
        final APICallBack<StoryDataWrapper> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| eventId |  ``` Required ```  | A single event. |
| modifiedSince |  ``` Optional ```  | Return only stories which have been modified since the specified date. |
| comics |  ``` Optional ```  | Return only stories contained in the specified (accepts a comma-separated list of ids). |
| series |  ``` Optional ```  | Return only stories contained the specified series (accepts a comma-separated list of ids). |
| creators |  ``` Optional ```  | Return only stories which feature work by the specified creators (accepts a comma-separated list of ids). |
| characters |  ``` Optional ```  | Return only stories which feature the specified characters (accepts a comma-separated list of ids). |
| orderBy |  ``` Optional ```  | Order the result set by a field or fields. Add a "-" to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (Acceptable values are: "id", "modified", "-id", "-modified") |
| limit |  ``` Optional ```  | Limit the result set to the specified number of resources. |
| offset |  ``` Optional ```  | Skip the specified number of resources in the result set. |


#### Example Usage

```java
String eventId = "eventId";
String modifiedSince = "modifiedSince";
String comics = "comics";
String series = "series";
String creators = "creators";
String characters = "characters";
String orderBy = "orderBy";
String limit = "limit";
String offset = "offset";
// Invoking the API call with sample inputs
events.getEventStoryCollectionAsync(eventId, modifiedSince, comics, series, creators, characters, orderBy, limit, offset, new APICallBack<StoryDataWrapper>() {
    public void onSuccess(HttpContext context, StoryDataWrapper response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 409 | Limit greater than 100. |



#### <a name="get_event_individual_async"></a>![Method: ](https://apidocs.io/img/method.png "com.marvel.gateway.controllers.EventsController.getEventIndividualAsync") getEventIndividualAsync

> Fetches a single event by id.


```java
void getEventIndividualAsync(
        final String eventId,
        final APICallBack<Event> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| eventId |  ``` Required ```  | A single event. |


#### Example Usage

```java
String eventId = "eventId";
// Invoking the API call with sample inputs
events.getEventIndividualAsync(eventId, new APICallBack<Event>() {
    public void onSuccess(HttpContext context, Event response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 404 | Event not found. |



#### <a name="get_events_collection_async"></a>![Method: ](https://apidocs.io/img/method.png "com.marvel.gateway.controllers.EventsController.getEventsCollectionAsync") getEventsCollectionAsync

> Fetches lists of events.


```java
void getEventsCollectionAsync(
        final String name,
        final String nameStartsWith,
        final String modifiedSince,
        final String creators,
        final String characters,
        final String series,
        final String comics,
        final String stories,
        final String orderBy,
        final String limit,
        final String offset,
        final APICallBack<EventDataWrapper> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| name |  ``` Optional ```  | Return only events which match the specified name. |
| nameStartsWith |  ``` Optional ```  | Return events with names that begin with the specified string (e.g. Sp). |
| modifiedSince |  ``` Optional ```  | Return only events which have been modified since the specified date. |
| creators |  ``` Optional ```  | Return only events which feature work by the specified creators (accepts a comma-separated list of ids). |
| characters |  ``` Optional ```  | Return only events which feature the specified characters (accepts a comma-separated list of ids). |
| series |  ``` Optional ```  | Return only events which are part of the specified series (accepts a comma-separated list of ids). |
| comics |  ``` Optional ```  | Return only events which take place in the specified comics (accepts a comma-separated list of ids). |
| stories |  ``` Optional ```  | Return only events which take place in the specified stories (accepts a comma-separated list of ids). |
| orderBy |  ``` Optional ```  | Order the result set by a field or fields. Add a "-" to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (Acceptable values are: "name", "startDate", "modified", "-name", "-startDate", "-modified") |
| limit |  ``` Optional ```  | Limit the result set to the specified number of resources. |
| offset |  ``` Optional ```  | Skip the specified number of resources in the result set. |


#### Example Usage

```java
String name = "name";
String nameStartsWith = "nameStartsWith";
String modifiedSince = "modifiedSince";
String creators = "creators";
String characters = "characters";
String series = "series";
String comics = "comics";
String stories = "stories";
String orderBy = "name";
String limit = "limit";
String offset = "offset";
// Invoking the API call with sample inputs
events.getEventsCollectionAsync(name, nameStartsWith, modifiedSince, creators, characters, series, comics, stories, orderBy, limit, offset, new APICallBack<EventDataWrapper>() {
    public void onSuccess(HttpContext context, EventDataWrapper response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 409 | Limit greater than 100. |



[Back to List of Controllers](#list_of_controllers)

### <a name="series_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.marvel.gateway.controllers.SeriesController") SeriesController

#### Get singleton instance

The singleton instance of the ``` SeriesController ``` class can be accessed from the API Client.

```java
SeriesController series = client.getSeries();
```

#### <a name="get_series_character_wrapper_async"></a>![Method: ](https://apidocs.io/img/method.png "com.marvel.gateway.controllers.SeriesController.getSeriesCharacterWrapperAsync") getSeriesCharacterWrapperAsync

> Fetches lists of characters filtered by a series id.


```java
void getSeriesCharacterWrapperAsync(
        final String seriesId,
        final String name,
        final String nameStartsWith,
        final String modifiedSince,
        final String comics,
        final String events,
        final String stories,
        final String orderBy,
        final String limit,
        final String offset,
        final APICallBack<CharacterDataWrapper> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| seriesId |  ``` Required ```  | Filter by series title. |
| name |  ``` Optional ```  | Return only characters matching the specified full character name (e.g. Spider-Man). |
| nameStartsWith |  ``` Optional ```  | Return characters with names that begin with the specified string (e.g. Sp). |
| modifiedSince |  ``` Optional ```  | Return only characters which have been modified since the specified date. |
| comics |  ``` Optional ```  | Return only characters which appear in the specified comics (accepts a comma-separated list of ids). |
| events |  ``` Optional ```  | Return only characters which appear comics that took place in the specified events (accepts a comma-separated list of ids). |
| stories |  ``` Optional ```  | Return only characters which appear the specified stories (accepts a comma-separated list of ids). |
| orderBy |  ``` Optional ```  | Order the result set by a field or fields. Add a "-" to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (Acceptable values are: "name", "modified", "-name", "-modified") |
| limit |  ``` Optional ```  | Limit the result set to the specified number of resources. |
| offset |  ``` Optional ```  | Skip the specified number of resources in the result set. |


#### Example Usage

```java
String seriesId = "seriesId";
String name = "name";
String nameStartsWith = "nameStartsWith";
String modifiedSince = "modifiedSince";
String comics = "comics";
String events = "events";
String stories = "stories";
String orderBy = "orderBy";
String limit = "limit";
String offset = "offset";
// Invoking the API call with sample inputs
series.getSeriesCharacterWrapperAsync(seriesId, name, nameStartsWith, modifiedSince, comics, events, stories, orderBy, limit, offset, new APICallBack<CharacterDataWrapper>() {
    public void onSuccess(HttpContext context, CharacterDataWrapper response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 409 | Limit greater than 100. |



#### <a name="get_comics_collection_by_series_id_async"></a>![Method: ](https://apidocs.io/img/method.png "com.marvel.gateway.controllers.SeriesController.getComicsCollectionBySeriesIdAsync") getComicsCollectionBySeriesIdAsync

> Fetches lists of comics filtered by a series id.


```java
void getComicsCollectionBySeriesIdAsync(
        final String seriesId,
        final String format,
        final FormatTypeEnum formatType,
        final String noVariants,
        final DateDescriptorEnum dateDescriptor,
        final String dateRange,
        final String title,
        final String titleStartsWith,
        final String startYear,
        final String issueNumber,
        final String diamondCode,
        final String digitalId,
        final String upc,
        final String isbn,
        final String ean,
        final String issn,
        final String hasDigitalIssue,
        final String modifiedSince,
        final String creators,
        final String characters,
        final String events,
        final String stories,
        final String sharedAppearances,
        final String collaborators,
        final String orderBy,
        final String limit,
        final String offset,
        final APICallBack<ComicDataWrapper> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| seriesId |  ``` Required ```  | Filter by series title. |
| format |  ``` Optional ```  | Filter by the issue format (e.g. comic, digital comic, hardcover). (Acceptable values are: "comic", "magazine", "trade paperback", "hardcover", "digest", "graphic novel", "digital comic", "infinite comic") |
| formatType |  ``` Optional ```  | Filter by the issue format type (comic or collection). |
| noVariants |  ``` Optional ```  | Exclude variant comics from the result set. (Acceptable values are: "true") |
| dateDescriptor |  ``` Optional ```  | Return comics within a predefined date range. |
| dateRange |  ``` Optional ```  | Return comics within a predefined date range.  Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02).  Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format. |
| title |  ``` Optional ```  | Return only issues in series whose title matches the input. |
| titleStartsWith |  ``` Optional ```  | Return only issues in series whose title starts with the input. |
| startYear |  ``` Optional ```  | Return only issues in series whose start year matches the input. |
| issueNumber |  ``` Optional ```  | Return only issues in series whose issue number matches the input. |
| diamondCode |  ``` Optional ```  | Filter by diamond code. |
| digitalId |  ``` Optional ```  | Filter by digital comic id. |
| upc |  ``` Optional ```  | Filter by UPC. |
| isbn |  ``` Optional ```  | Filter by ISBN. |
| ean |  ``` Optional ```  | Filter by EAN. |
| issn |  ``` Optional ```  | Filter by ISSN. |
| hasDigitalIssue |  ``` Optional ```  | Include only results which are available digitally. (Acceptable values are: "true") |
| modifiedSince |  ``` Optional ```  | Return only comics which have been modified since the specified date. |
| creators |  ``` Optional ```  | Return only comics which feature work by the specified creators (accepts a comma-separated list of ids). |
| characters |  ``` Optional ```  | Return only comics which feature the specified characters (accepts a comma-separated list of ids). |
| events |  ``` Optional ```  | Return only comics which take place in the specified events (accepts a comma-separated list of ids). |
| stories |  ``` Optional ```  | Return only comics which contain the specified stories (accepts a comma-separated list of ids). |
| sharedAppearances |  ``` Optional ```  | Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear). |
| collaborators |  ``` Optional ```  | Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work). |
| orderBy |  ``` Optional ```  | Order the result set by a field or fields. Add a "-" to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (Acceptable values are: "focDate", "onsaleDate", "title", "issueNumber", "modified", "-focDate", "-onsaleDate", "-title", "-issueNumber", "-modified") |
| limit |  ``` Optional ```  | Limit the result set to the specified number of resources. |
| offset |  ``` Optional ```  | Skip the specified number of resources in the result set. |


#### Example Usage

```java
String seriesId = "seriesId";
String format = "format";
FormatTypeEnum formatType = FormatTypeEnum.fromString("collection");
String noVariants = "noVariants";
DateDescriptorEnum dateDescriptor = DateDescriptorEnum.fromString("lastWeek");
String dateRange = "dateRange";
String title = "title";
String titleStartsWith = "titleStartsWith";
String startYear = "startYear";
String issueNumber = "issueNumber";
String diamondCode = "diamondCode";
String digitalId = "digitalId";
String upc = "upc";
String isbn = "isbn";
String ean = "ean";
String issn = "issn";
String hasDigitalIssue = "hasDigitalIssue";
String modifiedSince = "modifiedSince";
String creators = "creators";
String characters = "characters";
String events = "events";
String stories = "stories";
String sharedAppearances = "sharedAppearances";
String collaborators = "collaborators";
String orderBy = "orderBy";
String limit = "limit";
String offset = "offset";
// Invoking the API call with sample inputs
series.getComicsCollectionBySeriesIdAsync(seriesId, format, formatType, noVariants, dateDescriptor, dateRange, title, titleStartsWith, startYear, issueNumber, diamondCode, digitalId, upc, isbn, ean, issn, hasDigitalIssue, modifiedSince, creators, characters, events, stories, sharedAppearances, collaborators, orderBy, limit, offset, new APICallBack<ComicDataWrapper>() {
    public void onSuccess(HttpContext context, ComicDataWrapper response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 409 | Limit greater than 100. |



#### <a name="get_creator_collection_by_series_id_async"></a>![Method: ](https://apidocs.io/img/method.png "com.marvel.gateway.controllers.SeriesController.getCreatorCollectionBySeriesIdAsync") getCreatorCollectionBySeriesIdAsync

> Fetches lists of creators filtered by a series id.


```java
void getCreatorCollectionBySeriesIdAsync(
        final String seriesId,
        final String firstName,
        final String middleName,
        final String lastName,
        final String suffix,
        final String nameStartsWith,
        final String firstNameStartsWith,
        final String middleNameStartsWith,
        final String lastNameStartsWith,
        final String modifiedSince,
        final String comics,
        final String events,
        final String stories,
        final String orderBy,
        final String limit,
        final String offset,
        final APICallBack<CreatorDataWrapper> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| seriesId |  ``` Required ```  | Filter by series title. |
| firstName |  ``` Optional ```  | Filter by creator first name (e.g. brian). |
| middleName |  ``` Optional ```  | Filter by creator middle name (e.g. Michael). |
| lastName |  ``` Optional ```  | Filter by creator last name (e.g. Bendis). |
| suffix |  ``` Optional ```  | Filter by suffix or honorific (e.g. Jr., Sr.). |
| nameStartsWith |  ``` Optional ```  | Filter by creator names that match critera (e.g. B, St L). |
| firstNameStartsWith |  ``` Optional ```  | Filter by creator first names that match critera (e.g. B, St L). |
| middleNameStartsWith |  ``` Optional ```  | Filter by creator middle names that match critera (e.g. Mi). |
| lastNameStartsWith |  ``` Optional ```  | Filter by creator last names that match critera (e.g. Ben). |
| modifiedSince |  ``` Optional ```  | Return only creators which have been modified since the specified date. |
| comics |  ``` Optional ```  | Return only creators who worked on in the specified comics (accepts a comma-separated list of ids). |
| events |  ``` Optional ```  | Return only creators who worked on comics that took place in the specified events (accepts a comma-separated list of ids). |
| stories |  ``` Optional ```  | Return only creators who worked on the specified stories (accepts a comma-separated list of ids). |
| orderBy |  ``` Optional ```  | Order the result set by a field or fields. Add a "-" to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (Acceptable values are: "lastName", "firstName", "middleName", "suffix", "modified", "-lastName", "-firstName", "-middleName", "-suffix", "-modified") |
| limit |  ``` Optional ```  | Limit the result set to the specified number of resources. |
| offset |  ``` Optional ```  | Skip the specified number of resources in the result set. |


#### Example Usage

```java
String seriesId = "seriesId";
String firstName = "firstName";
String middleName = "middleName";
String lastName = "lastName";
String suffix = "suffix";
String nameStartsWith = "nameStartsWith";
String firstNameStartsWith = "firstNameStartsWith";
String middleNameStartsWith = "middleNameStartsWith";
String lastNameStartsWith = "lastNameStartsWith";
String modifiedSince = "modifiedSince";
String comics = "comics";
String events = "events";
String stories = "stories";
String orderBy = "orderBy";
String limit = "limit";
String offset = "offset";
// Invoking the API call with sample inputs
series.getCreatorCollectionBySeriesIdAsync(seriesId, firstName, middleName, lastName, suffix, nameStartsWith, firstNameStartsWith, middleNameStartsWith, lastNameStartsWith, modifiedSince, comics, events, stories, orderBy, limit, offset, new APICallBack<CreatorDataWrapper>() {
    public void onSuccess(HttpContext context, CreatorDataWrapper response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 409 | Limit greater than 100. |



#### <a name="get_events_collection_by_series_id_async"></a>![Method: ](https://apidocs.io/img/method.png "com.marvel.gateway.controllers.SeriesController.getEventsCollectionBySeriesIdAsync") getEventsCollectionBySeriesIdAsync

> Fetches lists of events filtered by a series id.


```java
void getEventsCollectionBySeriesIdAsync(
        final String seriesId,
        final String name,
        final String nameStartsWith,
        final String modifiedSince,
        final String creators,
        final String characters,
        final String comics,
        final String stories,
        final String orderBy,
        final String limit,
        final String offset,
        final APICallBack<EventDataWrapper> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| seriesId |  ``` Required ```  | Filter by series title. |
| name |  ``` Optional ```  | Filter the event list by name. |
| nameStartsWith |  ``` Optional ```  | Return events with names that begin with the specified string (e.g. Sp). |
| modifiedSince |  ``` Optional ```  | Return only events which have been modified since the specified date. |
| creators |  ``` Optional ```  | Return only events which feature work by the specified creators (accepts a comma-separated list of ids). |
| characters |  ``` Optional ```  | Return only events which feature the specified characters (accepts a comma-separated list of ids). |
| comics |  ``` Optional ```  | Return only events which take place in the specified comics (accepts a comma-separated list of ids). |
| stories |  ``` Optional ```  | Return only events which contain the specified stories (accepts a comma-separated list of ids). |
| orderBy |  ``` Optional ```  | Order the result set by a field or fields. Add a "-" to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (Acceptable values are: "name", "startDate", "modified", "-name", "-startDate", "-modified") |
| limit |  ``` Optional ```  | Limit the result set to the specified number of resources. |
| offset |  ``` Optional ```  | Skip the specified number of resources in the result set. |


#### Example Usage

```java
String seriesId = "seriesId";
String name = "name";
String nameStartsWith = "nameStartsWith";
String modifiedSince = "modifiedSince";
String creators = "creators";
String characters = "characters";
String comics = "comics";
String stories = "stories";
String orderBy = "orderBy";
String limit = "limit";
String offset = "offset";
// Invoking the API call with sample inputs
series.getEventsCollectionBySeriesIdAsync(seriesId, name, nameStartsWith, modifiedSince, creators, characters, comics, stories, orderBy, limit, offset, new APICallBack<EventDataWrapper>() {
    public void onSuccess(HttpContext context, EventDataWrapper response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 409 | Limit greater than 100. |



#### <a name="get_series_story_collection_async"></a>![Method: ](https://apidocs.io/img/method.png "com.marvel.gateway.controllers.SeriesController.getSeriesStoryCollectionAsync") getSeriesStoryCollectionAsync

> Fetches lists of stories filtered by a series id.


```java
void getSeriesStoryCollectionAsync(
        final String seriesId,
        final String modifiedSince,
        final String comics,
        final String events,
        final String creators,
        final String characters,
        final String orderBy,
        final String limit,
        final String offset,
        final APICallBack<StoryDataWrapper> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| seriesId |  ``` Required ```  | Filter by series title. |
| modifiedSince |  ``` Optional ```  | Return only stories which have been modified since the specified date. |
| comics |  ``` Optional ```  | Return only stories contained in the specified (accepts a comma-separated list of ids). |
| events |  ``` Optional ```  | Return only stories which take place during the specified events (accepts a comma-separated list of ids). |
| creators |  ``` Optional ```  | Return only stories which feature work by the specified creators (accepts a comma-separated list of ids). |
| characters |  ``` Optional ```  | Return only stories which feature the specified characters (accepts a comma-separated list of ids). |
| orderBy |  ``` Optional ```  | Order the result set by a field or fields. Add a "-" to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (Acceptable values are: "id", "modified", "-id", "-modified") |
| limit |  ``` Optional ```  | Limit the result set to the specified number of resources. |
| offset |  ``` Optional ```  | Skip the specified number of resources in the result set. |


#### Example Usage

```java
String seriesId = "seriesId";
String modifiedSince = "modifiedSince";
String comics = "comics";
String events = "events";
String creators = "creators";
String characters = "characters";
String orderBy = "orderBy";
String limit = "limit";
String offset = "offset";
// Invoking the API call with sample inputs
series.getSeriesStoryCollectionAsync(seriesId, modifiedSince, comics, events, creators, characters, orderBy, limit, offset, new APICallBack<StoryDataWrapper>() {
    public void onSuccess(HttpContext context, StoryDataWrapper response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 409 | Limit greater than 100. |



#### <a name="get_series_individual_async"></a>![Method: ](https://apidocs.io/img/method.png "com.marvel.gateway.controllers.SeriesController.getSeriesIndividualAsync") getSeriesIndividualAsync

> Fetches a single comic series by id.


```java
void getSeriesIndividualAsync(
        final String seriesId,
        final APICallBack<Series> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| seriesId |  ``` Required ```  | Filter by series title. |


#### Example Usage

```java
String seriesId = "seriesId";
// Invoking the API call with sample inputs
series.getSeriesIndividualAsync(seriesId, new APICallBack<Series>() {
    public void onSuccess(HttpContext context, Series response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 404 | Series not found. |



#### <a name="get_series_collection_async"></a>![Method: ](https://apidocs.io/img/method.png "com.marvel.gateway.controllers.SeriesController.getSeriesCollectionAsync") getSeriesCollectionAsync

> Fetches lists of series.


```java
void getSeriesCollectionAsync(
        final String title,
        final String titleStartsWith,
        final String startYear,
        final String modifiedSince,
        final String comics,
        final String stories,
        final String events,
        final String creators,
        final String characters,
        final String seriesType,
        final String contains,
        final String orderBy,
        final String limit,
        final String offset,
        final APICallBack<SeriesDataWrapper> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| title |  ``` Optional ```  | Return only series matching the specified title. |
| titleStartsWith |  ``` Optional ```  | Return series with titles that begin with the specified string (e.g. Sp). |
| startYear |  ``` Optional ```  | Return only series matching the specified start year. |
| modifiedSince |  ``` Optional ```  | Return only series which have been modified since the specified date. |
| comics |  ``` Optional ```  | Return only series which contain the specified comics (accepts a comma-separated list of ids). |
| stories |  ``` Optional ```  | Return only series which contain the specified stories (accepts a comma-separated list of ids). |
| events |  ``` Optional ```  | Return only series which have comics that take place during the specified events (accepts a comma-separated list of ids). |
| creators |  ``` Optional ```  | Return only series which feature work by the specified creators (accepts a comma-separated list of ids). |
| characters |  ``` Optional ```  | Return only series which feature the specified characters (accepts a comma-separated list of ids). |
| seriesType |  ``` Optional ```  | Filter the series by publication frequency type. (Acceptable values are: "collection", "one shot", "limited", "ongoing") |
| contains |  ``` Optional ```  | Return only series containing one or more comics with the specified format. (Acceptable values are: "comic", "magazine", "trade paperback", "hardcover", "digest", "graphic novel", "digital comic", "infinite comic") |
| orderBy |  ``` Optional ```  | Order the result set by a field or fields. Add a "-" to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (Acceptable values are: "title", "modified", "startYear", "-title", "-modified", "-startYear") |
| limit |  ``` Optional ```  | Limit the result set to the specified number of resources. |
| offset |  ``` Optional ```  | Skip the specified number of resources in the result set. |


#### Example Usage

```java
String title = "title";
String titleStartsWith = "titleStartsWith";
String startYear = "startYear";
String modifiedSince = "modifiedSince";
String comics = "comics";
String stories = "stories";
String events = "events";
String creators = "creators";
String characters = "characters";
String seriesType = "collection";
String contains = "comic";
String orderBy = "title";
String limit = "limit";
String offset = "offset";
// Invoking the API call with sample inputs
series.getSeriesCollectionAsync(title, titleStartsWith, startYear, modifiedSince, comics, stories, events, creators, characters, seriesType, contains, orderBy, limit, offset, new APICallBack<SeriesDataWrapper>() {
    public void onSuccess(HttpContext context, SeriesDataWrapper response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 409 | Limit greater than 100. |



[Back to List of Controllers](#list_of_controllers)

### <a name="stories_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.marvel.gateway.controllers.StoriesController") StoriesController

#### Get singleton instance

The singleton instance of the ``` StoriesController ``` class can be accessed from the API Client.

```java
StoriesController stories = client.getStories();
```

#### <a name="get_character_collection_by_story_id_async"></a>![Method: ](https://apidocs.io/img/method.png "com.marvel.gateway.controllers.StoriesController.getCharacterCollectionByStoryIdAsync") getCharacterCollectionByStoryIdAsync

> Fetches lists of characters filtered by a story id.


```java
void getCharacterCollectionByStoryIdAsync(
        final String storyId,
        final String name,
        final String nameStartsWith,
        final String modifiedSince,
        final String comics,
        final String series,
        final String events,
        final String orderBy,
        final String limit,
        final String offset,
        final APICallBack<CharacterDataWrapper> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| storyId |  ``` Required ```  | Filter by story id. |
| name |  ``` Optional ```  | Return only characters matching the specified full character name (e.g. Spider-Man). |
| nameStartsWith |  ``` Optional ```  | Return characters with names that begin with the specified string (e.g. Sp). |
| modifiedSince |  ``` Optional ```  | Return only characters which have been modified since the specified date. |
| comics |  ``` Optional ```  | Return only characters which appear in the specified comics (accepts a comma-separated list of ids). |
| series |  ``` Optional ```  | Return only characters which appear the specified series (accepts a comma-separated list of ids). |
| events |  ``` Optional ```  | Return only characters which appear comics that took place in the specified events (accepts a comma-separated list of ids). |
| orderBy |  ``` Optional ```  | Order the result set by a field or fields. Add a "-" to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (Acceptable values are: "name", "modified", "-name", "-modified") |
| limit |  ``` Optional ```  | Limit the result set to the specified number of resources. |
| offset |  ``` Optional ```  | Skip the specified number of resources in the result set. |


#### Example Usage

```java
String storyId = "storyId";
String name = "name";
String nameStartsWith = "nameStartsWith";
String modifiedSince = "modifiedSince";
String comics = "comics";
String series = "series";
String events = "events";
String orderBy = "orderBy";
String limit = "limit";
String offset = "offset";
// Invoking the API call with sample inputs
stories.getCharacterCollectionByStoryIdAsync(storyId, name, nameStartsWith, modifiedSince, comics, series, events, orderBy, limit, offset, new APICallBack<CharacterDataWrapper>() {
    public void onSuccess(HttpContext context, CharacterDataWrapper response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 409 | Limit greater than 100. |



#### <a name="get_comics_collection_by_story_id_async"></a>![Method: ](https://apidocs.io/img/method.png "com.marvel.gateway.controllers.StoriesController.getComicsCollectionByStoryIdAsync") getComicsCollectionByStoryIdAsync

> Fetches lists of comics filtered by a story id.


```java
void getComicsCollectionByStoryIdAsync(
        final String storyId,
        final String format,
        final FormatTypeEnum formatType,
        final String noVariants,
        final DateDescriptorEnum dateDescriptor,
        final String dateRange,
        final String title,
        final String titleStartsWith,
        final String startYear,
        final String issueNumber,
        final String diamondCode,
        final String digitalId,
        final String upc,
        final String isbn,
        final String ean,
        final String issn,
        final String hasDigitalIssue,
        final String modifiedSince,
        final String creators,
        final String characters,
        final String series,
        final String events,
        final String sharedAppearances,
        final String collaborators,
        final String orderBy,
        final String limit,
        final String offset,
        final APICallBack<ComicDataWrapper> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| storyId |  ``` Required ```  | Filter by story id. |
| format |  ``` Optional ```  | Filter by the issue format (e.g. comic, digital comic, hardcover). (Acceptable values are: "comic", "magazine", "trade paperback", "hardcover", "digest", "graphic novel", "digital comic", "infinite comic") |
| formatType |  ``` Optional ```  | Filter by the issue format type (comic or collection). |
| noVariants |  ``` Optional ```  | Exclude variant comics from the result set. (Acceptable values are: "true") |
| dateDescriptor |  ``` Optional ```  | Return comics within a predefined date range. |
| dateRange |  ``` Optional ```  | Return comics within a predefined date range.  Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02).  Dates are preferably formatted as YYYY-MM-DD but may be sent as any common date format. |
| title |  ``` Optional ```  | Return only issues in series whose title matches the input. |
| titleStartsWith |  ``` Optional ```  | Return only issues in series whose title starts with the input. |
| startYear |  ``` Optional ```  | Return only issues in series whose start year matches the input. |
| issueNumber |  ``` Optional ```  | Return only issues in series whose issue number matches the input. |
| diamondCode |  ``` Optional ```  | Filter by diamond code. |
| digitalId |  ``` Optional ```  | Filter by digital comic id. |
| upc |  ``` Optional ```  | Filter by UPC. |
| isbn |  ``` Optional ```  | Filter by ISBN. |
| ean |  ``` Optional ```  | Filter by EAN. |
| issn |  ``` Optional ```  | Filter by ISSN. |
| hasDigitalIssue |  ``` Optional ```  | Include only results which are available digitally. (Acceptable values are: "true") |
| modifiedSince |  ``` Optional ```  | Return only comics which have been modified since the specified date. |
| creators |  ``` Optional ```  | Return only comics which feature work by the specified creators (accepts a comma-separated list of ids). |
| characters |  ``` Optional ```  | Return only comics which feature the specified characters (accepts a comma-separated list of ids). |
| series |  ``` Optional ```  | Return only comics which are part of the specified series (accepts a comma-separated list of ids). |
| events |  ``` Optional ```  | Return only comics which take place in the specified events (accepts a comma-separated list of ids). |
| sharedAppearances |  ``` Optional ```  | Return only comics in which the specified characters appear together (for example in which BOTH Spider-Man and Wolverine appear). |
| collaborators |  ``` Optional ```  | Return only comics in which the specified creators worked together (for example in which BOTH Stan Lee and Jack Kirby did work). |
| orderBy |  ``` Optional ```  | Order the result set by a field or fields. Add a "-" to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (Acceptable values are: "focDate", "onsaleDate", "title", "issueNumber", "modified", "-focDate", "-onsaleDate", "-title", "-issueNumber", "-modified") |
| limit |  ``` Optional ```  | Limit the result set to the specified number of resources. |
| offset |  ``` Optional ```  | Skip the specified number of resources in the result set. |


#### Example Usage

```java
String storyId = "storyId";
String format = "format";
FormatTypeEnum formatType = FormatTypeEnum.fromString("collection");
String noVariants = "noVariants";
DateDescriptorEnum dateDescriptor = DateDescriptorEnum.fromString("lastWeek");
String dateRange = "dateRange";
String title = "title";
String titleStartsWith = "titleStartsWith";
String startYear = "startYear";
String issueNumber = "issueNumber";
String diamondCode = "diamondCode";
String digitalId = "digitalId";
String upc = "upc";
String isbn = "isbn";
String ean = "ean";
String issn = "issn";
String hasDigitalIssue = "hasDigitalIssue";
String modifiedSince = "modifiedSince";
String creators = "creators";
String characters = "characters";
String series = "series";
String events = "events";
String sharedAppearances = "sharedAppearances";
String collaborators = "collaborators";
String orderBy = "orderBy";
String limit = "limit";
String offset = "offset";
// Invoking the API call with sample inputs
stories.getComicsCollectionByStoryIdAsync(storyId, format, formatType, noVariants, dateDescriptor, dateRange, title, titleStartsWith, startYear, issueNumber, diamondCode, digitalId, upc, isbn, ean, issn, hasDigitalIssue, modifiedSince, creators, characters, series, events, sharedAppearances, collaborators, orderBy, limit, offset, new APICallBack<ComicDataWrapper>() {
    public void onSuccess(HttpContext context, ComicDataWrapper response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 409 | Limit greater than 100. |



#### <a name="get_creator_collection_by_story_id_async"></a>![Method: ](https://apidocs.io/img/method.png "com.marvel.gateway.controllers.StoriesController.getCreatorCollectionByStoryIdAsync") getCreatorCollectionByStoryIdAsync

> Fetches lists of creators filtered by a story id.


```java
void getCreatorCollectionByStoryIdAsync(
        final String storyId,
        final String firstName,
        final String middleName,
        final String lastName,
        final String suffix,
        final String nameStartsWith,
        final String firstNameStartsWith,
        final String middleNameStartsWith,
        final String lastNameStartsWith,
        final String modifiedSince,
        final String comics,
        final String series,
        final String events,
        final String orderBy,
        final String limit,
        final String offset,
        final APICallBack<CreatorDataWrapper> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| storyId |  ``` Required ```  | Filter by story id. |
| firstName |  ``` Optional ```  | Filter by creator first name (e.g. brian). |
| middleName |  ``` Optional ```  | Filter by creator middle name (e.g. Michael). |
| lastName |  ``` Optional ```  | Filter by creator last name (e.g. Bendis). |
| suffix |  ``` Optional ```  | Filter by suffix or honorific (e.g. Jr., Sr.). |
| nameStartsWith |  ``` Optional ```  | Filter by creator names that match critera (e.g. B, St L). |
| firstNameStartsWith |  ``` Optional ```  | Filter by creator first names that match critera (e.g. B, St L). |
| middleNameStartsWith |  ``` Optional ```  | Filter by creator middle names that match critera (e.g. Mi). |
| lastNameStartsWith |  ``` Optional ```  | Filter by creator last names that match critera (e.g. Ben). |
| modifiedSince |  ``` Optional ```  | Return only creators which have been modified since the specified date. |
| comics |  ``` Optional ```  | Return only creators who worked on in the specified comics (accepts a comma-separated list of ids). |
| series |  ``` Optional ```  | Return only creators who worked on the specified series (accepts a comma-separated list of ids). |
| events |  ``` Optional ```  | Return only creators who worked on comics that took place in the specified events (accepts a comma-separated list of ids). |
| orderBy |  ``` Optional ```  | Order the result set by a field or fields. Add a "-" to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (Acceptable values are: "lastName", "firstName", "middleName", "suffix", "modified", "-lastName", "-firstName", "-middleName", "-suffix", "-modified") |
| limit |  ``` Optional ```  | Limit the result set to the specified number of resources. |
| offset |  ``` Optional ```  | Skip the specified number of resources in the result set. |


#### Example Usage

```java
String storyId = "storyId";
String firstName = "firstName";
String middleName = "middleName";
String lastName = "lastName";
String suffix = "suffix";
String nameStartsWith = "nameStartsWith";
String firstNameStartsWith = "firstNameStartsWith";
String middleNameStartsWith = "middleNameStartsWith";
String lastNameStartsWith = "lastNameStartsWith";
String modifiedSince = "modifiedSince";
String comics = "comics";
String series = "series";
String events = "events";
String orderBy = "orderBy";
String limit = "limit";
String offset = "offset";
// Invoking the API call with sample inputs
stories.getCreatorCollectionByStoryIdAsync(storyId, firstName, middleName, lastName, suffix, nameStartsWith, firstNameStartsWith, middleNameStartsWith, lastNameStartsWith, modifiedSince, comics, series, events, orderBy, limit, offset, new APICallBack<CreatorDataWrapper>() {
    public void onSuccess(HttpContext context, CreatorDataWrapper response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 409 | Limit greater than 100. |



#### <a name="get_events_collection_by_story_id_async"></a>![Method: ](https://apidocs.io/img/method.png "com.marvel.gateway.controllers.StoriesController.getEventsCollectionByStoryIdAsync") getEventsCollectionByStoryIdAsync

> Fetches lists of events filtered by a story id.


```java
void getEventsCollectionByStoryIdAsync(
        final String storyId,
        final String name,
        final String nameStartsWith,
        final String modifiedSince,
        final String creators,
        final String characters,
        final String series,
        final String comics,
        final String orderBy,
        final String limit,
        final String offset,
        final APICallBack<EventDataWrapper> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| storyId |  ``` Required ```  | Filter by story id. |
| name |  ``` Optional ```  | Filter the event list by name. |
| nameStartsWith |  ``` Optional ```  | Return events with names that begin with the specified string (e.g. Sp). |
| modifiedSince |  ``` Optional ```  | Return only events which have been modified since the specified date. |
| creators |  ``` Optional ```  | Return only events which feature work by the specified creators (accepts a comma-separated list of ids). |
| characters |  ``` Optional ```  | Return only events which feature the specified characters (accepts a comma-separated list of ids). |
| series |  ``` Optional ```  | Return only events which are part of the specified series (accepts a comma-separated list of ids). |
| comics |  ``` Optional ```  | Return only events which take place in the specified comics (accepts a comma-separated list of ids). |
| orderBy |  ``` Optional ```  | Order the result set by a field or fields. Add a "-" to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (Acceptable values are: "name", "startDate", "modified", "-name", "-startDate", "-modified") |
| limit |  ``` Optional ```  | Limit the result set to the specified number of resources. |
| offset |  ``` Optional ```  | Skip the specified number of resources in the result set. |


#### Example Usage

```java
String storyId = "storyId";
String name = "name";
String nameStartsWith = "nameStartsWith";
String modifiedSince = "modifiedSince";
String creators = "creators";
String characters = "characters";
String series = "series";
String comics = "comics";
String orderBy = "orderBy";
String limit = "limit";
String offset = "offset";
// Invoking the API call with sample inputs
stories.getEventsCollectionByStoryIdAsync(storyId, name, nameStartsWith, modifiedSince, creators, characters, series, comics, orderBy, limit, offset, new APICallBack<EventDataWrapper>() {
    public void onSuccess(HttpContext context, EventDataWrapper response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 409 | Limit greater than 100. |



#### <a name="get_story_series_collection_async"></a>![Method: ](https://apidocs.io/img/method.png "com.marvel.gateway.controllers.StoriesController.getStorySeriesCollectionAsync") getStorySeriesCollectionAsync

> Fetches lists of series filtered by a story id.


```java
void getStorySeriesCollectionAsync(
        final String storyId,
        final String events,
        final String title,
        final String titleStartsWith,
        final String startYear,
        final String modifiedSince,
        final String comics,
        final String creators,
        final String characters,
        final String seriesType,
        final String contains,
        final String orderBy,
        final String limit,
        final String offset,
        final APICallBack<SeriesDataWrapper> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| storyId |  ``` Required ```  | Filter by story id. |
| events |  ``` Optional ```  | Return only series which have comics that take place during the specified events (accepts a comma-separated list of ids). |
| title |  ``` Optional ```  | Filter by series title. |
| titleStartsWith |  ``` Optional ```  | Return series with titles that begin with the specified string (e.g. Sp). |
| startYear |  ``` Optional ```  | Return only series matching the specified start year. |
| modifiedSince |  ``` Optional ```  | Return only series which have been modified since the specified date. |
| comics |  ``` Optional ```  | Return only series which contain the specified comics (accepts a comma-separated list of ids). |
| creators |  ``` Optional ```  | Return only series which feature work by the specified creators (accepts a comma-separated list of ids). |
| characters |  ``` Optional ```  | Return only series which feature the specified characters (accepts a comma-separated list of ids). |
| seriesType |  ``` Optional ```  | Filter the series by publication frequency type. (Acceptable values are: "collection", "one shot", "limited", "ongoing") |
| contains |  ``` Optional ```  | Return only series containing one or more comics with the specified format. (Acceptable values are: "comic", "magazine", "trade paperback", "hardcover", "digest", "graphic novel", "digital comic", "infinite comic") |
| orderBy |  ``` Optional ```  | Order the result set by a field or fields. Add a "-" to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (Acceptable values are: "title", "modified", "startYear", "-title", "-modified", "-startYear") |
| limit |  ``` Optional ```  | Limit the result set to the specified number of resources. |
| offset |  ``` Optional ```  | Skip the specified number of resources in the result set. |


#### Example Usage

```java
String storyId = "storyId";
String events = "events";
String title = "title";
String titleStartsWith = "titleStartsWith";
String startYear = "startYear";
String modifiedSince = "modifiedSince";
String comics = "comics";
String creators = "creators";
String characters = "characters";
String seriesType = "seriesType";
String contains = "contains";
String orderBy = "orderBy";
String limit = "limit";
String offset = "offset";
// Invoking the API call with sample inputs
stories.getStorySeriesCollectionAsync(storyId, events, title, titleStartsWith, startYear, modifiedSince, comics, creators, characters, seriesType, contains, orderBy, limit, offset, new APICallBack<SeriesDataWrapper>() {
    public void onSuccess(HttpContext context, SeriesDataWrapper response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 409 | Limit greater than 100. |



#### <a name="get_story_individual_async"></a>![Method: ](https://apidocs.io/img/method.png "com.marvel.gateway.controllers.StoriesController.getStoryIndividualAsync") getStoryIndividualAsync

> Fetches a single comic story by id.


```java
void getStoryIndividualAsync(
        final String storyId,
        final APICallBack<Story> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| storyId |  ``` Required ```  | Filter by story id. |


#### Example Usage

```java
String storyId = "storyId";
// Invoking the API call with sample inputs
stories.getStoryIndividualAsync(storyId, new APICallBack<Story>() {
    public void onSuccess(HttpContext context, Story response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 404 | Story not found. |



#### <a name="get_story_collection_async"></a>![Method: ](https://apidocs.io/img/method.png "com.marvel.gateway.controllers.StoriesController.getStoryCollectionAsync") getStoryCollectionAsync

> Fetches lists of stories.


```java
void getStoryCollectionAsync(
        final String modifiedSince,
        final String comics,
        final String series,
        final String events,
        final String creators,
        final String characters,
        final String orderBy,
        final String limit,
        final String offset,
        final APICallBack<StoryDataWrapper> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| modifiedSince |  ``` Optional ```  | Return only stories which have been modified since the specified date. |
| comics |  ``` Optional ```  | Return only stories contained in the specified (accepts a comma-separated list of ids). |
| series |  ``` Optional ```  | Return only stories contained the specified series (accepts a comma-separated list of ids). |
| events |  ``` Optional ```  | Return only stories which take place during the specified events (accepts a comma-separated list of ids). |
| creators |  ``` Optional ```  | Return only stories which feature work by the specified creators (accepts a comma-separated list of ids). |
| characters |  ``` Optional ```  | Return only stories which feature the specified characters (accepts a comma-separated list of ids). |
| orderBy |  ``` Optional ```  | Order the result set by a field or fields. Add a "-" to the value sort in descending order. Multiple values are given priority in the order in which they are passed. (Acceptable values are: "id", "modified", "-id", "-modified") |
| limit |  ``` Optional ```  | Limit the result set to the specified number of resources. |
| offset |  ``` Optional ```  | Skip the specified number of resources in the result set. |


#### Example Usage

```java
String modifiedSince = "modifiedSince";
String comics = "comics";
String series = "series";
String events = "events";
String creators = "creators";
String characters = "characters";
String orderBy = "id";
String limit = "limit";
String offset = "offset";
// Invoking the API call with sample inputs
stories.getStoryCollectionAsync(modifiedSince, comics, series, events, creators, characters, orderBy, limit, offset, new APICallBack<StoryDataWrapper>() {
    public void onSuccess(HttpContext context, StoryDataWrapper response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 409 | Limit greater than 100. |



[Back to List of Controllers](#list_of_controllers)



