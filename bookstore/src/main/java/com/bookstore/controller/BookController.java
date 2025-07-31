package com.bookstore.controller;

import com.bookstore.entity.Book;
import com.bookstore.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    // ✅ CREATE (Add new book)
    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    // ✅ READ ALL (Get list of all books)
    @GetMapping
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    // ✅ READ ONE (Get book by ID)
    @GetMapping("/{id}")
    public Optional<Book> getBookById(@PathVariable Long id) {
        return bookRepository.findById(id);
    }

    // ✅ UPDATE (Change book details by ID)
    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book updatedBook) {
        return bookRepository.findById(id)
                .map(book -> {
                    book.setTitle(updatedBook.getTitle());
                    book.setAuthor(updatedBook.getAuthor());
                    book.setPrice(updatedBook.getPrice());
                    return bookRepository.save(book);
                })
                .orElseGet(() -> {
                    updatedBook.setId(id);
                    return bookRepository.save(updatedBook);
                });
    }

    // ✅ DELETE (Remove book by ID)
    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookRepository.deleteById(id);
    }
}
