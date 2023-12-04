/*
1. Написать метод, принимающий две строки и проверяющий является ли одна строка анграммой другой. Метод
        возвращает boolean
        abcd  - bcda acbd - анаграммы
        abcd -    acb  abkc - не анаграммы*/
import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {

        String str1 = "старорежимность";
        String str2 = "нерасторжимость";

        boolean result = areAnagrams(str1, str2);

        System.out.println("Являются ли строки анаграммами: " + result);
    }

    public static boolean areAnagrams(String str1, String str2) {
        if (str1 == null || str2 == null) {
            System.out.println("Некорректные строки.");
            return false;
        }

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return Arrays.equals(chars1, chars2);
    }
}
