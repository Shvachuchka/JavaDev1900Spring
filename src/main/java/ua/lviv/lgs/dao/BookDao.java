package ua.lviv.lgs.dao;

import ua.lviv.lgs.entity.Book;

import java.util.List;

/**
 * Created by Yulian on 13.07.2016.
 */
public interface BookDao {
    void add(Book book);
    void edit(Book book);
    void delete(Book book);
    Book findOne(int id);
    List<Book> findAll();
}
