package interfaces_in_java.Shape;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(7, 11);
        Shape triangle = new Triangle(5,8,9);
        Shape circle = new Circle(9);

        System.out.println("Площадь прямоугольника: " + rectangle.calculateArea());
        System.out.println("Периметр прямоугольника: " + rectangle.calculatePerimeter());

        System.out.println("Площадь треугольника: " + triangle.calculateArea());
        System.out.println("Периметр треугольника: " + triangle.calculatePerimeter());

        System.out.println("Площадь круга: " + circle.calculateArea());
        System.out.println("Периметр круга: " + circle.calculatePerimeter());

        Shape[] shapes = {rectangle, triangle, circle};
        System.out.println("Общая площадь всех фигур: " + calculateTotalArea(shapes));
    }

    public static double calculateTotalArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }
}