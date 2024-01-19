package Map;

/*Задача на мапы: Дан список имен, в котором некоторые имена повторяются. Написать метод, который по имени вернет
количество вхождений этого имени в список, т.е. метод принимает лист и имя и возвращает число, соответствующее
количеству раз , которое это имя встречается в листе.*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NameCounter {

    public static int countOccurrences(List<String> names, String targetName) {

        Map<String, Integer> occurrencesMap = new HashMap<>();
        for (String name : names) {
            occurrencesMap.put(name, occurrencesMap.getOrDefault(name, 0) + 1);
        }
        return occurrencesMap.getOrDefault(targetName, 0);
    }
    public static void main(String[] args) {
        List<String> namesList = List.of("Иван", "Марья", "Семен", "иван", "Петр", "ИВАН", "Анна", "Марья", "Иван");

        String targetName = "Иван";
        int occurrences = countOccurrences(namesList, targetName);
        System.out.println("Число повторов имени " + targetName + ": " + occurrences);
    }
}