package io.trackbee.test.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @Column(unique = true, nullable = false)
    private String id;

    @Column(nullable = false)
    private double price;

    @Column(nullable = false)
    private long timestamp;

    public Order() {}

    public Order(String id, double price, long timestamp) {
        this.id = id;
        this.price = price;
        this.timestamp = timestamp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String toString() {
        return "Order{id: " + id + ", price: " + price + ", timestamp: " + timestamp + "}";
    }
}