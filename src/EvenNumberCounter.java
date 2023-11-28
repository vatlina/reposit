/*2. Есть массив целых чисел. Написать метод, находящий и возвращающий количество четных чисел в этом массиве.
Пример: {1, 2, 8, 7} -> количество четных чисел = 2.*/
public class EvenNumberCounter {
    public static void main(String[] args) {

        int[] array = {1, 2, 8, 7, 12, 22, 150, 101};
        int count = countEvenNumbers(array);
        System.out.println("Количество четных чисел в массиве: " + count);
    }

     public static int countEvenNumbers(int[] array) {
         if (array == null) {
            System.out.println("Массив не инициализирован.");
            return 0;
        }

        int count = 0;

        for (int number : array) {
             if (number % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}
