---------------------------------------------------------------------------------------------------------------------------------------------------------
Solution for Question 1 and Question 2 is in Internationalization package :-
-----------------------------------------------------------------------------

Question 1 : Add support for Internationalization in your application allowing messages to be shown in English, German and Swedish, keeping English as default.

Explanation : To provide support fo internationalization, MessageSource interface is used in the MessageController file and created three files in resource folder named messages for English language, messagess_de.properties for German language, messages_sv for Swedish language. And messages file is the default file i.e. English is default.

Question 2 : Create a GET request which takes "username" as param and shows a localized message "Hello Username". (Use parameters in message properties)

Explanation : LocaleTextHolder is used to get the locale passed by the user. Username is passed in the url. And passing it using name[] array. In messages properties, it is accessed using {0}, where 0 repreents index of the array.

---------------------------------------------------------------------------------------------------------------------------------------------------------
Solution for Question 3, Question 4, Question 5 and Question 7 is in ContentNegotiationAndSwagger package :-
------------------------------------------------------------------------------------------------------------

Question 3 : Create POST Method to create user details which can accept XML for user creation.

Explanation : In the UserController file, I have created a Post Mapping which accepts data in XML format because I have set "consumes" value to "MediaType.APPLICATION_XML_VALUE".


Question 4 : Create GET Method to fetch the list of users in XML format.

Explanation : In the UserController file, I have created a GetMapping which returns data in the format of XML, because I have set value of "produces" to "MediaType.APPLICATION_XML_VALUE".


Question 5 : Configure swagger plugin and create document of following methods: Get details of User using GET request, Save details of the user using POST request, Delete a user using DELETE request.

Explanation : I have configured the Swagger plugin in SwaggerConfig file. And created all three required methods in the UserController file.


Question 7 : In swagger documentation, add the description of each class and URI so that in swagger UI the purpose of class and URI is clear.

Explanation : Added the description of the methods in UserController file using @ApiOperation annotation. And added the description of the class in the User file using @ApiModel annotation.

---------------------------------------------------------------------------------------------------------------------------------------------------------
Solution for Question 8 is in StaticFiltering package :-
--------------------------------------------------------

Question 8 : Create API which saves details of User (along with the password) but on successfully saving returns only non-critical data. (Use static filtering)

Explanation : Static Filtering is being done using @JsonIgnore annotation in the User file on the password instance in the user class 

---------------------------------------------------------------------------------------------------------------------------------------------------------
Solution for Question 9 is in DynamicFiltering package :-
---------------------------------------------------------

Question 9 : Create another API that does the same by using Dynamic Filtering.

Explanation : I have applied Dynamic Filtering using @JsonFilter annotation in the DynamicUser class and then configured it in DynamicFilteringController file

---------------------------------------------------------------------------------------------------------------------------------------------------------
Solution for Question 10 is in Versioning package :-
----------------------------------------------------

Question 10 : Create 2 API for showing user details. The first api should return only basic details of the user and the other API should return more/enhanced details of the user

Explanation : Created two files UserV1 and UserV2. UserV1 is for Basic user details. UserV2 is for Enhanced User Details. And in Versioning Controller class, I have added all 4 types of versioning asked in the question.

---------------------------------------------------------------------------------------------------------------------------------------------------------
Solution for Question 11 is in Hateoas package :-
-------------------------------------------------

Question 11 : Configure hateoas with your springboot application. Create an api which returns User Details along with url to show all topics.

Explanation : I have configured the hateoas and completed its implementation in UserControllerHateoas class.

---------------------------------------------------------------------------------------------------------------------------------------------------------
