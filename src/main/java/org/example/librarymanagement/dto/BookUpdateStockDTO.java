package org.example.librarymanagement.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class BookUpdateStockDTO {

    @NotNull(message = "Stock không được để trống")
    @Min(
            value = 0,
            message = "Stock must be a non-negative integer"
    )
    private Integer stock;

    public BookUpdateStockDTO() {
    }

    public BookUpdateStockDTO(Integer stock) {
        this.stock = stock;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
