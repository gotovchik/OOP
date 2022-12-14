package homework_0;

public class Drink {
    protected int id;
    protected String name;
    protected double volume;
    protected int price;
    

    public Drink(int id, String name, double volume, int price) {
        this.id = id;
        this.name = name;
        this.volume = volume;
        this.price = price;
        

    }

    @Override
    public String toString() {
        return id + " " + name + ", volume=" + volume + ", price = " + price;
    }

    public String getName() {
        return name;
    }

    public double getVolume() {
        return volume;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

}
