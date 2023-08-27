package pack;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PropertyDev {
    HashMap<String, Long> property;

    public PropertyDev() { //property is in ponds
        property = new HashMap<String, Long>();
        
        property.put("House", 100000L);
        property.put("Car", 20000L);
        property.put("Bike", 1000L);
        property.put("Land", 1000000L);
        property.put("Gold", 100000L);
        property.put("Cash", 10000L);
    }

    public void showProperty() {
        // System.out.println("Property: " + property);

        System.out.println("\n\nDev's Property: ");

        for(Map.Entry<String, Long> entry : property.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
