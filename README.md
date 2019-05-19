# JSON_To_JAVAObjectViceVersa
1.	Create a POJO class (Plain Old Java Class) which contains elements and its getters and setters, this class implements Serializable interface. All the elements in this class should be private.
2.	 To create a reusable code which converts Java object to JSON and JSON to Java Object we create a Utility class. This contains ObjectMapper class obtained from Jackson API.
(Add Jackson Core asl and Jackson mapper asl dependencies in POM.xml).
•	To convert Java object to JSON we use a method from ObjectMapper class that is writeValueasString()
•	To convert JSON to Java Object we use a method from ObjectMapper class that is readValue()
3.	In Utility class create an object to the ObjectMapper class and call the method writeValueasString() with the help of object. Here the method accepts a parameter which is an object. And in this we need to catch 3 kinds of exceptions
•	JSONGenerationException
•	JSONMappingException
•	IOException
4.	To convert JSON to Java Object in the utility class, we use java generic <T>. Here <T> is a Java generic type which means it is of any kind of object.  Now with the help of object crated to the mapper class we can call readValue() which accepts 2 parameters one is JSON String and another one is class.
5.	Here we need to catch 3 kinds of exceptions while converting JSON to Java Object.
•	JSONPasrsingException
•	JSONMappingException
•	IOException
6.	To test whether the above statements are working we create a test class which contains object of POJO class and with the help of object , we call elements of POJO class.
7.	To use the reusable code in the utility library we use className.method and its respective parameters.


