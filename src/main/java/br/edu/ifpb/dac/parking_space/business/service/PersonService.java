package br.edu.ifpb.dac.parking_space.business.service;

import br.edu.ifpb.dac.parking_space.model.entity.Person;
import br.edu.ifpb.dac.parking_space.model.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) { this.personRepository = personRepository; }

    public boolean existsByName(String name){ return personRepository.existsByName(name); }

    public Object savePerson(Person person) { return personRepository.save(person); }

    public List<Person> findAll() { return personRepository.findAll(); }

    public Optional<Person> findById(Integer id) { return personRepository.findById(id);}

    public void deletePerson(Person person) {  personRepository.delete(person); }
}

