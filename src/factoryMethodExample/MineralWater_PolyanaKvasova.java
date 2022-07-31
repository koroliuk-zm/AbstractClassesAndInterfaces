package factoryMethodExample;

import java.util.ArrayList;

/**
 *
 * @author bethan
 */
public class MineralWater_PolyanaKvasova extends Water {

    @Override
    ArrayList<Water> makeWaterPackage(int quantity) {
        
        ArrayList mineralWaterPackage = new ArrayList<>();
 
        for(int i = 1; i <= quantity; i++) {
            MineralWater_PolyanaKvasova polyanaKvasova = new MineralWater_PolyanaKvasova();
            mineralWaterPackage.add(polyanaKvasova);
        }

        System.out.println(quantity / 10 + " packages of 10 Polyana Kvasova have been made!");
        return mineralWaterPackage;

    }

}
