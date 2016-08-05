package ua.lviv.lgs.services;

import org.springframework.web.multipart.MultipartFile;
import ua.lviv.lgs.dto.BookDTO;
import ua.lviv.lgs.entity.Book;

import java.util.List;

/**
 * Created by Yulian on 13.07.2016.
 */
public interface BookService {
    void add(String title, Integer pages, String ganre, MultipartFile multipartFile);

    List<BookDTO> findAll();
}
