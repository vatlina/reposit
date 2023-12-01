/*3. Написать метод, принимающий строку и возвращающий эту строку с переставленной в конец строки первой буквой.
        Примет: abcd -> bcda*/
public class MoveFirstLetterToEnd {
    public static void main(String[] args) {

        String inputString = "abcd";
        String result = moveFirstLetterToEnd(inputString);

        System.out.println("Результат: " + result);
    }


    public static String moveFirstLetterToEnd(String input) {

        if (input == null || input.length() < 2) {
            System.out.println("Некорректная строка.");
            return input;
        }


        char firstLetter = input.charAt(0);
        String substringWithoutFirstLetter = input.substring(1);

        return substringWithoutFirstLetter + firstLetter;
    }
}
