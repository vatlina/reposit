/*3. Дан массив целых чисел. Написать метод, возвращающий наименьший элемент массива.*/
public class MinElementFinder {
    public static void main(String[] args) {
              int[] array = {5, 3, 8, 1, 7};
        int minElement = findMin(array);
        System.out.println("Наименьший элемент массива: " + minElement);
    }

       public static int findMin(int[] ints) {
               if (ints == null || ints.length == 0) {
            System.out.println("Массив пуст или не инициализирован.");
            return Integer.MIN_VALUE;
        }

               int minElement = ints[0];

               for (int i = 1; i < ints.length; i++) {
            if (ints[i] < minElement) {
                minElement = ints[i];
            }
        }

        return minElement;
    }
}
