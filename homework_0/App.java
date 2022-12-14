package homework_0;

public class App {
    public static void main(String[] args) {
        Drink pepsi =  new Drink(1, "Pepsi", 0.5);
        System.out.println(pepsi);
        HotDrink cappuccino = new HotDrink(22, "Cappuccino", 0.2, 90);
        System.out.println(cappuccino);

    }
}
