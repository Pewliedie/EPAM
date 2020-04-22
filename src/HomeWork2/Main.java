package HomeWork2;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Mercedes S63", "Black", "V8", "Spotcar", 90000, 3199);
        Car car2 = new Car("Audi Q7", "White", "V8", "Crossover", 80000, 2341);
        Car car3 = new Car("Toyota Camry XV50", "Gray", "V6", "Sedan ", 40000, 4512);
        Car car4 = new Car("Volvo XC90", "Gray", "V6", "SUV", 55000, 9744);
        Car car5 = new Car("Citroën ", "White", "V6", "Sedan", 44000, 4511);
        Car car6 = new Car("Koenigsegg Agera RS", "Black", "V8", "Sport Car", 3_000_000, 7654);

        AutoShop autoShop = new AutoShop();
        autoShop.addCar(car1);
        autoShop.addCar(car2);
        autoShop.addCar(car3);
        autoShop.addCar(car4);
        autoShop.addCar(car5);
        autoShop.addCar(car6);

        autoShop.showPriceAllAvailableCars();
        System.out.println();

        autoShop.buyCar(car1);

        System.out.println();
        autoShop.showPriceAllAvailableCars();

    }
}
