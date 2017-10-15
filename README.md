# Sample Java REST service for SAP Cloud Platfrom

Sample Java REST service for SAP Cloud Platform, created during [#sitMUC 2017](https://www.sitmuc.com/2017-1/) SAP Community Open Space.

 * Based on Spring Boot
 * Does not really do anything special, than showing three sample products upon a `GET` request to `/test-api/products`

###Run it locally

 * Run `mvn spring-boot:run`
 
###Create a war file for deployment to SAP Cloud Platform

 * Run `mvn -P prod clean package`




