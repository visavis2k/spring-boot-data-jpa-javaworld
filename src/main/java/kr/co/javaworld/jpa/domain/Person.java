package kr.co.javaworld.jpa.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "TB_PERSON_02837")
public class Person {

    @Id
    @TableGenerator(name = "TABLE_GENERATOR", table = "ID_TABLE", allocationSize = 0)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "TABLE_GENERATOR")
    private Long id;

    @Column(name = "PERSON_NAME", length = 100, unique = true, nullable = false)
    private String name;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Car> cars;

    public Long getId() {
        return id;
    }

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
