package homework_0;

public class HotDrink extends Drink {
    private int temperature;

    public HotDrink(int id, String name, double volume, int temperature, int price) {
        super(id, name, volume, price);
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + ", volume = " + this.volume + ", temperature = " + temperature + ", price = "
                + price;

    }

    public int getTemperature() {
        return temperature;
    }

}
