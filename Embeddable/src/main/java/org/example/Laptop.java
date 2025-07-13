package org.example;

import javax.persistence.Embeddable;

@Embeddable
public class Laptop {

    private String Brand;
    private String Model;
    private String Ram;

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getRam() {
        return Ram;
    }

    public void setRam(String ram) {
        Ram = ram;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "Brand='" + Brand + '\'' +
                ", Model='" + Model + '\'' +
                ", Ram='" + Ram + '\'' +
                '}';
    }
}
