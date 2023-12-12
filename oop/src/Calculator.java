/*Создать класс Calculator, способный выполнять два арифметических действия - сложение двух чисел, вычитание двух чисел
а также сложение трех чисел и вычитание трех чисел. Калькулятор должен работать как для целых чисел, так и для чисел с
запятой. (т.е. в классе надо создать соответствующие методы и затем вызывать их в методе main)*/
public class Calculator {

    public static void main(String[] args) {

        System.out.println(addTwoNumbers(9, 5));
        System.out.println(subtractTwoNumbers(6.5, 7.4));

        System.out.println(addThreeNumbers(11, 3, 6));
        System.out.println(subtractThreeNumbers(21, 8, 6.3));
    }

    public static double addTwoNumbers(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtractTwoNumbers(double num1, double num2) {
        return num1 - num2;
    }

    public static double addThreeNumbers(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }

    public static double subtractThreeNumbers(double num1, double num2, double num3) {
        return num1 - num2 - num3;
    }
}