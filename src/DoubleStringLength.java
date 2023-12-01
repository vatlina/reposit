/*1. Написать метод, принимающий строку и возвращающий целое число, равное двойной длине строки
        Пример: Hello -> 10*/

public class DoubleStringLength {
    public static void main(String[] args) {

        String inputString = "Hello Java";
        int result = getDoubleStringLength(inputString);

        System.out.println("Двойная длина строки: " + result);
    }

        public static int getDoubleStringLength(String input) {

        if (input == null) {
            System.out.println("Строка не инициализирована.");
            return -1;
        }

        return input.length() * 2;
    }
}