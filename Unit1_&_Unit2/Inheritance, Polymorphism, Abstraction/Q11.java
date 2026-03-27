class Shape {
    void display() {
        System.out.println("This is a Shape");
    }
}

// Circle class inherits Shape
class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    void area() {
        double a = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + a);
    }
}

// Rectangle class inherits Shape
class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    void area() {
        double a = length * breadth;
        System.out.println("Area of Rectangle: " + a);
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(4, 6);

        c.display();
        c.area();

        r.display();
        r.area();
    }
}
