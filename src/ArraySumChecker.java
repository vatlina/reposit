/*Написать метод, принимающий массив целых чисел и проверяющий равна ли сумма всех имеющихся там чисел 10 тридцати.
        Метод возвращает false если нет и true если да.
        т.е. для массива 10, 15, 10, 1, 25, 10 -> true
        для массива 10, 15, 10, 1, 25, 45 -> false
        Фактически, в общем виде метод проверяет равна ли сумма всех элементов массива, равных n числу m*/
public class ArraySumChecker {
    public static void main(String[] args) {

        int[] array1 = {10, 15, 10, 1, 25, 10};
        int[] array2 = {10, 15, 10, 1, 25, 45};

        boolean result1 = checkArraySum(array1);
        boolean result2 = checkArraySum(array2);

        System.out.println("Результат для array1: " + result1);
        System.out.println("Результат для array2: " + result2);
    }


    public static boolean checkArraySum(int[] array) {
        // Проверяем, что массив не является null
        if (array == null) {
            System.out.println("Массив не инициализирован.");
            return false;
        }


        int sum = 0;


        for (int number : array) {

            if (number == 10) {
                sum += number;
            }
        }

        // Проверяем, равна ли сумма числу 30
        return sum == 30;
    }
}
