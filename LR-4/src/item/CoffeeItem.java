package item;

public class CoffeeItem {
    private String type;
    private String state;
    private double price;
    private double weight;

    public CoffeeItem(String type, String state, double price, double weight) {
        this.type = type;
        this.state = state;
        this.price = price;
        this.weight = weight;
    }
    public double getPrice() {
        return price;
    }
    public double getWeight() {
        return weight;
    }
    @Override
    public String toString() {
        return "Type: " + type + ", State: " + state + ", Weight: " + weight + " kg, Price: " + price + " grn";
    }

}
