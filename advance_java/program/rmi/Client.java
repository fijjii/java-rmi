import java.rmi.Naming;

public class Client {
    public static void main(String[] args) {
        try {
            SellingPrice ref = (SellingPrice) Naming.lookup("rmi://localhost:1099/SellingPriceService");

            double costPrice = 1000;
            double discount = 100;

            double sellingPrice = ref.calculateSellingPrice(costPrice, discount);
            System.out.println("Cost Price: Rs. " + costPrice);
            System.out.println("Discount: Rs. " + discount);
            System.out.println("Selling Price: Rs. " + sellingPrice);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
