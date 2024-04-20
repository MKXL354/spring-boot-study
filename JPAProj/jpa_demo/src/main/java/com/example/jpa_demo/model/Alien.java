package com.example.jpa_demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Alien")
public class Alien {
    @Id
    private int id;
    private String alienName;

    @Override
    public String toString() {
        return "Alien [id=" + id + ", alienName=" + alienName + "]";
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
