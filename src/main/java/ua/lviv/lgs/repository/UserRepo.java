package ua.lviv.lgs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ua.lviv.lgs.entity.User;

import java.util.List;

public interface UserRepo extends JpaRepository<User, Integer> {

    @Query("SELECT u FROM User u WHERE u.email LIKE :login OR u.phone LIKE :login")
    User findByLogin(@Param("login") String login);

//    List<User> findByEmail(String email);

//    User findByEmailOrPhone(String email,String phone);
}
