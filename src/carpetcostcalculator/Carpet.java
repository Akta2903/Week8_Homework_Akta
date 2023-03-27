package carpetcostcalculator;

public class Carpet {
    double cost; //declare instance variable

    public Carpet(double cost) { //create constructor
        this.cost = cost;
        if (cost < 0)   //if statement
        {
            this.cost = 0;
        }
    }

    public double getCost()  //instance method
    {
        return cost;
    }

}
