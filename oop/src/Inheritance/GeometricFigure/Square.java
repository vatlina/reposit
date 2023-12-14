package Inheritance.GeometricFigure;

public class Square extends GeometricFigure {
    private double side;

    public Square(double side) {
        super("Square");
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}