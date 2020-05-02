package HomeWork2;

class Car {
    private String mark;
    private int price;

    private double height;
    private double length;
    private double width;

    public Car(String mark, int price, double height, double length, double width) {
        this.mark = mark;
        this.price = price;
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getPrice() {
        return price;
    }


    public double getHeight() {
        return height;
    }


    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

}
