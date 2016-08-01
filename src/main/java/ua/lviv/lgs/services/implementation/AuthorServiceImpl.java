package ua.lviv.lgs.services.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.lgs.entity.Author;
import ua.lviv.lgs.repository.AuthorRepo;
import ua.lviv.lgs.services.AuthorService;

import java.util.List;

/**
 * Created by Yulian on 13.07.2016.
 */
@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorRepo authorRepo;

    public void addOrEdit(Author author) {
        authorRepo.save(author);
    }

    public void delete(int id) {
        authorRepo.delete(id);
    }

    public Author findOne(int id) {
        return authorRepo.findOne(id);
    }

    public List<Author> findAll() {
        return authorRepo.findAll();
    }
}
