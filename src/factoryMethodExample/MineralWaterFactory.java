package factoryMethodExample;

import java.util.ArrayList;

/**
 *
 * @author bethan
 */
public class MineralWaterFactory extends WaterFactory {

    @Override
    public Water getWater(String type) {
        switch (type) {
            case "morshinska":
                return new MineralWater_Morshinska();
            case "borjomi":
                return new MineralWater_Borjomi();
            case "polyanaKvasova":
                return new MineralWater_PolyanaKvasova();
            default:
                return new MineralWater_PolyanaKvasova();
        }

    }

    @Override
    public ArrayList getWaterPackage(int quantity, String type) {
        Water water = getWater(type);
        if(quantity % 6 != 0) {
            System.out.println("Mineral water must be packaged in multiples of 6");
            return null;
        }
        ArrayList waterPackage = water.makeWaterPackage(quantity);
        return waterPackage;
    }

}
