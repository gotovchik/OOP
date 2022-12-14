package homework_0;

public class HotDrink extends Drink {
    private int temperature;

    public HotDrink(int id, String name, double volume, int temperature) {
        super(id, name, volume);
        this.temperature = temperature;
    }


    @Override
    public String toString() {
        return this.name + ", volume = " + this.volume + ", temperature = " + temperature; 

    }
    s
    
}
