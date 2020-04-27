package HomeWork3;


public class Main {
    public static void main(String[] args) {
        GuitarShop guitarShop = new GuitarShop();

        Guitar guitar1 = new ElectricGuitar("Fender Stratocaster C2",
                4000, "Oak", "V", "Humbuckers");

        Guitar guitar2 = new BassGuitar("Fender B2",
                2500, "Cedrus", "U", "Humbucker", "modern D");

        Guitar guitar3 = new AcousticGuitar("Ibanezz i4",
                17000, "Oak", "C", "floating");


        guitarShop.add(guitar1);
        guitarShop.add(guitar2);
        guitarShop.add(guitar3);

        guitarShop.sell(guitar2);

        guitarShop.printAllProducts();
    }
}


