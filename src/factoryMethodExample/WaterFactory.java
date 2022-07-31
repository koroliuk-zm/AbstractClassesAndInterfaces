package factoryMethodExample;

import java.util.ArrayList;

/**
 *
 * @author bethan
 */
public abstract class WaterFactory {

    public abstract Water getWater(String type);

    public ArrayList getWaterPackage(int quantity, String type) {
        Water water = getWater(type);
        ArrayList candyPackage = water.makeWaterPackage(quantity);
        return candyPackage;
    }

}
