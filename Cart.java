package project1;
public class Cart {
   private int customerId;
   private int nProducts;
   private Product[] products;

    public Cart(int customerId, int nProducts, Product[] products) {
        this.customerId = customerId;
        this.nProducts = nProducts;
        this.products = products;
    }
   
   public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getnProducts() {
        return Math.abs(nProducts);
    }

    public void setnProducts(int nProducts) {
        this.nProducts = nProducts;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
    
    
    public void addProduct(Product product) {
        for (int i = 0; i<products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                break;
            }
        }
    }

    public void removeProduct(int index) {
        for (int i = 0; i<products.length; i++) {
           if(i >= 0 && index < nProducts){
               products[i]=null;
               break;
           } 
        }
    }

    public float calculatePrice() {
        float totalPrice = 0;
        for(int i=0; i<nProducts; i++){
            totalPrice += products[i].getPrice();
        }
        return totalPrice;
    }
    
    public void placeOrder(){
          System.out.println("Order was placed successfully!");

    }
    }
    

