package homework_0;

public class Drink {
    private int id;
    protected String name;
    protected double volume;
    
    
    public Drink(int id, String name, double d) {
        this.id = id;
        this.name = name;
        this.volume = d;
    }

    

    @Override
    public String toString() {
        return name + ", volume=" + volume;
    }



    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getVolume() {
        return volume;
    }

    
}
