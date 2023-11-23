import java.util.Scanner;
/**1. Написать метод, выводящий на печать результат умножения данного числа n на все целые числа от 0 до n*/
public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для расчета факториала: ");
        int number = scanner.nextInt();

        long factorialResult = calculateFactorial(number);
        System.out.println("Факториал числа " + number + " равен: " + factorialResult);
        scanner.close();
    }

    public static long calculateFactorial(int n) {
        if (n < 0) {
            return -1; // Факториал отрицательного числа не определен
        }
        long result = 1;
        int i = 1;

        while (i <= n) {
            result *= i;
            i++;
        }
        return result;
    }
}