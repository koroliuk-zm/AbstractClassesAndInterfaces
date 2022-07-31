
package factoryMethodExample;

import java.util.ArrayList;

/**
 *
 * @author bethan
 */
public class MineralWater_Morshinska extends Water {
    
    @Override
    ArrayList<Water> makeWaterPackage(int quantity) {
        ArrayList mineralWaterPackage = new ArrayList<>();
        for(int i = 1; i <= quantity; i++) {
            MineralWater_Morshinska mineralWater_morshinska = new MineralWater_Morshinska();
            mineralWaterPackage.add(mineralWater_morshinska);
        }
        
        System.out.println("One package of " + quantity + " morshinska has been made!");
        return mineralWaterPackage;
        
    }    
}
