package com.workintech.model;

public class DeluxeBurger extends Hamburger{

    private String drink;
    private String cips;

    public DeluxeBurger() {
        super("DeluxeBurger", 19.1, BreadRollType.DELUXE_BURGER);
        super.setMeat("Double");
    }

    @Override
    public void addAddition(String additionName, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }
}
