package com.hibernate.project;

import jakarta.persistence.Embeddable;

@Embeddable
public class Laptop {
  private String brand;
  private String model;
  public int year;

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }
}
