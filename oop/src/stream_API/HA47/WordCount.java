package stream_API.HA47;
/*Задача 3
        Написать метод, принимающий в качестве параметров две строки. Первая строка состоит из слов, разделенных пробелом. Метод должен возвращать количество слов первой строки, начинающихся со второй строки.
        Пример: Первая строка "aaaaaaa cccc ab bbbbb a ff aaa"
        Если вторая строка а, то ответ 4
        Если вторая строка ааа, ответ 2
        Если вторая строка aaaa, ответ 1
        В решении задачи использовать стримы*/

import java.util.Arrays;
public class WordCount {

    public static int countWordsStartingWith(String firstString, String secondString) {
        String[] words = firstString.split(" ");

        return (int) Arrays.stream(words)
                .filter(word -> word.startsWith(secondString))
                .count();
    }

    public static void main(String[] args) {
        String firstString = "aaaaaaa cccc ab bbbbb a ff aaa";

        String secondString1 = "a";
        String secondString2 = "aaa";
        String secondString3 = "aaaa";

        int count1 = countWordsStartingWith(firstString, secondString1);
        int count2 = countWordsStartingWith(firstString, secondString2);
        int count3 = countWordsStartingWith(firstString, secondString3);

        System.out.println("If second string is 'a', the answer is " + count1);
        System.out.println("If second string is 'aaa', the answer is " + count2);
        System.out.println("If second string is 'aaaa', the answer is " + count3);
    }
}