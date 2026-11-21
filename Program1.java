// Lab Task 1: Method Overloading and Method Overriding

class Shape {
    // This method will be overridden in the Rectangle class.
    void area() {
        System.out.println("Area of Shape");
    }

    // Method overloading: one parameter (square).
    void area(double side) {
        System.out.println("Area of Square = " + (side * side));
    }

    // Method overloading: two parameters (rectangle).
    void area(double length, double width) {
        System.out.println("Area of Rectangle = " + (length * width));
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method overriding: same method name and parameters as Shape.
    @Override
    void area() {
        System.out.println("Area of Rectangle (overridden method) = "
                + (length * width));
    }
}

public class Program1 {
    public static void main(String[] args) {
        Shape shape = new Shape();

        shape.area();
        shape.area(5);
        shape.area(6, 4);

        Rectangle rectangle = new Rectangle(8, 3);
        rectangle.area();

        // Parent-class reference calling the overridden child method.
        Shape shapeReference = new Rectangle(7, 2);
        shapeReference.area();
    }
}
