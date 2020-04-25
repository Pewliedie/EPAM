package HomeWork3;

import lesson.AbstractProduct;

public class Guitar extends AbstractProduct {
    private String woodSpecies;//Порода дерева
    private String neckShape;//Форма грифа

    public Guitar(String name, double price, String woodSpecies, String neckShape) {
        super(name, price);
        this.woodSpecies = woodSpecies;
        this.neckShape = neckShape;
    }

    //Getters Setters
    public String getWoodSpecies() {
        return woodSpecies;
    }

    public void setWoodSpecies(String woodSpecies) {
        this.woodSpecies = woodSpecies;
    }

    public String getNeckShape() {
        return neckShape;
    }

    public void setNeckShape(String neckShape) {
        this.neckShape = neckShape;
    }

    @Override
    public String toString() {
        return super.toString()
                + " woodSpecies='" + woodSpecies + '\'' +
                ", neckShape='" + neckShape + '\'';
    }
}
