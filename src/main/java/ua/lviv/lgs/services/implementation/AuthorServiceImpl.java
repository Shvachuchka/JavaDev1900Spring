package ua.lviv.lgs.services.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.lgs.dao.AuthorDao;
import ua.lviv.lgs.entity.Author;
import ua.lviv.lgs.services.AuthorService;

import java.util.List;

/**
 * Created by Yulian on 13.07.2016.
 */
@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorDao authorDao;

    public void add(String name, String secondname, String country, int age) {
        Author author = new Author();
        author.setName(name);
        author.setSecondname(secondname);
        author.setCountry(country);
        author.setAge(age);
        authorDao.add(author);
    }

    public void edit(int id, String name, String secondname, String country, int age) {
        Author author = authorDao.findOne(id);
        if(name != null){
            author.setName(name);
        }
        if(secondname!=null){
            author.setSecondname(secondname);
        }
    }

    public void delete(int id) {
        Author author = authorDao.findOne(id);
        authorDao.delete(author);
    }

    public Author findOne(int id) {
        return authorDao.findOne(id);
    }

    public List<Author> findAll() {
        return authorDao.findAll();
    }
}
