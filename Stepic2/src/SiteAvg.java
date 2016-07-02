import java.util.HashMap;

/**
 * Created by Alex on 02.07.16.
 */
public class SiteAvg {
    public static void main(String[] args) throws java.io.IOException{
        System.out.println("");
            int ch;
            HashMap<String, Integer> map = new HashMap<>();
            String word = new String();

            while ((ch = System.in.read()) != -1) {
                if ((char) ch != ' ' && ch != 10)
                    word = word + (char) ch;
                else {
                    MapPut(map, word, 1);
                    word = new String();
                }

            }
            map.forEach((k, v) -> System.out.printf("%s\t%s\n", k, v));
        }

        private static void MapPut(HashMap Map, String Key, Integer Value) {
            Integer val = (Integer) Map.putIfAbsent(Key, Value);
            if (val != null && val > 0)
                Map.replace(Key, new Integer(val+1));
        }
}
