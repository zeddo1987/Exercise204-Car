package com.example.demo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Car {
    @NotNull
    private int id;

    @NotNull
    @Size(min=3, max=15)
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NotNull
    @Size(min=3, max=20)
    private String Type;

    @NotNull
    @Size(min=10, max=50)
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
