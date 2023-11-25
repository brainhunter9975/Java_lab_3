package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cart cart = new Cart();
        while (true) {
            // set data for product
            System.out.println("Enter details for product:");
            System.out.print("Enter ID: ");
            int productId = scanner.nextInt();
            scanner.nextLine(); // clear buffer
            System.out.print("Enter Name: ");
            String productName = scanner.nextLine();
            System.out.print("Enter Price: ");
            double productPrice = scanner.nextDouble();
            scanner.nextLine();

            // product setup
            Product product1 = new Product(productId, productName, productPrice);

            // cart setup
            cart.addProduct(product1);

            // cart output
            System.out.println("Cart contents:");
            for (Product product : cart.getProducts()) {
                System.out.println("ID: " + product.getId() + ", Name: " + product.getName() + ", Price: $" + product.getPrice());
            }
            System.out.print("Do you want to delete products from cart?(y/n): ");
            String choose = scanner.nextLine();
            if (choose.equals("y")) {
                System.out.print("Enter product Id: ");
                String prodDeleteId = scanner.nextLine();
                int prodDeleteId1 = Integer.parseInt(prodDeleteId);
                cart.removeProductById(prodDeleteId1);
                System.out.print("Do you want to finish setting up cart and go to set up order?(y/n): ");
                String choose2 = scanner.nextLine();
                if (choose2.equals("y")){
                    break;
                }
            }
            System.out.print("Do you want to finish setting up cart and go to set up order?(y/n): ");
            String choose3 = scanner.nextLine();
            if (choose3.equals("y")){
                break;
            }
        }
            // order setup
        Order order = new Order(1001, cart.getProducts(), OrderStatus.PENDING);

        // order output
        System.out.println("\nOrder ID: " + order.getOrderId());
        System.out.println("Products in the order:");
        for (Product product : order.getProducts()) {
            System.out.println("ID: " + product.getId() + ", Name: " + product.getName() + ", Price: $" + product.getPrice());
        }
        System.out.println("Order Status: " + order.getStatus());
        scanner.close();
    }
}