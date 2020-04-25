package HomeWork3;


public class Main {
    public static void main(String[] args) {
        GuitarShop guitarShop = new GuitarShop();

        Guitar guitar1 = new ElectricGuitar("Fender Stratocaster C2",
                4000, "Oak", "V", "Humbuckers");

        Guitar guitar2 = new BassGuitar("Fender B2",
                2500, "Cedrus", "U", "Modern D");

        Guitar guitar3 = new AcousticGuitar("Ibanez i4",
                17000, "Oak", "C", "floating");

        Guitar guitar4 = new AcousticGuitar("Hohner C45",
                2000, "Cypress ", "U", "fixed");

        Guitar guitar5 = new ElectricGuitar("Yamaha erg C45",
                8000, "Red cedar", "C", "Double coil");

        guitarShop.add(guitar1);
        guitarShop.add(guitar2);
        guitarShop.add(guitar3);
        guitarShop.add(guitar4);
        guitarShop.add(guitar5);

        guitarShop.printAllProducts();

        guitarShop.addToCart(guitar2);
        guitarShop.addToCart(guitar4);

        System.out.println();
        guitarShop.countSum();

        guitarShop.buyAllCart();
        System.out.println();

        guitarShop.showCart();
        System.out.println();
        guitarShop.printAllProducts();
    }
}


