public class Car {
    private String make, model;
    private double price;
    private int year;

    public Car(String make, String model, int year, double price) {
        setMake(make);
        setModel(model);
        setPrice(price);
        setYear(year);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString()
    {
        return String.format("%d %s %s priced at: $%.2f", year,make,model,
                                price);
    }
}
