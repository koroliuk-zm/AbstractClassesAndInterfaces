package factoryMethodExample;

public class WaterStore {
    
    private static final WaterFactory SWEET_WATER_FACTORY = new SweetWaterFactory();
    private static final WaterFactory MINERAL_WATER_FACTORY = new MineralWaterFactory();

    public static void main(String[] args) {              
        SWEET_WATER_FACTORY.getWaterPackage(7, "sprite");
        MINERAL_WATER_FACTORY.getWaterPackage(12, "morshinska");
        MINERAL_WATER_FACTORY.getWaterPackage(50, "borjomi");
    }


}
