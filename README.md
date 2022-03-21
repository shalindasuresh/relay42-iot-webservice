# Relay42 IOT Device Webservice

Restful webservice for simulate readings from iot devices


## Technologies
###Springboot
###Cassandra
###Docker


### Start the web service


1. Install dependencies

````bash
mvn clean install
````

2. Run Test cases

````bash
mvn test -Dtest=DeviceAnalyzerApplicationTests
````
3. Run the application

````bash
mvn spring-boot:run
````

4. Access Rest API documentation at

http://localhost:8000/openapi/swagger-ui/index.html
