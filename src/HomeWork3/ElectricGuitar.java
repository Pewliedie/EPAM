package HomeWork3;

public class ElectricGuitar extends Guitar {

    private int numberOfStrings; //струны
    private String typeOfPickup; //тип звукоснимателя

    public ElectricGuitar(String name, double price, String woodSpecies, String neckShape, int numberOfStrings, String typeOfPickup) {
        super(name, price, woodSpecies, neckShape);
        this.numberOfStrings = numberOfStrings;
        this.typeOfPickup = typeOfPickup;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public String getTypeOfPickup() {
        return typeOfPickup;
    }

    public void setTypeOfPickup(String typeOfPickup) {
        this.typeOfPickup = typeOfPickup;
    }

    @Override
    public String toString() {
        return "ElectricGuitar{" + super.toString() +
                "numberOfStrings=" + numberOfStrings +
                ", typeOfPickup='" + typeOfPickup + '\'' +
                '}';
    }
}
