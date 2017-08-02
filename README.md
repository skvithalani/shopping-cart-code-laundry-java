# ShoppingCart


### Problem background

We have an existing shopping cart application, with a small set of eCommerce/shopping cart rules. 
Rules include calculation of total price, discount and loyalty points calculation. 
Most of the business logic is implemented in single method `ShoppingCart.checkout`.
There is a `/products` endpoint to list the products. 

### Prerequisites

Java 1.8

### Build locally

In your terminal run `./gradlew`

### Run locally

In your terminal run `./gradlew bootrun`. Then navigate to http://localhost:8080/v1/products in your browser to test the app is running.


### Potential story cards

* Apply a discount of 20% on all plastic chairs.
* Apply a discount of 10% on total orders of more than $1000.00
* Buy a table and chair and get a $20 discount 


### Tasks still to complete for JoI team

- [ ] extensions to do with the business domain
- [ ] extensions to do with the API
- [ ] Add more instructions to README





