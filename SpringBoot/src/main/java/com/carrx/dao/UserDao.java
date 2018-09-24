package com.carrx.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.carrx.bean.po.Book;
import com.carrx.bean.po.User;

@Mapper
public interface UserDao extends tk.mybatis.mapper.common.Mapper<User> {

	List<Book> listBooks();
}
