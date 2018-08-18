package com.kodachaya.gourmet.api.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Optional;

@Entity
@Table(name = "Restaurant")
public class RestaurantEntity {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "latitude")
    private Optional<Double> latitude;


    @Column(name = "longitude")
    private Optional<Double> longitude;

    @Column(name = "createdAt", nullable = false)
    private LocalDateTime createdAt;


    public RestaurantEntity() {}


    public RestaurantEntity(String name) {
        this(name, null, null);
    }


    public RestaurantEntity(String name, Double latitude, Double longitude) {
        this.name = name;
        this.latitude = Optional.ofNullable(latitude);
        this.longitude = Optional.ofNullable(longitude);
    }


    @PrePersist
    public void persist() {
        this.createdAt = LocalDateTime.now();
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

    public Optional<Double> getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = Optional.ofNullable(latitude);
    }

    public Optional<Double> getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = Optional.ofNullable(longitude);
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RestaurantEntity that = (RestaurantEntity) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(latitude, that.latitude) &&
                Objects.equals(longitude, that.longitude) &&
                Objects.equals(createdAt, that.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, latitude, longitude, createdAt);
    }

    @Override
    public String toString() {
        return "RestaurantEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", createdAt=" + createdAt +
                '}';
    }
}
