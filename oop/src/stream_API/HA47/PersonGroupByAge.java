package stream_API.HA47;
/*Пусть есть класс Person с полями имя и возраст. Написать метод, принимающий список Person
и возвращающий словарь (map), где возраст является ключом, а лист людей этого возраста значением.
В решении задачи использовать стримы*/

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PersonGroupByAge {

    public static Map<Integer, List<Person>> groupByAge(List<Person> persons) {
        return persons.stream()
                .collect(Collectors.groupingBy(Person::getAge));

    }

    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("John", 25),
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Eve", 30)
        );

        Map<Integer, List<Person>> groupedByAge = groupByAge(persons);

        groupedByAge.forEach((age, people) -> {
            System.out.println("Age: " + age);
            people.forEach(person -> System.out.println("  " + person.getName()));
        });
    }
}