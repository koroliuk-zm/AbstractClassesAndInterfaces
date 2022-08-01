
package factoryMethodExample;

import java.util.ArrayList;

/**
 *
 * @author bethan
 */
public class SweetDrink_CocaCola extends Drink {

    @Override
    ArrayList<Drink> makeDrinkPackage(int quantity) {
        ArrayList sweetWaterPackage = new ArrayList<>();
        for (int i = 1; i <= quantity; i++) {
            SweetDrink_CocaCola cocaCola = new SweetDrink_CocaCola();
            sweetWaterPackage.add(cocaCola);
        }

        System.out.println("One package of " + quantity + " CocaCola has been made!");
        return sweetWaterPackage;

    }

}
