package com.workintech.abstraction.product;

public class Bread extends ProductForSale{
    private boolean hasSalt;
    private String flourType;
    public Bread(String type, double price, String description, boolean hasSalt, String flourType) {
        super(type, price, description);
        this.hasSalt = hasSalt;
        this.flourType = flourType;
    }

    public boolean isHasSalt() {
        return hasSalt;
    }

    public String getFlourType() {
        return flourType;
    }

    @Override
    public void showDetails() {
//        System.out.println("Type: " + getType());
//        System.out.println("Price: " + getPrice());
//        System.out.println("Description: " + getDescription());
//        System.out.println("Salt: " + isHasSalt());

        String result = super.toString();
        StringBuilder builder = new StringBuilder();
        builder.append("Salt: " + hasSalt + "\n");
        builder.append("Flour Type: " + flourType + "\n");
        System.out.println(result + builder.toString());
    }
}
