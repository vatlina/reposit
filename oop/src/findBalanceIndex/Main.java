package findBalanceIndex;
/*Пусть есть массив положительных целых чисел  нечетной длины >= 3.
Известно, что существует индекс элемента этого массива такой, что сумма всех
элементов слева от него равняется сумме всех элементов справа от него.
Нужно написать метод, находящий этот индекс
пример { 1,1,3,7,2,3} or {1, 3, 2, 1, 6, 200, 13}*/

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 3, 2, 1, 6, 200, 13};
        int resultIndex = findBalanceIndex(array);

        if (resultIndex != -1) {
            System.out.println("Индекс баланса: " + resultIndex);
        } else {
            System.out.println("Баланс не найден");
        }
    }

    public static int findBalanceIndex(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (isBalanceIndex(array, i)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean isBalanceIndex(int[] array, int index) {
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < index; i++) {
            leftSum += array[i];
        }

        for (int i = index + 1; i < array.length; i++) {
            rightSum += array[i];
        }

        return leftSum == rightSum;
    }
}
