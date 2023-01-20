package com.fstt.kofi.entities;
import jakarta.persistence.*;

@Table(name = "shope_items")
@Entity
public class ShopeItem {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(nullable = false)
    private int publisherid;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private Double price;
    @Column(nullable = true)
    private int soldedItem;
    @Column(nullable = true)
    private int item_left;
    @Column(nullable = true)
    private String image;

    @Column(nullable = true)
    private String description;

    public ShopeItem() {
    }

    public ShopeItem(int publisher_id, String title, Double price, int soldedItem, int item_left, String image, String description) {
        this.publisherid = publisher_id;
        this.title = title;
        this.price = price;
        this.soldedItem = soldedItem;
        this.item_left = item_left;
        this.image = image;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getPublisher_id() {
        return publisherid;
    }

    public void setPublisher_id(int publisher_id) {
        this.publisherid = publisher_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getSoldedItem() {
        return soldedItem;
    }

    public void setSoldedItem(int soldedItem) {
        this.soldedItem = soldedItem;
    }

    public int getItem_left() {
        return item_left;
    }

    public void setItem_left(int item_left) {
        this.item_left = item_left;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ShopeItem{" +
                "id=" + id +
                ", publisher_id=" + publisherid +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", soldedItem=" + soldedItem +
                ", item_left=" + item_left +
                ", image='" + image + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
