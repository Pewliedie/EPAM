package HomeWork3;

public class ElectricGuitar extends Guitar {

    private String typeOfPickup; //тип звукоснимателя

    public ElectricGuitar(String name, double price, String woodSpecies, String neckShape, String typeOfPickup) {
        super(name, price, woodSpecies, neckShape);
        this.typeOfPickup = typeOfPickup;
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
                "numberOfStrings=" +
                ", typeOfPickup='" + typeOfPickup + '\'' +
                '}';
    }
}
