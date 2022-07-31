
package factoryMethodExample;

import java.util.ArrayList;

/**
 *
 * @author bethan
 */
public class SweetWater_CocaCola extends Water {

    @Override
    ArrayList<Water> makeWaterPackage(int quantity) {
        ArrayList sweetWaterPackage = new ArrayList<>();
        for (int i = 1; i <= quantity; i++) {
            SweetWater_CocaCola cocaCola = new SweetWater_CocaCola();
            sweetWaterPackage.add(cocaCola);
        }

        System.out.println("One package of " + quantity + " CocaCola has been made!");
        return sweetWaterPackage;

    }

}
