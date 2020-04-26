package HomeWork3;

public class BassGuitar extends ElectricGuitar {

    private String shapeOfDeck;

    public BassGuitar(String name, double price, String woodSpecies, String neckShape, String typeOfPickup, String shapeOfDeck) {
        super(name, price, woodSpecies, neckShape, typeOfPickup);
        this.shapeOfDeck = shapeOfDeck;
    }

    public String getShapeOfDeck() {
        return shapeOfDeck;
    }

    public void setShapeOfDeck(String shapeOfDeck) {
        this.shapeOfDeck = shapeOfDeck;
    }

    @Override
    public String toString() {
        return "BassGuitar{" + super.toString() +
                "shapeOfDeck='" + shapeOfDeck + '\'' +
                '}';
    }
}
