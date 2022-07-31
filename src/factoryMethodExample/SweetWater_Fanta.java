
package factoryMethodExample;

import java.util.ArrayList;

/**
 *
 * @author bethan
 */
public class SweetWater_Fanta extends Water {

    @Override
    ArrayList<Water> makeWaterPackage(int quantity) {
        ArrayList sweetWaterPackage = new ArrayList<>();
        for (int i = 1; i <= quantity; i++) {
            SweetWater_Fanta fanta = new SweetWater_Fanta();
            sweetWaterPackage.add(fanta);
        }

        System.out.println("One package of " + quantity + " Fanta has been made!");
        return sweetWaterPackage;

    }

}
