package OOP.Abstraction;

public class Mercedes extends Car{
    private double price;
    private String color;

    public Mercedes() {
    }
    public Mercedes(double price, String color) {
        this.price = price;
        this.color = color;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void makeSound() {
        System.out.println("Brummmm brummmm");
    }
}
