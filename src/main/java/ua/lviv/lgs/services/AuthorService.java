package ua.lviv.lgs.services;

import ua.lviv.lgs.entity.Author;

import java.util.List;

/**
 * Created by Yulian on 13.07.2016.
 */
public interface AuthorService {
    void addOrEdit(Author author);
    void delete(int id);
    Author findOne(int id);
    List<Author> findAll();
}
