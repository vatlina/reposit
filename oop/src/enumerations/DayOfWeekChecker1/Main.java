package enumerations.DayOfWeekChecker1;

import java.util.Scanner;
import java.util.Scanner;

public class Main {

    public enum Day {
        MONDAY(false),
        TUESDAY(false),
        WEDNESDAY(false),
        THURSDAY(false),
        FRIDAY(false),
        SATURDAY(true),
        SUNDAY(true);

        private final boolean isWeekend;

        Day(boolean isWeekend) {
            this.isWeekend = isWeekend;
        }

        public boolean isWeekend() {
            return isWeekend;
        }

        public static Day getDay(String day) {
            for (Day d : values()) {
                if (d.name().equals(day)) {
                    return d;
                }
            }
            return null;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите день недели: ");
        String userInput = scanner.nextLine().toUpperCase();

        Day day = Day.getDay(userInput);

        if (day != null) {
            boolean isWeekend = day.isWeekend();
            System.out.println("Этот день является выходным: " + isWeekend);
        } else {
            System.out.println("Введен некорректный день недели.");
        }

        scanner.close();
    }
}
