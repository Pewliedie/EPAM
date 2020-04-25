package HomeWork3;

import lesson.AbstractProduct;
import lesson.AbstractShop;

import java.util.ArrayList;
import java.util.List;

public class GuitarShop extends AbstractShop {
    private List<AbstractProduct> cart = new ArrayList<>();
    private double sumOfCart;

    //добавление в корзину
    public void addToCart(AbstractProduct abstractProduct) {
        this.cart.add(abstractProduct);
    }

    //показать товары в корзине
    public void showCart() {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty");
        }
        for (AbstractProduct prod : cart) {
            System.out.println(prod);
        }
    }

    //считаем сумму корзины
    public void countSum() {
        for (AbstractProduct prod : cart) {
            sumOfCart += prod.getPrice();
        }
        System.out.println("Total cost to be paid: " + sumOfCart + "$");
    }

    // очистить всю корзину
    public void clearCart() {
        System.out.println("Cart has been cleared");
        cart.clear();
    }

    // удаление элемента
    public void removeElementInCart(AbstractProduct abstractProduct) {
        cart.remove(abstractProduct);
    }


    // выкупаем всю корзину
    public void buyAllCart() {
        for (AbstractProduct prod : cart) {
            sell(prod);
        }
        System.out.println("Thank you for your purchase");
        cart.clear();
    }
}
