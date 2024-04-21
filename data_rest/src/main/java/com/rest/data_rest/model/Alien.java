package com.rest.data_rest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Alien {
    @Id
    @GeneratedValue
    private int id;
    private String alienName;
    private String tech;

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    @Override
    public String toString() {
        return "Alien [id=" + id + ", alienName=" + alienName + ", tech=" + tech + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getalienName() {
        return alienName;
    }

    public void setalienName(String alienName) {
        this.alienName = alienName;
    }

}
