
package factoryMethodExample;

import java.util.ArrayList;

public class SweetWater_Sprite extends Water {

    @Override
    ArrayList<Water> makeWaterPackage(int quantity) {
        ArrayList sweetWaterPackage = new ArrayList<>();
        for (int i = 1; i <= quantity; i++) {
            SweetWater_Sprite sprite = new SweetWater_Sprite();
            sweetWaterPackage.add(sprite);
        }

        System.out.println("One package of " + quantity + " Sprite has been made!");
        return sweetWaterPackage;

    }

}
