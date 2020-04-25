package HomeWork3;

public class AcousticGuitar extends Guitar {

    private String typeOfBridge;

    public AcousticGuitar(String name, double price, String woodSpecies, String neckShape, String typeOfBridge) {
        super(name, price, woodSpecies, neckShape);
        this.typeOfBridge = typeOfBridge;
    }

    public String getTypeOfBridge() {
        return typeOfBridge;
    }

    public void setTypeOfBridge(String typeOfBridge) {
        this.typeOfBridge = typeOfBridge;
    }

    @Override
    public String toString() {
        return "AcousticGuitar{" + super.toString() +
                "typeOfBridge='" + typeOfBridge + '\'' +
                '}';
    }
}
