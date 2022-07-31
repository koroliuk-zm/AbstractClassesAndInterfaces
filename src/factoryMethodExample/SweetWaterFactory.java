
package factoryMethodExample;

/**
 *
 * @author bethan
 */
public class SweetWaterFactory extends WaterFactory {
    
    @Override
    public Water getWater(String section) {
        switch (section) {
            case "coca-cola":
                return new SweetWater_CocaCola();
            case "fanta":
                return new SweetWater_Fanta();
            case "sprite":
                return new SweetWater_Sprite();
            default:
                return new SweetWater_Fanta();
        }
    }
    
}
