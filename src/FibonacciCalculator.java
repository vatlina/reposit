/*Написать метод, возвращающий n-  число Фибоначчи*/

import java.util.Scanner;

public class FibonacciCalculator {
    public static void main(String[] args) {
        // Создаем объект Scanner для чтения ввода с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя ввод значения n
        System.out.print("Введите значение n для числа Фибоначчи: ");
        int n = scanner.nextInt();

        // Вызываем метод для вычисления n-го числа Фибоначчи и выводим результат
        int fibonacciResult = fibonacci(n);
        System.out.println("n-е число Фибоначчи: " + fibonacciResult);

        // Закрываем Scanner, чтобы избежать утечек ресурсов
        scanner.close();
    }

    // Метод для вычисления n-го числа Фибоначчи
    public static int fibonacci(int n) {
        if (n < 0) {
            System.out.println("Введите неотрицательное значение n.");
            return -1; // Возвращаем -1 в случае ошибки
        }

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int prev = 0;
            int current = 1;

            for (int i = 2; i <= n; i++) {
                int next = prev + current;
                prev = current;
                current = next;
            }

            return current;
        }
    }
}
