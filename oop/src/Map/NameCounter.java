package Map;
/*Задача на мапы: Дан список имен, в котором некоторые имена повторяются. Написать метод, который по имени вернет
количество вхождений этого имени в список, т.е. метод принимает лист и имя и возвращает число, соответствующее
количеству раз , которое это имя встречается в листе.*/
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NameCounter {
    public static int countOccurrences(List<String> names, String targetName) {
            Map<String, Integer> nameOccurrences = new HashMap<>();

        for (String name : names) {
            String normalized = name.toLowerCase();
            nameOccurrences.put(normalized, nameOccurrences.getOrDefault(normalized, 0) + 1);
        }
        String normalizedTarget = targetName.toLowerCase();
        return nameOccurrences.getOrDefault(normalizedTarget, 0);
    }
    public static void main(String[] args) {
        List<String> names = List.of("Иван", "Марья", "Семен", "иван", "Петр", "ИВАН", "Анна", "Марья", "Иван");
        String targetName = "Иван";
        int occurrences = countOccurrences(names, targetName);
        System.out.println("Occurrences of " + targetName + ": " + occurrences);
    }
}
