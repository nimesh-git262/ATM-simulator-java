import java.util.ArrayList;

public class SuperMarket {
    private ArrayList<Product> cart;

    public SuperMarket(){
        cart = new ArrayList<>();
    }
    public void addProduct(Product product){
        cart.add(product);
        System.out.println("Product added");
    }
    public void generateBill(){
        double total = 0;
        System.out.println("====BILL====");
        System.out.println("ID\tName\tPrice\tQuantity\tAmount");

        for(Product p : cart){
            double amount = p.getPrice()*p.getQuantity();

            System.out.println(p.getId()+" " + p.getName()+" " + p.getPrice()+ " " + p.getQuantity()
        );
        total += amount;
        }
        System.out.println("Total Amount: " + total);
    }

    public void viewProduct(){
        for(Product p : cart){
            System.out.println(p.getId()+ " "+p.getName()+" "+p.getPrice()+" "+p.getQuantity()
        );
        }
    }
}
