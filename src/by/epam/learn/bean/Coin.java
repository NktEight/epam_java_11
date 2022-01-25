package by.epam.learn.bean;

public class Coin {
    private double diameter;
    private double weight;

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double value) {
        if (value > 0) {
            diameter = value;
        } else {
            System.out.println("Negative diameter!");
        }
    }

    public double takeWeight() { // incorrect method name
        return weight;
    }

    public void setWeight(double value) {
        weight = value;
    }
}
