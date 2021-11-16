## Customer Details Microservice
Basic API for storing and retrieving customer information. Written in Java and using the Spring Boot framework.

[Live API](https://freekvandam.nl/customer-details-service/v1/customers)

### Requirements
1. Store a customer with the following (required) data points
   * First name
   * Last name
   * Address (street and number, postal code, country)
   * Contact information (email and phone number)
   * Payment details (payment method, credit card number and expiry date)
   * Quote (to be obtained from external REST API during between request and response, and revert to default value if not available)
2. Create an endpoint to retrieve all stored customers

### Endpoints
* GET /customers/: obtain a list of all entered customers
* POST /customers/: add a customer to the database


### Even better if: main ideas for additions and further improvements
* Add unit and integration tests for existing functionality
* Limit access to authenticated users
* Allow only for unique customers (e.g. using the email field)
* ...


