package hashmaps;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sahibj on 3/16/17.
 */
public class LoopHashmap {

    public static void main(String[] args) {

        Map<Integer, String> idToName = new HashMap();

        idToName.put(1, "abc");
        idToName.put(2, "def");
        idToName.put(3, "ghl");

        for (int id: idToName.keySet()){
            System.out.println(idToName.get(id));
        }
    }
}
