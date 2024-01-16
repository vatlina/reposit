package YesNoComparator;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YesNoComparatorTest {

    @Test
    public void testCompareLists() {

        List<Integer> list1 = List.of(1, 2, 3, 4);
        List<Integer> list2 = List.of(5, 2, 3, 8);

        List<String> result = YesNoComparator.compareLists(list1, list2);

        assertEquals(List.of("No", "Yes", "Yes", "No"), result);
    }

    @Test
    public void testCompareListsWithDifferentLengths() {

        List<Integer> list1 = List.of(1, 2, 3, 4);
        List<Integer> list2 = List.of(5, 2, 3);

        try {
            YesNoComparator.compareLists(list1, list2);
        } catch (IllegalArgumentException e) {
            assertEquals("Списки должны иметь одинаковую длину", e.getMessage());
        }
    }
}
