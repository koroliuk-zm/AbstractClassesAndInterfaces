package factoryMethodExample;

import java.util.ArrayList;

/**
 *
 * @author bethan
 */
public class MineralDrink_PolyanaKvasova extends Drink {

    @Override
    ArrayList<Drink> makeDrinkPackage(int quantity) {
        
        ArrayList mineralWaterPackage = new ArrayList<>();
 
        for(int i = 1; i <= quantity; i++) {
            MineralDrink_PolyanaKvasova polyanaKvasova = new MineralDrink_PolyanaKvasova();
            mineralWaterPackage.add(polyanaKvasova);
        }

        System.out.println(quantity / 6 + " packages of 6 Polyana Kvasova have been made!");
        return mineralWaterPackage;

    }

}
