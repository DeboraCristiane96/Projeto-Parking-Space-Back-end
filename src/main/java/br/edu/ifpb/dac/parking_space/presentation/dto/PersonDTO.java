package br.edu.ifpb.dac.parking_space.presentation.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class PersonDTO {

    private Integer id;

    @NotBlank(message = "É obrigatório informar o nome do usuário!")
    @Size(min = 3, max = 255, message = "Nome inválido! Deve possuir mais que 3 caracteres")
    private String name;

    @NotBlank(message = "É obrigatório informar a data de nascimento!")
    @Pattern(regexp = "^\\d\\d\\d\\d-\\d\\d-\\d\\d$",
            message = "A data deve ter formato 'yyyy-MM-dd'")
    private String birthDate;

    @NotNull(message = "É obrigatório informar o email!")
    private String email;

    @NotNull(message = "É obrigatório informar um número de telefone!")
    private String phoneNumber;

    @NotNull(message = "É obrigatório informar o bloco!")
    private String block;

    @NotNull(message = "É obrigatório informar uma senha!")
    private String password;


    public PersonDTO() { }

    public PersonDTO(Integer id, @NotBlank(message = "É obrigatório informar o nome do usuário!") @Size(min = 3, max = 255, message = "Nome inválido! Deve possuir mais que 3 caracteres") String name, @NotBlank(message = "É obrigatório informar a data de nascimento!") @Pattern(regexp = "^\\d\\d\\d\\d-\\d\\d-\\d\\d$",
            message = "A data deve ter formato 'yyyy-MM-dd'") String birthDate, @NotNull(message = "É obrigatório informar o email!") String email, @NotNull(message = "É obrigatório informar um número de telefone!") String phoneNumber, @NotNull(message = "É obrigatório informar o bloco!") String block, @NotNull(message = "É obrigatório informar uma senha!") String password) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.block = block;
        this.password = password;
    }

    public PersonDTO(@NotBlank(message = "É obrigatório informar o nome do usuário!") @Size(min = 3, max = 255, message = "Nome inválido! Deve possuir mais que 3 caracteres") String name, @NotBlank(message = "É obrigatório informar a data de nascimento!") @Pattern(regexp = "^\\d\\d\\d\\d-\\d\\d-\\d\\d$",
            message = "A data deve ter formato 'yyyy-MM-dd'") String birthDate, @NotNull(message = "É obrigatório informar o email!") String email, @NotNull(message = "É obrigatório informar um número de telefone!") String phoneNumber, @NotNull(message = "É obrigatório informar o bloco!") String block, @NotNull(message = "É obrigatório informar uma senha!") String password) {
        this.name = name;
        this.birthDate = birthDate;
        this.email = email;
        this.phoneNumber = phoneNumber;
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

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
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

    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

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
}
