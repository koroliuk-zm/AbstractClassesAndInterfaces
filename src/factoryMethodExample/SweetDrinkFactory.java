
package factoryMethodExample;

public class SweetDrinkFactory extends DrinkFactory {
    
    @Override
    public Drink getDrink(String section) {
        switch (section) {
            case "coca-cola":
                return new SweetDrink_CocaCola();
            case "fanta":
                return new SweetDrink_Fanta();
            case "sprite":
                return new SweetDrink_Sprite();
            default:
                return new SweetDrink_Fanta();
        }
    }
    
}
