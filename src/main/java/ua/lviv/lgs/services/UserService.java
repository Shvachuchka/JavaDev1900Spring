package ua.lviv.lgs.services;

import ua.lviv.lgs.entity.User;

import java.util.List;

/**
 * Created by Yulian on 13.07.2016.
 */
public interface UserService {
    void addOrEdit(User user);
    void delete(int id);
    List<User> findAll();
    User findOne(int id);
}
