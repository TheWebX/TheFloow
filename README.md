# MapReduce Challenge

For start this Spring Boot app, you neet to use the follows commands:

#### How to start it
* For upload new data (from the data.json file, already into the classpath) use the command
	> mvn spring-boot:run -Drun.arguments="write"
	
* For elaborate the collected data on the DB by MapReduce, use the command: 
	> mvn spring-boot:run -Drun.arguments="elaborate"
	
* For read the popular words elaborated, use the command: 
	> mvn spring-boot:run -Drun.arguments="word"
	OR for the specific (example for word "hello")
	> mvn spring-boot:run -Drun.arguments="word hello"
	