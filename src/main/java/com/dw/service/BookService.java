package com.dw.service;


import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.dw.dao.BookDaoI;
import com.dw.entity.Book;

@Service
public class BookService {
    @Resource
    BookDaoI bookDao;
    public List<Book> getAllBook() {
        return bookDao.getAllBook();
    }
}
