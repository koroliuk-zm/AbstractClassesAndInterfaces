
package factoryMethodExample;

import java.util.ArrayList;

/**
 *
 * @author betha
 */
public class MineralDrink_Borjomi extends Drink {

    @Override
    ArrayList<Drink> makeDrinkPackage(int quantity) {
        ArrayList mineralDrinkPackage = new ArrayList<>();
        for (int i = 1; i <= quantity; i++) {
            MineralDrink_Borjomi borjomi = new MineralDrink_Borjomi();
            mineralDrinkPackage.add(borjomi);
        }

        System.out.println(quantity / 6 + " packages of 6 Borjomi have been made!");
        return mineralDrinkPackage;

    }

}
