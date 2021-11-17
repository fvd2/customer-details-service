## Customer Details Microservice
Basic API for storing and retrieving customer information. Written in Java and using the Spring Boot framework.

[Live API](https://freekvandam.nl/customer-details-service/v1/customers)

### How to run
1. Clone repo and create package
```
git clone https://github.com/fvd2/customer-details-service && cd customer-details-service
./mvnw package && java -jar target/gs-spring-boot-docker-0.1.0.jar
```

2. Populate MONGODB_URI environment variable in Dockerfile

3. Build and run docker container
```
docker build -t fvd2/customer-details-service .
docker run -p 8080:8080 fvd2/customer-details-service
```

### Requirements
1. Store a customer with the following (required) data points
   * First name
   * Last name
   * Address (street and number, postal code, country)
   * Contact information (email and phone number)
   * Payment details (payment method, credit card number and expiry date)
   * Quote (to be obtained from external REST API during between request and response; revert to default value if not available)
2. Create an endpoint to retrieve all stored customers

### Endpoints
#### GET /v1/customers/ 
* Returns a list of all entered customers

#### POST /v1/customers/
* Adds a customer to the database
* Bonus: validates input data (see example below)

* Example customer and validation rules:
```
{
	"firstName": "John", // not blank
	"lastName": "Doe", // not blank
	"contactDetails": {
			"email": "john@doe.com", // unique and in email format
			"phoneNumber": "+31612345678" // not blank
	},
	"address": {
		"country": "The Netherlands", // not blank
		"city": "Amsterdam", // not blank
		"postalCode": "1700AA", // not blank
		"streetAndNumber": "Main street 100", // not blank
		"streetAdditional": "" // optional
	}, 
	"paymentDetails": {
		"paymentMethod": "CREDITCARD", // CREDITCARD, IDEAL or PAYPAL
		"creditCardNumber": "5200000000000000", // not null
		"creditCardExpirationDate": "12/22" // in MM/YY format and in future
	}
}
```

### Even better if: main ideas for additions and further improvements
* Add unit and integration tests for existing functionality
* Add filtering, sorting and pagination to GET /customers/ endpoint
* Improve error handling, e.g. provide more specific feedback on invalid input(s)
* Limit access to authenticated users
* ...

