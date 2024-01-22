package Map;
/*Задача2* (не обязательно)
        Написать метод, который принимает список имен и их анаграмм и имя, по которому он возвращает список всех его анаграмм, включая само имя. При решении использовать мапу.
        Пример: [john, mary, ,jonh, bill, njoh, amry], john -> [john,jonh,njoh] (все буквы в словах маленькие)*/
import java.util.*;
public class AnagramFinder {
    public static List<String> findAnagrams(List<String> names, String targetName) {
        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String name : names) {
            char[] charArray = name.toLowerCase().toCharArray();
            Arrays.sort(charArray);
            String sortedName = new String(charArray);

            anagramMap.computeIfAbsent(sortedName, k -> new ArrayList<>()).add(name);
        }

        char[] targetCharArray = targetName.toLowerCase().toCharArray();
        Arrays.sort(targetCharArray);
        String sortedTargetName = new String(targetCharArray);
        return anagramMap.getOrDefault(sortedTargetName, Collections.emptyList());
    }
    public static void main(String[] args) {
        List<String> names = Arrays.asList("john", "mary", "jonh", "army","bill", "njoh", "amry");
        String targetName = "mary";

        List<String> anagrams = findAnagrams(names, targetName);

        System.out.println("Anagrams for " + targetName + ": " + anagrams);
    }
}