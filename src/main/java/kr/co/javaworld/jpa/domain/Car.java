package kr.co.javaworld.jpa.domain;

import javax.persistence.*;

@Entity
@Table(name = "TB_CAR")
@SequenceGenerator(name = Car.SEQUENCE_NAME, sequenceName = Car.SEQUENCE_NAME, allocationSize = 50)
public class Car {

    public static final String SEQUENCE_NAME = "sequence_car";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = Car.SEQUENCE_NAME)
    private Long id;

    @Column(nullable = false)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected Car() {
    }
}
