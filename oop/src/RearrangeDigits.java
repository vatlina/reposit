/*2. Дано трехзначное число. Используя только арифметические операции, вывести на печать все цифры этого числа и также новое
        число, образованное перестановкой  единиц и сотен
        365
        3 , 6, 5  563*/
public class RearrangeDigits {
    public static void main(String[] args) {
        int number = 365;

        int units = number % 10;
        int tens = (number / 10) % 10;
        int hundreds = number / 100;

        System.out.println("Цифры числа " + number + ":");
        System.out.println("Сотни: " + hundreds);
        System.out.println("Десятки: " + tens);
        System.out.println("Единицы: " + units);

        int rearrangedNumber = units * 100 + tens * 10 + hundreds;

        System.out.println("Новое число, образованное перестановкой единиц и сотен: " + rearrangedNumber);
    }
}
