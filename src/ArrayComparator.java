/*1. Сравнить (определить равенство или неравенство) два произвольных целочисленных массива на длину и значения индексов*/
public class ArrayComparator {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 7, 5};
        int[] array2 = {1, 2, 3, 4, 5};

        boolean result = compareArrays(array1, array2);

        if (result) {
            System.out.println("Массивы равны.");
        } else {
            System.out.println("Массивы не равны.");
        }
    }

    public static boolean compareArrays(int[] array1, int[] array2) {

        if (array1 == null || array2 == null) {
            System.out.println("Один или оба массива не инициализированы.");
            return false;
        }

             if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }

        return true;
    }
}
