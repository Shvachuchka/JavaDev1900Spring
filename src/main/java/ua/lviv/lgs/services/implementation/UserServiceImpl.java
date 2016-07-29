package ua.lviv.lgs.services.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ua.lviv.lgs.dao.UserDao;
import ua.lviv.lgs.entity.User;
import ua.lviv.lgs.services.UserService;

import javax.persistence.NoResultException;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Yulian on 13.07.2016.
 */
@Service
public class UserServiceImpl implements UserService, UserDetailsService{

    @Autowired
    private UserDao userDao;

    public void add(User user) {
        userDao.add(user);
    }

    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        User user;

        try {
            user=userDao.findUserByLogin(login);
        } catch (NoResultException e) {
            return null;
        }
        Collection<SimpleGrantedAuthority>authorities = new ArrayList<SimpleGrantedAuthority>();
        authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
        return new org.springframework.security.core.userdetails.User(String.valueOf(user.getId()), user.getPassword(),authorities);
    }
}
