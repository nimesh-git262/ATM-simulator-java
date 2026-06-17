import java.util.Scanner;

public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        SuperMarket market = new SuperMarket();

        while(true){
            System.out.println("====SUPER MARKET BILLING SYSTEM====");
            System.out.println("1. Add Product");
            System.out.println("2. View Product");
            System.out.println("3. Generate Bill");
            System.out.println("4. Exit");

            System.out.println("Enter Choice");
            int Choice = sc.nextInt();

            sc.nextLine();

            if(Choice==1){ 
                System.out.println("Enter Product Id: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.println("Enter Product Name: ");
                String name = sc.nextLine();

                System.out.println("Enter Price: ");
                double price = sc.nextDouble();

                System.out.println("Enter Quantity: ");
                int quantity = sc.nextInt();

                Product product = new Product(id, name, price, quantity);
                market.addProduct(product);
            }else if(Choice==2){
                market.viewProduct();
            }else if(Choice==3){
                market.generateBill();
            }else if ((Choice==4)) {
                System.out.println("Thnal You");
                sc.close();
                return;
            }else{
                System.out.println("invalid choice");
            }
        }
    }
}