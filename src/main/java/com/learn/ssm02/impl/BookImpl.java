package com.learn.ssm02.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.learn.ssm02.dao.BookDao;
import com.learn.ssm02.entity.Book;
import com.learn.ssm02.service.BookService;

@Service
public class BookImpl implements BookService{
	@Resource
	BookDao bookDao;
    public List<Book> getAllBook() {    
        return bookDao.getAllBook();
    }
}
