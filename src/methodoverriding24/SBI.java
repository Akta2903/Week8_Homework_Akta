package methodoverriding24;

public class SBI extends Bank {
    @Override
    public int getRateOfInterest() {
        return 8;
    }
}
