package carpetcostcalculator;

public class Calculator {
    Floor floor; //variable declaration
    Carpet carpet;

    public Calculator(Floor floor, Carpet carpet)//constructor
    {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost()      //instance method
    {
        return floor.getArea() * carpet.getCost();
    }

}
