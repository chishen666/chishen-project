package com.carrx.dao;

import org.apache.ibatis.annotations.Mapper;

import com.carrx.bean.po.Book;

@Mapper
public interface BookDao {

	// void saveBook(Book book);

	// void removeBook(int id);

	// void updateBook(Book bok);

	Book getBookById(int id);

	// List<Book> listBooks(int page, int pageSize);

}
