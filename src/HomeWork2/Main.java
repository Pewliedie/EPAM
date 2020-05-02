package HomeWork2;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Mercedes S63", 30000, 200, 200, 200);
        Car car2 = new Car("Audi Q7", 40000, 300, 500, 200);
        Car car3 = new Car("Toyota Camry XV50", 20000, 250, 250, 200);
        Car car4 = new Car("Volvo XC90", 30000, 250, 250, 250);
        Car car5 = new Car("Citroën C4", 60000, 250, 250, 250);
        Car car6 = new Car("Koenigsegg Agera RS", 40000, 250, 450, 299);

        AutoShop autoShop = new AutoShop();
        try {
            autoShop.addCar(car1);
            autoShop.addCar(car2);
            autoShop.addCar(car3);
            autoShop.addCar(car4);
            autoShop.addCar(car5);
            autoShop.addCar(car6);
        } catch (TooBigCarException | OutOfFreePlaceException e) {
            System.out.println(e.getMessage());
        }
    }
}
