package com.first.note.feign.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="city")
public class FeignEntity implements Serializable {

    @Id
    private int cityId;
    @Column(name="city_name")
    private String cityName;

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
