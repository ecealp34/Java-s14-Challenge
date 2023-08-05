package com.workintech.model;

public class HealthyBurger extends Hamburger{

    private String healthyExtra1Name;
    private String healthyExtra2Name;
    private double healthyExtra1Price;
    private double healthyExtra2Price;

    public HealthyBurger(String name, double price, BreadRollType breadRollType) {
        super(name, price, breadRollType);
        setMeat("Tofu");
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        String info = super.itemize();
        System.out.print(info);
        StringBuilder builder = new StringBuilder();
        if(healthyExtra1Name != null) {
            builder.append("HealthyAddition1 - " + healthyExtra1Name + "\n");
        }
        if(healthyExtra2Name != null) {
            builder.append("HealthyAddition2 - " + healthyExtra2Name + "\n");
        }

        double healtPrice = getPrice() + healthyExtra1Price + healthyExtra2Price;
        builder.append("Total Price - " + healtPrice + "\n");
        System.out.println(builder.toString());
        return healtPrice;
    }

}
