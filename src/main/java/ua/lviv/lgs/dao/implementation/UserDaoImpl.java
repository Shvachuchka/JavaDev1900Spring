package ua.lviv.lgs.dao.implementation;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.lgs.dao.UserDao;
import ua.lviv.lgs.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Yulian on 13.07.2016.
 */
@Repository
public class UserDaoImpl implements UserDao{

    @PersistenceContext(unitName = "Main")
    private EntityManager entityManager;

    @Transactional
    public void add(User user) {
        entityManager.persist(user);
    }
    @Transactional
    public void edit(User user) {
        entityManager.merge(user);
    }
    @Transactional
    public void delete(User user) {
        entityManager.remove(user);
    }
    @Transactional
    public User findOne(int id) {
        return entityManager.find(User.class, id);
    }
    @Transactional
    public List<User> findAll() {
        return entityManager.createQuery("from User").getResultList();
    }
@Transactional
    public User findUserByLogin(String login) {
        return (User) entityManager.createQuery("SELECT u FroM User u WHERE u.email LIKE :email OR u.phone LIKE :phone").setParameter("email",login).setParameter("phone", login).getSingleResult();
    }
}
