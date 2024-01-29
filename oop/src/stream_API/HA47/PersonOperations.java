package stream_API.HA47;
/*Задача 2
        Есть тот же класс Person с полями String name, int age.
        Написать метод, принимающий список Person и возвращающий суммарный возраст тех, кто старше
        18 лет.
        Написать метод, принимающий список Person и возвращающий имена тех, кто старше 18 лет в виде
         такой строки:
        "At the moment John and Ann and Bill are of legal age"
        (имена и текст могут быть любыми, структура предложения должна сохраняться)
        В решении задачи использовать стримы*/
import java.util.List;
import java.util.stream.Collectors;

public class PersonOperations {

    public static int sumAgeOver18(List<Person> persons) {
        return persons.stream()
                .filter(person -> person.getAge() > 18)
                .mapToInt(Person::getAge)
                .sum();
    }

    public static String namesOver18(List<Person> persons) {
        List<String> legalNames = persons.stream()
                .filter(person -> person.getAge() > 18)
                .map(Person::getName)
                .toList();

        StringBuilder result = new StringBuilder("На данный момент ");
        for (int i = 0; i < legalNames.size(); i++) {
            result.append(legalNames.get(i));
            if (i < legalNames.size() - 2) {
                result.append(", ");
            } else if (i == legalNames.size() - 2) {
                result.append(" и ");
            }
        }
        result.append(" достигли совершеннолетия");

        return result.toString();
    }

    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("John", 25),
                new Person("Alice", 30),
                new Person("Bob", 17),
                new Person("Eve", 22)
        );

        int totalAgeOver18 = sumAgeOver18(persons);
        System.out.println("Общий (суммарный) возраст лиц старше 18 лет: " + totalAgeOver18);

        String legalNames = namesOver18(persons);
        System.out.println(legalNames);
    }
}
