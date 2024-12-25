package src;

public class Main {
    public static void main(String[] args) {
        Product goodsA = new Product("商品A",50.0);
        Product goodsB = new Product("商品B",30.0);
        Product goodsC = new Product("商品C",20.0);

        ShoppingCart cart = new ShoppingCart();

        cart.addItem(goodsA);
        cart.addItem(goodsB);
        cart.addItem(goodsC);

        System.out.println("ショッピングカートの内容:");
        cart.showItems();
        
        System.out.println("ショッピングカートの合計金額: $" + cart.getTotalPrice());
    }
}
