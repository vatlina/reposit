import java.util.List;
/*Написать метод, принимающий не пустой лист строк и возвращающий строку, которая встречается раньше в листе - самую короткую или самую длинную.
Все строки в листе - разной длины.*/
public class StringUtil {
    public static String getFirstString(List<String> strings) {
       if (strings.isEmpty()) {
            return null;}
        String shortest = strings.get(0);
        String longest = strings.get(0);
        for (String str : strings) {
            if (str.length() < shortest.length()) {
                shortest = str;}
            if (str.length() > longest.length()) {
                longest = str;}}
       return strings.indexOf(shortest) < strings.indexOf(longest) ? shortest : longest;}
    public static void main(String[] args) {
        List<String> strings = List.of("яблоко", "юзу", "апельсин", "банан", "киви"); //фруктовое растение рода Цитрус, распространённое в Юго-Восточной Азии
        String result = getFirstString(strings);
        System.out.println(result);
    }
}