package methodoverriding24;

public class ICICI extends Bank {
    @Override
    public int getRateOfInterest() {
        return 7;
    }
}
