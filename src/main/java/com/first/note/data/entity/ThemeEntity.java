package com.first.note.data.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity

@Table(name="theme")
public class ThemeEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "value")
    private String value;
    @Column(name = "flag")
    private int flag;

    public ThemeEntity() {}

    public ThemeEntity(ThemeEntity themeEntity) {
        this.name = themeEntity.name;
        this.value = themeEntity.value;
        this.flag = themeEntity.flag;
    }
    public ThemeEntity(String name, String value, int flag) {
        this.name = name;
        this.value = value;
        this.flag = flag;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }
}
