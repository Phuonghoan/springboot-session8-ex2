package org.example.librarymanagement.controller;

import org.example.librarymanagement.dto.BookCreateDTO;
import org.example.librarymanagement.entity.Book;
import org.example.librarymanagement.service.BookService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping(
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE
    )
    public ResponseEntity<Book> createBook(
            @Valid
            @ModelAttribute
            BookCreateDTO dto
    ) {
        Book createdBook =
                bookService.createBook(dto);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(createdBook);
    }
}
