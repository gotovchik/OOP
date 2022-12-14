package homework_0;

import java.util.LinkedList;
import java.util.List;

public class HotDrinksVendingMachine extends VendingMachine {
    private List<Drink> drinks = new LinkedList<Drink>();
    private int cash;
    private int drinksCount;

    public HotDrinksVendingMachine() {
        this.drinksCount = 0;
    }

    public void addDrink(Drink drink) {
        this.drinks.add(drink);
        this.drinksCount += 1;
    }

    public void getDrink(Drink drink) {
        this.drinks.remove(drink);
        drinksCount -= 1;
        cash += drink.getPrice();

    }

    public void showDrinks() {
        System.out.println("Drinks count = " + this.drinksCount);
        for (Drink drink : drinks) {
            System.out.println(drink.toString());
        }
    }

    public int getCash() {
        return cash;
    }

    public int getDrinksCount() {
        return drinksCount;
    }
}
