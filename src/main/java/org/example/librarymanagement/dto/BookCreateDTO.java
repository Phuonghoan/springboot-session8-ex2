package org.example.librarymanagement.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.web.multipart.MultipartFile;

public class BookCreateDTO {

    @NotBlank(message = "Tên sách không được để trống")
    @Size(
            max = 200,
            message = "Tên sách không được vượt quá 200 ký tự"
    )
    private String title;

    @NotBlank(message = "Tên tác giả không được để trống")
    @Size(
            max = 100,
            message = "Tên tác giả không được vượt quá 100 ký tự"
    )
    private String author;

    @NotNull(message = "Số lượng tồn không được để trống")
    @Min(
            value = 0,
            message = "Số lượng tồn không được là số âm"
    )
    private Integer stock;

    @NotNull(message = "Ảnh bìa không được để trống")
    private MultipartFile coverImage;

    public BookCreateDTO() {
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

    public MultipartFile getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(MultipartFile coverImage) {
        this.coverImage = coverImage;
    }
}