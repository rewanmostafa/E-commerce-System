package project1;
public class Order {
    private int customerId;
    private int orderId;
    private Product[] products;
    private float totalPrice;
    
    public Order(int customerId, int orderId, Product[] products, float totalPrice) {
        this.customerId = Math.abs(customerId);
        this.orderId = Math.abs(orderId);
        this.products = products;
        this.totalPrice = Math.abs(totalPrice);
    }

    public void printOrderInfo() {
        System.out.println("Your order's symmary: ");
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer ID: " + customerId);
        for (Product product : products) {
            if (product != null) {
                System.out.println(product.getName()+" $" + product.getPrice());
            }
        }
        System.out.println("Total price: $"+totalPrice);
    }    
    
}
