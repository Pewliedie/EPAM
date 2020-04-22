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

    // покупка автомобиля
    public void buyCar(Car car) {
        System.out.println("The car " + car.getMark() + " has been sold");
        listOfCarsForSale.remove(car);
    }

    //показать все доступные автомобили
    public void showAllAvailableCars() {
        for (Car car : listOfCarsForSale) {
            System.out.println(car);
        }
    }
}
