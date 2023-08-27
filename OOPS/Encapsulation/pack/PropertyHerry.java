package pack;

import java.util.HashMap;

public class PropertyHerry {
    HashMap<String, Long> property;

    public PropertyHerry() { //property is in ponds
        property = new HashMap<String, Long>();
        
        property.put("House", 10L);
        property.put("Car", 20L);
        property.put("Bike", 10L);
        property.put("Land", 100L);
        property.put("Gold", 100L);
        property.put("Cash", 10L);
    }

    public void showProperty() {
        // System.out.println("Property: " + property);

        System.out.println("\n\nHerry's Property: ");

        for(HashMap.Entry<String, Long> entry : property.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
