package program19_cylinder;

public class Cylinder extends Circle {
    double height;

    public Cylinder(double radious, double height) //
    {
        super(radious); //call from parent class
        this.height = height;
        if (height < 0) {
            this.height = 0;
        }
    }

    public double getHeight() //instance method
    {
        return height;
    }

    public double getVolume() //instance method
    {
        return getArea() * getHeight();
    }
}