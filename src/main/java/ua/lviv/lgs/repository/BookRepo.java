package ua.lviv.lgs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.lviv.lgs.entity.Book;

public interface BookRepo extends JpaRepository<Book, Integer> {
}
