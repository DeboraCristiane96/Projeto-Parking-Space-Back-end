package br.edu.ifpb.dac.parking_space.presentation.dto;

import br.edu.ifpb.dac.parking_space.model.entity.Person;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class CarDTO {
    private Integer id;

    @NotBlank(message = "É obrigatório informar qual é o modelo")
    private String model;

    @NotNull(message = "A placa do carro não pode ser nulo!")
    private String licensePlateCar;

    @NotBlank(message = "É obrigatório informar qual é o ano")
    private String year;

    @NotBlank(message = "É obrigatório informar qual a cor")
    private String color;

    @NotBlank(message = "É obrigatório informar qual é o nome do responsável")
    private Person nameRsponsibleCar;

    public CarDTO() {
    }

    public CarDTO(Integer id, @NotBlank(message = "É obrigatório informar qual é o modelo") String model, @NotNull(message = "A placa do carro não pode ser nulo!") String licensePlateCar, @NotBlank(message = "É obrigatório informar qual é o ano") String year, @NotBlank(message = "É obrigatório informar qual a cor") String color, @NotBlank(message = "É obrigatório informar qual é o nome do responsável") Person nameRsponsibleCar) {
        this.id = id;
        this.model = model;
        this.licensePlateCar = licensePlateCar;
        this.year = year;
        this.color = color;
        this.nameRsponsibleCar = nameRsponsibleCar;
    }

    public CarDTO(@NotBlank(message = "É obrigatório informar qual é o modelo") String model, @NotNull(message = "A placa do carro não pode ser nulo!") String licensePlateCar, @NotBlank(message = "É obrigatório informar qual é o ano") String year, @NotBlank(message = "É obrigatório informar qual a cor") String color, @NotBlank(message = "É obrigatório informar qual é o nome do responsável") Person nameRsponsibleCar) {
        this.model = model;
        this.licensePlateCar = licensePlateCar;
        this.year = year;
        this.color = color;
        this.nameRsponsibleCar = nameRsponsibleCar;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Person getNameRsponsibleCar() {
        return nameRsponsibleCar;
    }

    public void setNameRsponsibleCar(Person nameRsponsibleCar) {
        this.nameRsponsibleCar = nameRsponsibleCar;
    }
}
