package com.workintech.abstraction.product;

public class Chocolate extends ProductForSale{
    private String brand;
    public Chocolate(String type, double price, String description, String brand) {
        super(type, price, description);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public void showDetails() {
//        System.out.println("Type: " + getType());
//        System.out.println("Price: " + getPrice());
//        System.out.println("Description: " + getDescription());
//        System.out.println("Brand: " + getBrand());

        String result = super.toString();
        StringBuilder builder = new StringBuilder();
        builder.append("Brand: " + brand + "\n");
        System.out.println(result + builder.toString());
    }
}
