package ua.lviv.lgs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.lviv.lgs.entity.Author;

public interface AuthorRepo extends JpaRepository<Author, Integer> {
}
