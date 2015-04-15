package kr.co.javaworld.jpa.domain;

import javax.persistence.*;

@Entity
@Table(name = "TB_CAR")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
