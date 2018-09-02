package com.carrx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carrx.bean.po.Book;
import com.carrx.dao.BookDao;
import com.carrx.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDao bookDao;

	@Override
	public void saveBook(Book book) {

	}

	@Override
	public void removeBook(int id) {

	}

	@Override
	public void updateBook(Book bok) {

	}

	@Override
	public Book getBookById(int id) {
		Book book = bookDao.getBookById(id);
		return book;
	}

	@Override
	public List<Book> listBooks(int page, int pageSize) {
		return null;
	}

}
