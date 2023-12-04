/*3. Написать свой собственный метод substring, работающий аналогично методу в Джаве. Метод принимает строку , индексы начала и конца и возвращает подстроку.
        String mySubstring( String string, int begin, int end).*/
public class MySubstringExample {
    public static void main(String[] args) {

        String originalString = "Hello, World!";
        int beginIndex = 7;
        int endIndex = 12;

        String result = mySubstring(originalString, beginIndex, endIndex);

        System.out.println("Результат: " + result);
    }


    public static String mySubstring(String string, int begin, int end) {

        if (string == null || begin < 0 || end > string.length() || begin > end) {
            System.out.println("Некорректные данные.");
            return "";
        }


        StringBuilder result = new StringBuilder();


        for (int i = begin; i < end; i++) {
            result.append(string.charAt(i));
        }

        return result.toString();
    }
}
