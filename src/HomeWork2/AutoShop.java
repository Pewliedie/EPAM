package HomeWork2;

import java.util.*;

public class AutoShop {
    private List<Car> listOfCarsForSale = new ArrayList<>();

    // добавление автомобился в лист для продажи
    public void addCar(Car car) {
        listOfCarsForSale.add(car);
    }

    //показать марку и цену все доступных автомобилей
    public void showPriceAllAvailableCars() {
        for (Car car : listOfCarsForSale) {
            System.out.println(car.getMark() + " " + car.getPrice() + "$");
        }
    }

    // покупка автомобиля  по car ID
    public void buyCar(int id) {
        Iterator<Car> carIterator = listOfCarsForSale.iterator();
        boolean bool = false;
        while (carIterator.hasNext()) {
            Car car = carIterator.next();
            if (car.getCarID() == id) {
                System.out.println("The car " + car.getMark() + " has been sold");
                carIterator.remove();
                bool = true;
                break;
            }
        }
        if (bool == false) {
            System.out.println("There is no such car");
        }

    }

    //показать все доступные автомобили
    public void showAllAvailableCars() {
        for (Car car : listOfCarsForSale) {
            System.out.println(car);
        }
    }
}
