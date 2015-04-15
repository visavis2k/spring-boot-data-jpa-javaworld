package kr.co.javaworld.jpa.service;

import kr.co.javaworld.jpa.domain.Car;
import org.springframework.data.repository.Repository;

import java.util.List;

interface CarRepository extends Repository<Car, Long> {

    List<Car> findByName(String name);

    List<Car> findByNameContaining(String name);
}
