package kr.co.javaworld.jpa.domain;

import javax.persistence.*;

@Entity
@Table(name = "TB_CAR")
public class Car {

    @Id
    @TableGenerator(name = "TABLE_GENERATOR", table = "ID_TABLE", allocationSize = 0)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "TABLE_GENERATOR")
    private Long id;

    @Column(nullable = false)
    private String name;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
