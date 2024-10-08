package structural.flyweight.problem;

public class Book {
    private String name;
    private double price;
    private String type;
    private String distributor;
    private String otherData;

    public Book(String name, double price, String type, String distributor, String otherData) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.distributor = distributor;
        this.otherData = otherData;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDistributor() {
        return distributor;
    }

    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }

    public String getOtherData() {
        return otherData;
    }

    public void setOtherData(String otherData) {
        this.otherData = otherData;
    }
}
