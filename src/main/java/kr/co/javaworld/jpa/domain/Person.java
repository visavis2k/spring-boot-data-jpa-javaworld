package kr.co.javaworld.jpa.domain;

        import javax.persistence.*;
        import java.util.List;

@Entity
@Table(name = "TB_PERSON_02837")
@SequenceGenerator(name = Person.SEQUENCE_NAME, sequenceName = Person.SEQUENCE_NAME, allocationSize = 50)
public class Person {

    public static final String SEQUENCE_NAME = "sequence_person";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = Person.SEQUENCE_NAME)
    private Long id;

    @Column(name = "PERSON_NAME", length = 100, unique = true, nullable = false)
    private String name;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Car> cars;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

}
