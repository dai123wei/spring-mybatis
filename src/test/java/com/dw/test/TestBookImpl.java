package com.dw.test;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.BeforeClass;
import org.junit.Test;

import com.dw.dao.*;
import com.dw.dao.impl.*;
import com.dw.entity.*;

public class TestBookImpl {

    static BookDaoI bookDao;
    @BeforeClass
    public static void beforeClass()
    {
    	bookDao = new BookImpl();
    }
    
    @Test
    public void testGetAllBookTypes() {
        List<Book> books = bookDao.getAllBook();
        for (Book book : books) {
            System.out.println(book.getBookName());
        }
        assertNotNull(books);
    }
}