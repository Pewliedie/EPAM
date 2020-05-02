package HomeWork2;

import java.util.*;

class AutoShop {
    public List<Car> listOfCarsForSale = new ArrayList<>();

    // добавление автомобился
    public void addCar(Car car) throws OutOfFreePlaceException {

        if (car.getHeight() > 300) {
            throw new TooBigCarException(car.getMark() + " height exceeds the capacity, it cannot be more than 300cm");
        } else if (car.getLength() > 500) {
            throw new TooBigCarException(car.getMark() + " length exceeds the capacity, it cannot be more than 500cm");
        } else if (car.getWidth() > 300) {
            throw new TooBigCarException(car.getMark() + " width exceeds the capacity, it cannot be more than 300cm");
        } else if (listOfCarsForSale.size() >= 5) {
            throw new OutOfFreePlaceException("You cannot add more than 5 cars");
        }
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