public class Product {
    private String name;
    private double price;
    private int quant;

    public Product(String initialName, double initialPrice, int initialQuantity){
        
        this.name = initialName;
        this.price = initialPrice;
        this.quant = initialQuantity;
    }

    public void printProduct() {
        System.out.println(name + ", " + price + ", " + quant);
    }

}
