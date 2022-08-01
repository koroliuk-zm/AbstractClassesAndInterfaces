package factoryMethodExample;

import java.util.ArrayList;

public class MineralDrinkFactory extends DrinkFactory {

    @Override
    public Drink getDrink(String type) {
        switch (type) {
            case "morshinska":
                return new MineralDrink_Morshinska();
            case "borjomi":
                return new MineralDrink_Borjomi();
            case "polyanaKvasova":
                return new MineralDrink_PolyanaKvasova();
            default:
                return new MineralDrink_PolyanaKvasova();
        }

    }

    @Override
    public ArrayList getDrinkPackage(int quantity, String type) {
        Drink drink = getDrink(type);
        if(quantity % 6 != 0) {
            System.out.println("Mineral water must be packaged in multiples of 6");
            return null;
        }
        ArrayList drinkPackage = drink.makeDrinkPackage(quantity);
        return drinkPackage;
    }

}
