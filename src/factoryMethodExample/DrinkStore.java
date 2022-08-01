package factoryMethodExample;

public class DrinkStore {
    
    private static final DrinkFactory SWEET_DRINK_FACTORY = new SweetDrinkFactory();
    private static final DrinkFactory MINERAL_DRINK_FACTORY = new MineralDrinkFactory();

    public static void main(String[] args) {              
        SWEET_DRINK_FACTORY.getDrinkPackage(7, "sprite");
        MINERAL_DRINK_FACTORY.getDrinkPackage(12, "morshinska");
        MINERAL_DRINK_FACTORY.getDrinkPackage(50, "borjomi");
    }


}
