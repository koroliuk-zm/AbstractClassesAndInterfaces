
package factoryMethodExample;

import java.util.ArrayList;

/**
 *
 * @author betha
 */
public class MineralWater_Borjomi extends Water {

    @Override
    ArrayList<Water> makeWaterPackage(int quantity) {
        ArrayList mineralWaterPackage = new ArrayList<>();
        for (int i = 1; i <= quantity; i++) {
            MineralWater_Borjomi borjomi = new MineralWater_Borjomi();
            mineralWaterPackage.add(borjomi);
        }

        System.out.println("One package of " + quantity + " borjomi has been made!");
        return mineralWaterPackage;

    }

}
