package com.ppolivka.viber.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

@Entity
@Table(name = "subscriber")
public class Subscriber {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;

    @Column(name = "name")
    @NotEmpty
    protected String name;

    @Column(name = "viber_id")
    @NotEmpty
    protected String viberId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getViberId() {
        return viberId;
    }

    public void setViberId(String viberId) {
        this.viberId = viberId;
    }
}