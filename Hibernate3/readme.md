Solution for Question 1 to Question 4 is in EmbeddedAndPersistence package

Question 1 : Create a class Address for Author with instance variables streetNumber, location, State.

Solution 1 : Created the Address class in the EmbeddedAndPersistence package. And provided the @Embeddable annotation to it, so it can be embedded by other entities.

Question 2 : Create instance variable of Address class inside Author class and save it as embedded object.

Solution 2 : Created an Author class and created an Address instance by the name of address and provided @Embedded annotation to it, and used the @AttributeOverride annotation to override the instances name to the database table.

Question 3 : Introduce a List of subjects for author.

Solution 3 : I have created a class of subject which consists instance of subjectName. And I have created a list of subject in Author class.

Question 4 : Persist 3 subjects for each author.

Solution 4 : To persist 3 subjects for each author. To limit the input in the list to only 3 subjects, I have used @Size annotation and provided a parameter min=3, which will limit the input of subject to only 3. I have created a test in Hibernate3ApplicationTests file by the name of testPersistence(). There I have created an object of Author and address and then added the subjects in it. And then saved it to database using save method.

Question 5 : Create an Entity book with an instance variable bookName.

Solution 5 : Since this question is part of question 6, question 7 and question 8 also. So, I have created Entity book in all three packages named OneToOneMapping, OneToManyMapping and ManyToManyMapping.

Question 6 : Implement One to One mapping between Author and Book.

Solution 6 : Solution is in OneToOneMapping package. I have done One To One mapping between AuthorOneToOne file and BookOneToOne file. And created a AuthorController file for the mappings. And an AuthorRepository interface, which helps to implement database methods. An AuthorService interface which is implemented by AuthorServiceImpl class.

Question 7 : Implement One to Many Mapping between Author and Book(Unidirectional, BiDirectional and without additional table ) and implement cascade save.

Solution 7 : Solution for this is in the OneToManyMapping package. In this package there are two packages named UniDirectional and Bidirectional which have Unidirectional mapping and Bidirectional mapping respectively. Unidirectional mapping is done between AuthorOneToManyMappingUnidirectional and BookOneToManyUnidirectional file. Bidirectional mapping is done between AuthorOneToManyBidirectional and BookOneToManyBidirectional files. Its testing methods are in Hibernate3Application file which is in test folder by the names of testOneToManyUniDirectional() and testOneTomManyBiDirectional() methhods.

Question 8 : Implement Many to Many Mapping between Author and Book.

Solution 8 : Solution for this is in ManyToManyMapping package. Mapping is done between AuthorManyToMany file and BookManyToMany file. Its testing method is in Hibernate3Application file which is in test folder by the name of testManyToManyMapping().

Question 9 : Which method on the session object can be used to remove an object from the cache?

Solution 9 :   First-level cache always Associates with the Session object.
Hibernate uses this cache by default. Here, it processes one transaction after another one,
means wont process one transaction many times.
Mainly it reduces the number of SQL queries it needs to generate within a given transaction.
That is instead of updating after every modification done in the transaction,
it updates the transaction only at the end of the transaction.
We can use session evict() method to remove a single object from the hibernate first level cache.

Question 10 : What does @transactional annotation do?

Solution 10 : Spring creates proxies for all the classes annotated with @Transactional, either on the
class or on any of the methods. The proxy allows the framework to inject transactional logic before
and after the running method, mainly for starting and committing the transaction.Any self-invocation
calls will not start any transaction, even if the method has the @Transactional annotation.
Another caveat of using proxies is that only public methods should be annotated with @Transactional.
Methods of any other visibilities will simply ignore the annotation silently as these are not proxied.