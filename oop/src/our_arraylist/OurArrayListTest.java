package our_arraylist;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class OurArrayListTest {
    @Test
    void testSize() { //Проверяем корректность возвращаемого размера списка после добавления элементов.
        OurArrayList<Integer> list = new OurArrayList<>();
        assertEquals(0, list.size());
        list.append(1);
        assertEquals(1, list.size());
    }
    @Test
    void testAppendAndGet() {//Проверяем добавление элементов и получение их по индексу.
        OurArrayList<String> list = new OurArrayList<>();
        list.append("Hello");
        list.append("World");
        assertEquals("Hello", list.get(0));
        assertEquals("World", list.get(1));
    }
    @Test
    void testSet() {//Проверяем установку нового значения по индексу.
        OurArrayList<Integer> list = new OurArrayList<>();
        list.append(42);
        assertEquals(42, list.get(0));
        list.set(99, 0);
        assertEquals(99, list.get(0));
    }
    @Test
    void testRemove() {//Проверяем удаление элемента по значению.
        OurArrayList<String> list = new OurArrayList<>();
        list.append("One");
        list.append("Two");
        list.append("Three");
        assertTrue(list.remove("Two"));
        assertFalse(list.remove("Four"));
        assertEquals("[One, Three]", list.toString());
    }
    @Test
    void testRemoveById() {//Проверяем удаление элемента по индексу.
        OurArrayList<Integer> list = new OurArrayList<>();
        list.append(1);
        list.append(2);
        list.append(3);
        assertEquals(Integer.valueOf(2), list.removeById(1));
        assertNull(list.removeById(5));
        assertEquals("[1, 3]", list.toString());
    }
    @Test
    void testToString() {//Проверяем корректность строкового представления списка.
        OurArrayList<Double> list = new OurArrayList<>();
        list.append(3.14);
        list.append(2.71);
        list.append(1.618);
        assertEquals("[3.14, 2.71, 1.618]", list.toString());
    }
}