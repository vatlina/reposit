/*2. Написать метод, принимающий строку и целое число(индекс) и возвращающий строку без символа, находящегося по этому индексу.

        Пример:
        int index = 3
        String str = "Hello"*/

public class RemoveCharAtIndex {
    public static void main(String[] args) {

        int index = 3;
        String str = "Hello";

        String result = removeCharAtIndex(str, index);

        System.out.println("Результат: " + result);
    }

        public static String removeCharAtIndex(String str, int index) {

        if (str == null || index < 0 || index >= str.length()) {
            System.out.println("Некорректные данные.");
            return str;
        }


        StringBuilder result = new StringBuilder(str);


        result.deleteCharAt(index);

        return result.toString();
    }
}
