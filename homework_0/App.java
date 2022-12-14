package homework_0;

public class App {
    public static void main(String[] args) {
        HotDrink cappuccino = new HotDrink(1, "Cappuccino", 0.2, 90, 120);
        HotDrink tea = new HotDrink(2, "Black Tea", 0.3, 75, 40);
        HotDrink espresso = new HotDrink(3, "Espresso", 0.1, 100, 90);
        Drink pepsi = new Drink(4, "Pepsi", 0.5, 70);

        HotDrinksVendingMachine machine = new HotDrinksVendingMachine();
        machine.addDrink(cappuccino);
        machine.addDrink(tea);
        machine.addDrink(espresso);
        machine.addDrink(pepsi);

        machine.showDrinks(); // Хотим посмотреть какие напитки есть в автомате
        machine.getDrink(espresso); //Покупаем напиток
        machine.showDrinks(); 
        System.out.println(machine.getCash()); //Сумма денег в автомате
        machine.getDrink(tea);
        machine.showDrinks();
        System.out.println(machine.getCash());
    }
}
