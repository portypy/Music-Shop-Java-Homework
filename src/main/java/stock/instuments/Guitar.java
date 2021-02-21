package stock.instuments;


public class Guitar extends Instrument{

    int stringsNumber;

    public Guitar(double purchasePrice, double retailPrice, String material, String colour, InstrumentType type, int stringsNumber) {
        super(purchasePrice, retailPrice, material, colour, type);
        this.stringsNumber = stringsNumber;
    }

    public int getStringsNumber() {
        return stringsNumber;
    }

    public void setStringsNumber(int stringsNumber) {
        this.stringsNumber = stringsNumber;
    }


    public String play() {
        return "Sound of a guitar";
    }



}
