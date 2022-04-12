package com.example.mu_ku_202_2022.model;

public class Car extends CarModel{
    private String car_id;
    private int price;
    private String delivery_id;
    private String model_id;
    private String notes="";

    public Car(Brand brand, String model_id, String model_name, String model_date, String car_id, int price, String delivery_id, String model_id1, String notes) {
        super(brand, model_id, model_name, model_date);
        this.car_id = car_id;
        this.price = price;
        this.delivery_id = delivery_id;
        this.model_id = model_id1;
        this.notes = notes;
    }

    public String getCar_id() {
        return car_id;
    }

    public void setCar_id(String car_id) {
        this.car_id = car_id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDelivery_id() {
        return delivery_id;
    }

    public void setDelivery_id(String delivery_id) {
        this.delivery_id = delivery_id;
    }

    @Override
    public String getModel_id() {
        return model_id;
    }

    @Override
    public void setModel_id(String model_id) {
        this.model_id = model_id;
    }

    @Override
    public String getNotes() {
        return notes;
    }

    @Override
    public void setNotes(String notes) {
        this.notes = notes;
    }
}
