/*2. Создать класс Rectangle (прямоугольник), содержащий переменные длина и ширина, конструктор и методы для
подсчета площади и периметра прямоугольника.
В классе Main создать несколько обьектов класса Rectangle и вывести на экран площадь и периметр каждого*/
public class Rectangle {
    double length;
    double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double calculateArea() {
        return length * width;
    }
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(5.0, 3.0);
        Rectangle rectangle2 = new Rectangle(8.0, 4.5);
        Rectangle rectangle3 = new Rectangle(6.0, 6.0);

        System.out.println("Прямоугольник 1:");
        System.out.println("Площадь: " + rectangle1.calculateArea());
        System.out.println("Периметр: " + rectangle1.calculatePerimeter());

        System.out.println("\nПрямоугольник 2:");
        System.out.println("Площадь: " + rectangle2.calculateArea());
        System.out.println("Периметр: " + rectangle2.calculatePerimeter());

        System.out.println("\nПрямоугольник 3:");
        System.out.println("Площадь: " + rectangle3.calculateArea());
        System.out.println("Периметр: " + rectangle3.calculatePerimeter());
    }
}
