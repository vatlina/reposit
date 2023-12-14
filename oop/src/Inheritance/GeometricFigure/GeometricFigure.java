package Inheritance.GeometricFigure;

public class GeometricFigure {
    protected String name;

    public GeometricFigure(String name) {
        this.name = name;
    }

    public double calculateArea() {
        return 0.0;
    }

    public void printArea() {
        System.out.println(name + " has area of " + calculateArea());
    }
}