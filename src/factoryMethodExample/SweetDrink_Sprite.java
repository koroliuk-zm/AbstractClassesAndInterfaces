
package factoryMethodExample;

import java.util.ArrayList;

public class SweetDrink_Sprite extends Drink {

    @Override
    ArrayList<Drink> makeDrinkPackage(int quantity) {
        ArrayList sweetWaterPackage = new ArrayList<>();
        for (int i = 1; i <= quantity; i++) {
            SweetDrink_Sprite sprite = new SweetDrink_Sprite();
            sweetWaterPackage.add(sprite);
        }

        System.out.println("One package of " + quantity + " Sprite has been made!");
        return sweetWaterPackage;

    }

}
