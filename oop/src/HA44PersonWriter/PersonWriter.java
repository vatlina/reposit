package HA44PersonWriter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class PersonWriter {

    public static void saveToFile(String filename, List<Person> persons) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(persons);
            System.out.println("Список объектов сохранен в файл " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Peter", 37),
                new Person("Simon", 5),
                new Person("John", 90)
        );

        saveToFile("persons.dat", persons);
    }
}