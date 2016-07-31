package ua.lviv.lgs.dao.implementation;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.lgs.dao.AuthorDao;
import ua.lviv.lgs.entity.Author;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Yulian on 13.07.2016.
 */
@Repository
public class AuthorDaoImpl implements AuthorDao {

    @PersistenceContext(unitName = "Main")
    private EntityManager entityManager;

    @Transactional
    public void add(Author author) {
        entityManager.persist(author);
    }

    @Transactional
    public void edit(Author author) {
        entityManager.merge(author);
    }

    @Transactional
    public void delete(Author author) {
        entityManager.remove(entityManager.contains(author) ? author : entityManager.merge(author));
    }

    @Transactional
    public Author findOne(int id) {
        return entityManager.find(Author.class, id);
    }

    @Transactional
    public List<Author> findAll() {
        return entityManager.createQuery("from Author").getResultList();
    }
}
