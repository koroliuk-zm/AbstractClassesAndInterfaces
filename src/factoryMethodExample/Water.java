
package factoryMethodExample;

import java.util.ArrayList;

/**
 *
 * @author bethan
 */
public abstract class Water {
        
    abstract ArrayList<Water> makeWaterPackage(int quantity);
    
}
