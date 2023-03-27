package carpetcostcalculator;


public class Floor {
    double width; // instance variable
    double length; // instance variable

    public Floor(double width, double length) // declaring constructor
    {
        this.width = width;
        this.length = length;
        if (width < 0 && length < 0) {
            this.length = 0;
            this.width = 0;
        }
    }

    public double getArea() // instance method
    {
        return width * length;
    }
}

