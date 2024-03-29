package chapter8;

abstract class Figure {
    double dim1;
    double dim2;

    Figure (double a, double b) {
        dim1 = a;
        dim2 = b;
    }
    abstract double area ();
}

class Rectangle extends Figure {

    Rectangle (double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Внутри area() для Rectangle.");
        return dim1 * dim2;
    }
}

class Triangle extends Figure {

    Triangle (double a, double b) {

        super(a, b);
    }


    double area() {
        System.out.println("Внутри area() для Triangle.");
        return dim1 * dim2 /2;
    }
}



public class AbstractAreas {

    public static void main(String[] args) {

        var r = new Rectangle(9, 5);
        var t = new Triangle(10, 8);

        Figure figref;

        figref = r;
        System.out.println("Площадь равна " + figref.area());

        figref = t;
        System.out.println("Площадь равна " + figref.area());
    }
}
