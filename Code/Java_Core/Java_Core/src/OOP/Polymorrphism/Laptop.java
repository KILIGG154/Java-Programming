package OOP.Polymorrphism;

public class Laptop extends Technology{
    private String brand;
    private String color;
    private double price;

    public Laptop() {
    }

    public Laptop(String name, String type, int year, String brand, String color, double price) {
        super(name, type, year);
        this.brand = brand;
        this.color = color;
        this.price = price;
    }
    // đây là tính override (ghi đè lại) trong khi phương thức getName của class Technology chỉ trả về name của class Technology thì ở đây ta đã ghi đè lại phương thức getName để trả về tên và brand của laptop
    @Override
    public String getName() {
        return brand + " " + super.getName();
    }

    public String getBrand() {
        return brand;
    }

    // hãy nhìn ở đây ta có tận 3 method total dùng để tính giá cả nhưng các tính giá mỗi phương thức khác nhau ta gọi đây là overloading
    public double total(){
        return price;
    } // lấy giá gốc

    public double total(int quantity){
        return price * quantity;
    } // lấy giá theo số lượng

    public double total(int quantity, double discount){
        return price * quantity - discount;
    } // lấy giá theo số lượng và giảm giá


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
