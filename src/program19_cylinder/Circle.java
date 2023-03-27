package program19_cylinder;

public class Circle {
    double radius; //instance variable

    public Circle(double radius) {   //constructor declaration
        this.radius = radius;
        if (radius < 0) {
            this.radius = 0;
        }
    }

    //Method named getRadius without any parameters, it needs to return the value of the radius field.
    public double getRadius() { //instance method
        return radius;
    }
    //Method named getArea without any parameters, it needs to return the calculated area (radius * radius * PI). For PI use Math.PI constant.

    public double getArea() {
        return radius * radius * Math.PI;
    }
}
