package DateAndTime;
/*1. Получить и вывести на экран:
        - текущую дату
        - текущий год, месяц и день
        2. Создать дату, например день рождения и вывести на экран
        3. Создать две даты и проверить на равенство
        4. Получить и вывести на экран текущее время
        5. - текущее время + 3 часа
        6. Создать дату на неделю позже сегодняшней
        7. Создать даты tomorrow и yesterday и проверить находятся ли они до или после сегодняшней*/

import java.time.LocalDate;
import java.time.LocalTime;
public class DateAndTimeExample {
    public static void main(String[] args) {
        // 1. Текущая дата
        LocalDate currentDate = LocalDate.now();
        System.out.println(STR."Текущая дата: \{currentDate}");

        // Текущий год, месяц и день
        int currentYear = currentDate.getYear();
        int currentMonth = currentDate.getMonthValue();
        int currentDay = currentDate.getDayOfMonth();
        System.out.println(STR."Текущий год, месяц и день: \{currentYear}, \{currentMonth}, \{currentDay}");

        // 2. День рождения
        LocalDate birthday = LocalDate.of(1917, 1, 23);
        System.out.println(STR."День рождения: \{birthday}");

        // 3. Проверка на равенство двух дат
        LocalDate date1 = LocalDate.of(2022, 12, 1);
        LocalDate date2 = LocalDate.of(2022, 11, 1);
        System.out.println(STR."Даты равны: \{date1.equals(date2)}");

        // 4. Текущее время
        LocalTime currentTime = LocalTime.now();
        System.out.println(STR."Текущее время: \{currentTime}");

        // 5. Текущее время + 3 часа
        LocalTime timePlus3Hours = currentTime.plusHours(3);
        System.out.println(STR."Текущее время + 3 часа: \{timePlus3Hours}");

        // 6. Дата на неделю позже сегодняшней
        LocalDate nextWeek = currentDate.plusWeeks(1);
        System.out.println(STR."Дата на неделю позже: \{nextWeek}");

        // 7. Завтра и вчера
        LocalDate tomorrow = currentDate.plusDays(1);
        LocalDate yesterday = currentDate.minusDays(1);
        System.out.println(STR."Завтра после сегодняшней: \{tomorrow.isAfter(currentDate)}");
        System.out.println(STR."Вчера перед сегодняшней: \{yesterday.isBefore(currentDate)}");
    }
}