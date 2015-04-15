package kr.co.javaworld.jpa.service;

import kr.co.javaworld.jpa.domain.Car;
import kr.co.javaworld.jpa.domain.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sample.data.jpa.SampleDataJpaApplication;

import javax.transaction.Transactional;
import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SampleDataJpaApplication.class)
public class PersonRepositoryIntegrationTests {

    @Autowired
    PersonRepository repository;

    @Test
    public void testFindOne() {
        Person person = repository.findOne(1L);

        assertThat(person.getName(), is("Park"));
    }

    @Test
    public void testFindName() {
        List<Person> persons = repository.findByName("Park");

        assertThat(persons.get(0).getName(), is("Park"));
    }

    @Test
    @Transactional
    public void testFindCars() {
        Person person = repository.findOne(1L);
        List<Car> cars = person.getCars();

        assertThat(cars, hasSize(4));
        assertThat(cars.get(0).getName(), is("Mercedes"));
    }


    @Test
    public void testTableKeyGenerator() {
        Person person = new Person();
        person.setName("Lee");

        Person saved = repository.save(person);

        assertThat(saved.getId(), is(2L));
    }

}
