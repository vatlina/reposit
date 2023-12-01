/*2. Написать метод, принимающий две строки и возвращающий эти строки, соединенные вместе, но без первых букв и в верхнем регистре.
        Пример: "Hello", "There" -> ELLOHERE*/
public class ConcatenateStrings {
    public static void main(String[] args) {

        String firstString = "Hello";
        String secondString = "There";

        String result = concatenateWithoutFirstLetters(firstString, secondString);

        System.out.println("Результат: " + result);
    }

    public static String concatenateWithoutFirstLetters(String str1, String str2) {
        // Проверяем, что строки не являются null и имеют длину более 1 символа
        if (str1 == null || str2 == null || str1.length() < 2 || str2.length() < 2) {
            System.out.println("Некорректные строки.");
            return "";
        }

        String substr1 = str1.substring(1);
        String substr2 = str2.substring(1);

       return substr1.toUpperCase() + substr2.toUpperCase();
    }
}
