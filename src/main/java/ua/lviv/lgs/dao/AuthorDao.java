package ua.lviv.lgs.dao;

import ua.lviv.lgs.entity.Author;

import java.util.List;

/**
 * Created by Yulian on 13.07.2016.
 */
public interface AuthorDao {
    void add(Author author);
    void edit(Author author);
    void delete(Author author);
    Author findOne(int id);
    List<Author> findAll();
}
