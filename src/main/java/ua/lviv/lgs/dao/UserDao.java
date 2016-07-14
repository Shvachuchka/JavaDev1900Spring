package ua.lviv.lgs.dao;

import ua.lviv.lgs.entity.User;

import java.util.List;

/**
 * Created by Yulian on 13.07.2016.
 */
public interface UserDao {
    void add(User user);
    void edit(User user);
    void delete(User user);
    User findOne(int id);
    List<User> findAll();
}
