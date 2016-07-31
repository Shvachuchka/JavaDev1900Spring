package ua.lviv.lgs.services;

import ua.lviv.lgs.entity.Author;

import java.util.List;

/**
 * Created by Yulian on 13.07.2016.
 */
public interface AuthorService {
    void add(String name, String secondname, String country, int age);
    void add(Author author);
    void edit(Author author);
    void delete(int id);
    Author findOne(int id);
    List<Author> findAll();
}
