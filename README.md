# Project1
This is a simple E-Commerce system program in Java that models different types of products and their interactions with customers. It consists of several classes to represent products, customers, shopping carts, and orders.

## Classes

1. **Product**: Represents a generic product with attributes such as ID, name, and price.
2. **ElectronicProduct**: Subclass of Product, representing electronic products with additional attributes like brand and warranty period.
3. **ClothingProduct**: Subclass of Product, representing clothing products with attributes like size and fabric.
4. **BookProduct**: Subclass of Product, representing book products with attributes like author and publisher.
5. **Customer**: Represents a customer with attributes such as ID, name, and address.
6. **Cart**: Represents a shopping cart for a customer with methods to add/remove products, calculate total price, and place orders.
7. **Order**: Represents an order placed by a customer with attributes like customer ID, order ID, products, and total price.
8. **EcommerceSystem**: Entry point for the program with a main method to demonstrate the usage of other classes.

## Usage

1. Create instances of ElectronicProduct, ClothingProduct, and BookProduct to represent different types of products.
2. Create a Customer instance with customer ID, name, and address.
3. Create a Cart instance for the customer and add products to the cart.
4. Place an order for the products in the cart.
5. Print order information.

## Example

```java
// Create electronic product
ELectronicProduct smartphone = new ELectronicProduct("smartphone", 1 , 1 , "Samsung", 599.99f);

// Create clothing product
ClothingProduct tShirt = new ClothingProduct("Medium", "Cotton", 2, "T-shirt", 19.99f);

// Create book product
BookProduct oopBook = new BookProduct("O'Reilly", "X Publications", 3, "OOP", 39.99f);

// Create customer
Customer customer = new Customer(23010121, "Rewan Mostafa", "SidiBeshr, Alexandria");

// Create shopping cart
Cart cart = new Cart(id, nProducts, products);
cart.addProduct(electronicProduct);
cart.addProduct(clothingProduct);
cart.addProduct(bookProduct);

// Place order
cart.placeOrder();

// Print order info
Order order = new Order(customer.getCustomerId(), 1, cart.getProducts(), cart.calculatePrice());
order.printOrderInfo();
