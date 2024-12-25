package src;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Product> items;

    public ShoppingCart(){
        this.items = new ArrayList<>();
    }

    public void addItem(Product product) {
        items.add(product);
    }
    
    public double getTotalPrice() {
        double total = 0.0;
        for (Product product : items) {
            total += product.getPrice();
        }
        return total;
    }
    
    public void showItems() {
        for (Product product : items) {
            System.out.println("商品名: " + product.getName() + ", 価格: $" + product.getPrice());
        }
    }
    
}