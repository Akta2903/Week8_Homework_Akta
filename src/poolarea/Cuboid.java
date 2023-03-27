package poolarea;

public class Cuboid extends Rectangle {
    double height;

    public Cuboid(double width, double length, double height) {        //constructor
        super(width, length);        //call this variable from rectangle
        this.height = height;         //call instance variable
        if (height < 0) {               //if statement
            this.height = 0;
        }
    }

    public double getHeight() {     //instance method
        return height;
    }

    public double getVolume() { //instance method for calculate Volume
        return getArea() * getHeight();
    }
}
