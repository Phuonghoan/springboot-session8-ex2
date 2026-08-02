package org.example.librarymanagement.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(
            name = "title",
            nullable = false,
            length = 200
    )
    private String title;

    @Column(
            name = "author",
            nullable = false,
            length = 100
    )
    private String author;

    @Column(
            name = "stock",
            nullable = false
    )
    private Integer stock;

    @Column(
            name = "cover_url",
            nullable = false,
            length = 500
    )
    private String coverUrl;

    public Book() {
    }

    public Book(
            Long id,
            String title,
            String author,
            Integer stock,
            String coverUrl
    ) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.stock = stock;
        this.coverUrl = coverUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }
}