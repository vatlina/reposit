package Map;/*Дана Map<String, String> map,
        написать метод, который вернет Мап, такую, что если в исходной map есть ключи ‘a’ и ‘b’, то нужно создать новый ключ ‘ab’ с суммой значений от ключей a и b. Если нет, ничего не менять.
        Примеры:
        mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
        mapAB({"a": "Hi"}) → {"a": "Hi"}
        mapAB({"b": "There"}) → {"b": "There"}*/
import java.util.HashMap;
import java.util.Map;
public class MapAB {
    public static Map<String, String> mapAB(Map<String, String> inputMap) {
        if (inputMap.containsKey("a") && inputMap.containsKey("b")) {
            String valueA = inputMap.get("a");
            String valueB = inputMap.get("b");

            String valueAB = valueA + valueB;
            inputMap.put("ab", valueAB);}
        return inputMap;}
    public static void main(String[] args) {

        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "Hi");
        map1.put("b", "There");
        System.out.println(mapAB(map1));
        Map<String, String> map2 = new HashMap<>();
        map2.put("a", "Hi");
        System.out.println(mapAB(map2));
        Map<String, String> map3 = new HashMap<>();
        map3.put("b", "There");
        System.out.println(mapAB(map3));
    }
}
