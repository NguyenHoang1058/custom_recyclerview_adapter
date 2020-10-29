package com.example.customrecylerview;

public class Product {
    private String Name;
    private int Image;
    private int Price;
    private int Discount;
    private int rate;
    private int PeopleRate;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public int getDiscount() {
        return Discount;
    }

    public void setDiscount(int discount) {
        Discount = discount;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getPeopleRate() {
        return PeopleRate;
    }

    public void setPeopleRate(int peopleRate) {
        PeopleRate = peopleRate;
    }

    public Product(String name, int image, int price, int discount, int rate, int peopleRate) {
        Name = name;
        Image = image;
        Price = price;
        Discount = discount;
        this.rate = rate;
        PeopleRate = peopleRate;
    }
}
