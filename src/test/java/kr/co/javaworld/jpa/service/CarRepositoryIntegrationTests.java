package kr.co.javaworld.jpa.service;

import kr.co.javaworld.jpa.domain.Car;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sample.data.jpa.SampleDataJpaApplication;

import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SampleDataJpaApplication.class)
public class CarRepositoryIntegrationTests {

    @Autowired
    CarRepository repository;

    @Test
    public void testFindByName() {
        List<Car> cars = repository.findByName("Mercedes");
        assertThat(cars, hasSize(1));
        assertThat(cars.get(0).getName(), is("Mercedes"));
    }

    @Test
    public void testFindByNameContaining() {
        List<Car> cars = repository.findByNameContaining("cedes");
        assertThat(cars, hasSize(1));
        assertThat(cars.get(0).getName(), is("Mercedes"));
    }

}
