package enumerations;
/*Написать программу, которая при вводе с клавиатуры дня недели отвечает на вопрос является ли этот день выходным. (true/false) Использовать Enum*/
import java.util.Scanner;
public class DayOfWeekChecker {
        enum DayOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }
        static boolean isWeekend(DayOfWeek day) {
        return day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите день недели: ");
        String userInput = scanner.nextLine().toUpperCase();

        try {
            DayOfWeek userDay = DayOfWeek.valueOf(userInput);
            boolean isWeekend = isWeekend(userDay);
            System.out.println("День недели " + userDay + " выходной? " + isWeekend);
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный ввод. Пожалуйста, введите день недели корректно.");
        } finally {
            scanner.close();
        }
    }
}
