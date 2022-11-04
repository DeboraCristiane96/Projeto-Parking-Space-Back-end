package br.edu.ifpb.dac.parking_space.presentation.control;

import br.edu.ifpb.dac.parking_space.business.service.PersonService;
import br.edu.ifpb.dac.parking_space.model.entity.Person;
import br.edu.ifpb.dac.parking_space.presentation.dto.PersonDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
@RestController
public class PersonController {

    final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService; }
    @Transactional
    @PostMapping
    public ResponseEntity <Object> savePerson(@RequestBody PersonDTO persondto) {
        if (personService.existsByName(persondto.getName())) {
            return ResponseEntity.status(HttpStatus.CREATED).body("Conflict: This name has already been registered");
        }
        var person = new Person();
        BeanUtils.copyProperties(persondto, person);
        return ResponseEntity.status(HttpStatus.CREATED).body(personService.savePerson(person)); }

    @GetMapping
    public ResponseEntity <List<Person>> getAllPersons(){
        return ResponseEntity.status(HttpStatus.OK).body(personService.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity <Object> getOnePerson(@PathVariable(value = "id") Integer id){
        Optional<Person> personOptional = personService.findById(id);
        if(!personOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Person not found."); }
        return ResponseEntity.status(HttpStatus.OK).body(personOptional.get());}

    @Transactional
    @DeleteMapping(value = "/{id}")
    public ResponseEntity <Object> deletePerson(@PathVariable (value = "id") Integer id){
        Optional<Person> personOptional = personService.findById(id);
        if(!personOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Person not found."); }
        personService.deletePerson(personOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Person deleted successfully."); }

    @PutMapping
    public ResponseEntity <Object> updatePerson(@PathVariable (value = "id") Integer id, @RequestBody PersonDTO persondto){
        Optional<Person> personOptional = personService.findById(id);
        if(!personOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Person not found."); }
        var person = personOptional.get();
        person.setName(persondto.getName());
        return ResponseEntity.status(HttpStatus.OK).body(personService.savePerson(person)); }
}
