package br.edu.ifpb.dac.parking_space.model.repository;

import br.edu.ifpb.dac.parking_space.model.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface PersonRepository extends JpaRepository <Person, Integer> {

    boolean existsByName(String name);
    Optional<Person> findById(Integer id);
}
