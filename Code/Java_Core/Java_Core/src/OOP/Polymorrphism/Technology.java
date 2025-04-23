package OOP.Polymorrphism;

public class Technology {
    private String name;
    private String type;
    private int year;

    public Technology() {
    }

    public Technology(String name, String type, int year) {
        this.name = name;
        this.type = type;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
