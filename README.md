# ShoppingCart


### Problem background

We have an existing shopping cart application, with a small set of eCommerce/shopping cart rules. 
Rules include calculation of total price, discount and loyalty points calculation. 
Most of the business logic is implemented in single method `ShoppingCart.checkout`.

### Prerequisites

Java 1.8

### Build locally

`./gradlew`

### Run locally

`./gradlew bootrun`
http://localhost:8080/v1/products


### Potential story cards

In no particular order:

* Implement a discount of 20%, the products eligible for which will be identified by the product code starting with "DIS_20". On purchase of each such product, the customer earns, 1 loyalty point for every $20 spent
* Implement an offer on group of products, eg. "Buy 2 get 1 free" on specific products identified by product code starting with "BULK_BUY_2_GET_1"


### Tasks still to complete for JoI team

- [ ] extensions to do with the business domain
- [ ] extensions to do with the API
- [ ] Add more instructions to README





