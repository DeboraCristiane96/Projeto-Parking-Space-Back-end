package br.edu.ifpb.dac.parking_space.model.repository;

import br.edu.ifpb.dac.parking_space.model.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository <Car, Integer> {

    boolean existsByLicensePlateCar(String licensePlateCar);
}
