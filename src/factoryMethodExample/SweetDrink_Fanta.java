
package factoryMethodExample;

import java.util.ArrayList;

/**
 *
 * @author bethan
 */
public class SweetDrink_Fanta extends Drink {

    @Override
    ArrayList<Drink> makeDrinkPackage(int quantity) {
        ArrayList sweetWaterPackage = new ArrayList<>();
        for (int i = 1; i <= quantity; i++) {
            SweetDrink_Fanta fanta = new SweetDrink_Fanta();
            sweetWaterPackage.add(fanta);
        }

        System.out.println("One package of " + quantity + " Fanta has been made!");
        return sweetWaterPackage;

    }

}
