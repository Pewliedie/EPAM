package HomeWork2;

public class Car {
    private String mark;
    private String color;
    private String engine;
    private String bodyType;
    private int price;
    private int carID;

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", price=" + price +
                ", carID=" + carID +
                '}';
    }

    public Car(String mark, String color, String engine, String bodyType, int price, int carID) {
        this.mark = mark;
        this.color = color;
        this.engine = engine;
        this.bodyType = bodyType;
        this.price = price;
        this.carID = carID;
    }

    public int getCarID() {
        return carID;
    }

    public void setCarID(int carID) {
        this.carID = carID;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
