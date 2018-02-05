package com.dw.dao.impl;

import java.util.List;
import org.apache.ibatis.session.SqlSession;

import com.dw.dao.*;
import com.dw.entity.*;
import com.dw.util.MyBatisUtil;;


public class BookImpl implements BookDaoI {

    public List<Book> getAllBook() {
        //获得会话对象
        SqlSession session = MyBatisUtil.getSqlSession(true); 
        try {          
        	BookDaoI bookDao = session.getMapper(BookDaoI.class);
            return bookDao.getAllBook();
        } finally {
            session.close();
        }
    }
}