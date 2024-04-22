package project1;
import java.util.Scanner;
public class EcommerceSystem {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        
        ELectronicProduct smartphone = new ELectronicProduct("smartphone", 1 , 1 , "Samsung", 599.99f); 
        ClothingProduct tShirt = new ClothingProduct("Medium", "Cotton", 2, "T-shirt", 19.99f);
        BookProduct oopBook = new BookProduct("O'Reilly", "X Publications", 3, "OOP", 39.99f);
        
        System.out.println("Welcome to the E-Commerce System!");
        System.out.println("Please enter your ID:");
        int id=scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Please enter your name:");
        String name=scanner.nextLine();
        
        System.out.println("Please enter your address:");
        String address=scanner.nextLine();
        
        System.out.println("How many products you want to add to your cart?");
        int nProducts=scanner.nextInt();
        Product[] products = new Product[nProducts];
        
        Customer customer = new Customer(id, name, address);
        Cart cart = new Cart(id, nProducts, products);
        
        for (int i=0; i<nProducts; i++) {
            System.out.println("Which product would you like to add? 1- Smartphones 2- T-shirt 3- OOP book");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {
                case 1:
                    cart.addProduct(smartphone);
                    break;
                case 2:
                    cart.addProduct(tShirt);
                    break;
                case 3:
                    cart.addProduct(oopBook);
                    break;
                default:
                    System.out.println("Invalid choice! Choose a number between 1-3.");
                    i--;
                    continue;
            }
        }
            float totalPrice = cart.calculatePrice();
            System.out.println("Your total is $"+totalPrice+" Would you like to place the order? 1-Yes 2- No");
            int OrderChoice=scanner.nextInt();
                Order order = new Order( customer.getCustomerId(), 1, cart.getProducts(), cart.calculatePrice());

            if(OrderChoice==1){
                cart.placeOrder();
                order.printOrderInfo();
            }else if(OrderChoice==2)
                System.out.println("Order wasn't placed");
            System.out.println("Would you like to remove a product from your cart? 1-yes 2-No");
            int removeChoice = scanner.nextInt();
            if(removeChoice <= nProducts && removeChoice != 0){
                System.out.println("Enter index of product you want to remove");
                int indexToRemove = scanner.nextInt();
                cart.removeProduct(indexToRemove);
                System.out.println("Product removed.");
                order.printOrderInfo();               
            }else 
                System.out.println("Invalid");
           
    }
                        
    }

    
    

