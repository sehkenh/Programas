// Using abstract methods and classes.

abstract class Figure2 {
    double dim1;
    double dim2;

    Figure2(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    //area is now an abstract method

    abstract double area();
}

class Rectangle2 extends Figure2 {
    Rectangle2(double a, double b) {
        super(a, b);
    }

    //override area for rectangle

    double area() {
        System.out.println("Inside Rectangle2.area()");
        return dim1 * dim2;
    }
}

class Triangle2 extends Figure2 {
    Triangle2(double a, double b) {
        super(a, b);
    }

    //override area for triangle

    double area() {
        System.out.println("Inside Triangle2.area()");
        return dim1 * dim2 / 2;
    }
}

public class AbstractAreas {
    public static void main(String[] args) {
//        Figure2 f = new Figure2(10,10); //illegal now
        Rectangle2 r = new Rectangle2(9,5);
        Triangle2 t = new Triangle2(10,8);
//        Figure figref;
//
//        figref = r;
//        System.out.println(figref.area());
//
//        figref = t;
//        System.out.println(figref.area());
    }
}
