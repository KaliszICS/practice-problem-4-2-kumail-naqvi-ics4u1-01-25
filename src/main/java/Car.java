/**
 * Represents a Car with make, model, year, and price.
 * @author Kumail
 * @version 1.0
 */
public class Car {
    private String make;
    private String model;
    private int year;
    private double price;

    /**
     * Constructs a Car with the given make, model, year, and price.
     *
     * @param make  car make
     * @param model car model
     * @param year  car year
     * @param price car price
     */
    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    /** 
     * @return the make 
    */
    public String getMake() { return make; }

    /** 
     * @param make sets the make 
    */
    public void setMake(String make) { this.make = make; }

    /**
     *  @return the model 
    */
    public String getModel() { return model; }

    /** 
     * @param model sets the model 
    */
    public void setModel(String model) { this.model = model; }

    /** 
     * @return the year 
    */
    public int getYear() { return year; }

    /** 
     * @param year sets the year 
    */
    public void setYear(int year) { this.year = year; }

    /**
     *  @return the price 
    */
    public double getPrice() { return price; }

    /** 
     * @param price sets the price 
    */
    public void setPrice(double price) { this.price = price; }
}