package factoryMethodExample;

import java.util.ArrayList;

public abstract class DrinkFactory {

    public abstract Drink getDrink(String type);

    public ArrayList getDrinkPackage(int quantity, String type) {
        Drink drink = getDrink(type);
        ArrayList drinkPackage = drink.makeDrinkPackage(quantity);
        return drinkPackage;
    }

}
