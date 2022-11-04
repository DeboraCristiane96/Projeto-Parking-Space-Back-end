package br.edu.ifpb.dac.parking_space.model.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;
@Entity
public class Person implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "PERSON_NAME", nullable = false)
    private String name;

    @Column(name = "BIRTH_DATE", nullable = false)
    private LocalDate birthDate;

    @Column(name = "EMAIL", nullable = false)
    private String email;

    @Column(name = "PHONE_NUMBER", nullable = false)
    private String phoneNumber;

    @Column(name = "APARTMENT_NUMBER", nullable = false, length = 100)
    private String apartmentNumber;

    @Column(name = "BLOCK", nullable = false, length = 100)
    private String block;

    @Column(name = "PASSWORD", nullable = false, length = 20)
    private String password;

    @ManyToOne
    @JoinColumn(nullable = false, name = "CAR_ID")
    private Car car_id;

    public Person() {
    }

    public Person(Integer id, String name, LocalDate birthDate, String email, String phoneNumber, String apartmentNumber, String block, String password) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.apartmentNumber = apartmentNumber;
        this.block = block;
        this.password = password;
    }

    public Person(String name, LocalDate birthDate, String email, String phoneNumber, String apartmentNumber, String block, String password) {
        this.name = name;
        this.birthDate = birthDate;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.apartmentNumber = apartmentNumber;
        this.block = block;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
        Person other = (Person) obj;
        return Objects.equals(id, other.id);
    }
}
