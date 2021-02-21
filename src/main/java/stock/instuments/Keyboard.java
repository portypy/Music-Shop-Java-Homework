package stock.instuments;

public class Keyboard extends Instrument{

    Boolean flashMemory;

    public Keyboard(double purchasePrice, double retailPrice, String material, String colour, InstrumentType type, Boolean flashMemory) {
        super(purchasePrice, retailPrice, material, colour, type);

        this.flashMemory = flashMemory;
    }

    public String play() {
        return "Sound of a keyboard";
    }

    public Boolean getFlashMemory() {
        return flashMemory;
    }

    public void setFlashMemory(Boolean flashMemory) {
        this.flashMemory = flashMemory;
    }
}
