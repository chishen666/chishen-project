package com.carrx.service;

import java.util.List;

import com.carrx.bean.po.Book;

public interface BookService {

	void saveBook(Book book);

	void removeBook(int id);

	void updateBook(Book bok);

	Book getBookById(int id);

	List<Book> listBooks(int page, int pageSize);
}
