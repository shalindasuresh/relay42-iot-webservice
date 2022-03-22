
# Relay42 IOT Device Webservice

Restful webservice for simulate readings from iot devices


![Logo](https://www.pngkey.com/png/detail/189-1890854_coo-relay42-transparent-logo.png)


#  Relay42 IOT Device Webservice

The solution is java spring boot based restful Webservice allowing clients to query the device data coming through pipeline.


## Technical Diagram

![Pipeline](https://shalindarelay42.s3.amazonaws.com/Untitled+Diagram.drawio+(3).png)
## Run Locally



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

username : api_user
password : User@123

http://localhost:8000/openapi/swagger-ui/index.html

