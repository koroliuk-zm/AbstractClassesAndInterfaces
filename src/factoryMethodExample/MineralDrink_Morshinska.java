
package factoryMethodExample;

import java.util.ArrayList;

/**
 *
 * @author bethan
 */
public class MineralDrink_Morshinska extends Drink {
    
    @Override
    ArrayList<Drink> makeDrinkPackage(int quantity) {
        ArrayList mineralDrinkPackage = new ArrayList<>();
        for(int i = 1; i <= quantity; i++) {
            MineralDrink_Morshinska mineralWater_morshinska = new MineralDrink_Morshinska();
            mineralDrinkPackage.add(mineralWater_morshinska);
        }
        
        System.out.println(quantity / 6 + " packages of 6 Morshinska have been made!");
        return mineralDrinkPackage;
        
    }    
}
