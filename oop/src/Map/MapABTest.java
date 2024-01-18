package Map;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MapABTest {

    @Test
    public void testMapAB() {

        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "Hi");
        map1.put("b", "There");
        Map<String, String> result1 = MapAB.mapAB(map1);
        Map<String, String> expected1 = new HashMap<>();
        expected1.put("a", "Hi");
        expected1.put("ab", "HiThere");
        expected1.put("b", "There");
        assertEquals(expected1, result1);


        Map<String, String> map2 = new HashMap<>();
        map2.put("a", "Hi");
        Map<String, String> result2 = MapAB.mapAB(map2);
        Map<String, String> expected2 = new HashMap<>();
        expected2.put("a", "Hi");
        assertEquals(expected2, result2);


        Map<String, String> map3 = new HashMap<>();
        map3.put("b", "There");
        Map<String, String> result3 = MapAB.mapAB(map3);
        Map<String, String> expected3 = new HashMap<>();
        expected3.put("b", "There");
        assertEquals(expected3, result3);


        Map<String, String> map4 = new HashMap<>();
        Map<String, String> result4 = MapAB.mapAB(map4);
        Map<String, String> expected4 = new HashMap<>();
        assertEquals(expected4, result4);
    }
}
