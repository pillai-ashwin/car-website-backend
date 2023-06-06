# Car Website Backend

Project repository to explore working with microservices using Java and Spring Boot to build `vehicles-api` that can communicate with separate `location` and `pricing` services.

## Instructions

Check each component to see its details and instructions. Note that all three applications
should be running at once for full operation.

- [Vehicles API](vehicles-api/README.md)
- [Pricing Service](pricing-service/README.md)
- [Boogle Maps](boogle-maps/README.md)

## Dependencies

The project requires the use of Maven and Spring Boot, along with Java v11.

## Section 1: Convert the Pricing Service

### The Pricing Service is converted to a microservice.

The Pricing Service API is converted to a microservice with Spring Data REST, without the need to explicitly include code for the Controller or Service.

### A Eureka server is used and the Pricing Service is registered with that server.

A Eureka server is implemented and running on port 8761. The Pricing Service is registered on that server and is named pricing-service.

The Vehicles API should be able to use the Eureka server to call the pricing service.


## Section 2: Implement the Vehicles API

### The Vehicles API can perform CREATE operations.

The Vehicles API is able to create a new vehicle based on input from the user with a POST request.

### The Vehicles API can perform READ operations.

The Vehicles API can receive GET requests from a user, and read back either a list of all existing vehicles, or the data for a single vehicle.

### The Vehicles API can perform UPDATE operations.

The Vehicles API can update an existing vehicle through input from the user.

### The Vehicles API can perform DELETE operations.

The Vehicles API can delete an existing vehicle when requested by the user.

### The Vehicles API can request location data from Boogle Maps, and pricing data from the Pricing Service.

The Vehicles API is able to consume information from the separate Boogle Maps and Pricing Service APIs, and return that information as part of the vehicle information for a single vehicle.

Note: Boogle Maps will assign a new random address each time a query is called, so don't fret if it changes between queries.

## Section 3: Testing the Vehicles API
Tests are implemented for the Vehicles API CarController that cover the CRUD (Create, Read, Update, Delete) operations.

All necessary dependencies are included in each Application's POM files, and the code runs successfully.

All necessary dependencies have been added to the relevant POM files, and the code is able to run both from tests and in launching the actual applications.

## API Documentation
### API documentation for the Vehicles API is implemented using Swagger.

API documentation for the Vehicles API is implemented using Swagger, and all related API queries are able to be run from there. The documentation is available at http://localhost:8080/swagger-ui.html when the application is running.
