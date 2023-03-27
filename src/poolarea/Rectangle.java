package poolarea;

public class Rectangle {
    double width;
    double length;

    public Rectangle(double width, double length) // instance method by passing two parameter
    {
        this.length = length;  //logic for checking length and width
        this.width = width;
        if (this.width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if (this.length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }

    }

    public double getWidth() //return value of width
    {
        return width;
    }

    public double getLength() //return value of length
    {
        return length;
    }

    public double getArea() //return value of area
    {
        return width * length;
    }
}
