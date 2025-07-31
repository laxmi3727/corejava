package com.bookstore.service;

import com.bookstore.entity.Book;
import com.bookstore.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class BookService {

	

	    @Autowired
	    private BookRepository repository;

	    public Book saveBook(Book book) {
	        return repository.save(book);
	    }

	    public List<Book> getAllBooks() {
	        return repository.findAll();
	    }

	    public Book getBookById(Long id) {
	        return repository.findById(id).orElse(null);
	    }

	    public Book updateBook(Book book) {
	        return repository.save(book);
	    }

	    public void deleteBook(Long id) {
	        repository.deleteById(id);
	    }
	}

	

