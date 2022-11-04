package br.edu.ifpb.dac.parking_space.business.service;

import br.edu.ifpb.dac.parking_space.model.entity.Car;
import br.edu.ifpb.dac.parking_space.model.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    final CarRepository carRepository;

    public CarService(CarRepository carRepository) { this.carRepository = carRepository; }

    public Object saveCar(Car car) { return carRepository.save(car); }

    public boolean existsByLincensePlateCar(String licensePlate) { return carRepository.existsByLicensePlateCar(licensePlate); }

    public List<Car> findAll() { return carRepository.findAll(); }

    public Optional<Car> findById(Integer id) { return carRepository.findById(id); }

    public void deleteCar(Car car) { carRepository.delete(car); }
}
