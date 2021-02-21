package stock.instuments;

public class Trumpet extends Instrument{

    int nrOfValves;

    public Trumpet(double purchasePrice, double retailPrice, String material, String colour, InstrumentType type, int nrOfValves) {
        super(purchasePrice, retailPrice, material, colour, type);

        this.nrOfValves = nrOfValves;
    }

    public String play() {
        return "Sound of a trumpet";
    }

    public int getNrOfValves() {
        return nrOfValves;
    }

    public void setNrOfValves(int nrOfValves) {
        this.nrOfValves = nrOfValves;
    }
}
