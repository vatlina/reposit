/*Создать класс Temperature (температура), содержащий метод для перевода градусов по фаренгейту в градусы цельсия
(celsius = 5*(farenheit - 32)/9). В классе Main создать несколько обьектов класса Temperature (значение температуры
по фаренгейту должно задаваться через конструктор) и вывести результат перевода на экран*/
public class Temperature {
    private double fahrenheit;
    public Temperature(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }
    public double convertToFahrenheit() {
        return fahrenheit;
    }
    public double convertToCelsius() {
        return (fahrenheit - 32) * 5 / 9;
    }
    public static void main(String[] args) {
        Temperature temp1 = new Temperature(32.0);
        Temperature temp2 = new Temperature(212.0);
        Temperature temp3 = new Temperature(98.6);
        System.out.println("Temperature 1 in Fahrenheit: " + temp1.convertToFahrenheit());
        System.out.println("Temperature 1 in Celsius: " + temp1.convertToCelsius());
        System.out.println("Temperature 2 in Fahrenheit: " + temp2.convertToFahrenheit());
        System.out.println("Temperature 2 in Celsius: " + temp2.convertToCelsius());
        System.out.println("Temperature 3 in Fahrenheit: " + temp3.convertToFahrenheit());
        System.out.println("Temperature 3 in Celsius: " + temp3.convertToCelsius());
    }
}