package com.crossal.recordreader.customer;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
    @Id
    @JsonProperty("user_id")
    private Integer id;
    private String name;
    private Double latitude;
    private Double longitude;

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

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public boolean isValid() {
        try {
            validate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void validate() {
        if (id == null) {
            throw new IllegalStateException("id cannot be null");
        }
        if (name == null) {
            throw new IllegalStateException("name cannot be null");
        }
        if (latitude == null) {
            throw new IllegalStateException("latitude cannot be null");
        }
        if (longitude == null) {
            throw new IllegalStateException("longitude cannot be null");
        }
    }
}
