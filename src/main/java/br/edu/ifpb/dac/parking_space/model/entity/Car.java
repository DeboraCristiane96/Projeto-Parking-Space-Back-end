package br.edu.ifpb.dac.parking_space.model.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity

public class Car implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "CAR_MODEL", nullable = false)
    private String model;

    @Column(name = "LICENSE_PLACE_CAR", nullable = false, unique = true, length = 7)
    private String licensePlateCar;

    @Column(name = "CAR_YEAR", nullable = false)
    private String year;

    @Column(name = "CAR_COLOR", nullable = false)
    private String color;


    public Car() { }

    public Car(String model, String licensePlateCar, String year, String color) {
        this.model = model;
        this.licensePlateCar = licensePlateCar;
        this.year = year;
        this.color = color;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicensePlateCar() {
        return licensePlateCar;
    }

    public void setLicensePlateCar(String licensePlateCar) {
        this.licensePlateCar = licensePlateCar;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Car other = (Car) obj;
        return Objects.equals(id, other.id);
    }
}
