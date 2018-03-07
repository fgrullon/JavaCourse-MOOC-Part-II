
import java.util.HashMap;
import java.util.Map;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations requested in the assignment here!
        HashMap<String, String> nuevo = new HashMap<String, String>();
        
        nuevo.put("matti", "mage");
        nuevo.put("mikael", "mixu");
        nuevo.put("arto", "arppa");
        
        System.out.println(nuevo.get("mikael"));

    }

}
