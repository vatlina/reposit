package our_arraylist;
import java.util.Arrays;
public class OurArrayList<E> implements OurList<E> {
    private Object[] source;
    private static final int INITIAL_CAPACITY = 16;
    private int size;
    public OurArrayList() {
        source = new Object[INITIAL_CAPACITY];
    }
    public int size() {
        return size;
    }
    public void append(E value) {
        if (source.length == size) {
            enlargeArray();
        }
        source[size] = value;
        size++;
    }
    private void enlargeArray() {
        E[] newSource = Arrays.copyOf((E[]) source, source.length * 2);
        source = newSource;
    }
    public E get(int index) {
        if (index >= size || index < 0)
            return null;
        return (E) source[index];
    }
    public void set(E value, int index) {
        if (index >= size || index < 0)
            return;
        source[index] = value;
    }
    public boolean remove(E value) {
        for (int i = 0; i < size; i++) {
            if (source[i].equals(value)) {
                removeById(i);
                return true;
            }
        }
        return false;
    }
    public E removeById(int index) {
        if (index >= size || index < 0)
            return null;

        E result = (E) source[index];
        for (int i = index + 1; i < size; i++) {
            source[i - 1] = source[i];
        }
        source[size - 1] = null;
        size--;

        return result;
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            stringBuilder.append(source[i]);
            if (i < size - 1) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}