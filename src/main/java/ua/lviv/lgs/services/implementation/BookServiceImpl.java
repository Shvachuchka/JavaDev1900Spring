package ua.lviv.lgs.services.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import ua.lviv.lgs.dto.BookDTO;
import ua.lviv.lgs.entity.Book;
import ua.lviv.lgs.repository.BookRepo;
import ua.lviv.lgs.services.BookService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

/**
 * Created by Yulian on 13.07.2016.
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepo bookRepo;

    public void add(String title, Integer pages, String ganre, MultipartFile multipartFile) {
        Book book = new Book();
        book.setTitle(title);
        book.setPages(pages);
        book.setGanre(ganre);
        try {
            book.setImage(multipartFile.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        bookRepo.save(book);
    }

    public List<BookDTO> findAll() {
        List<BookDTO>bookDTOs = new ArrayList<BookDTO>();
        List<Book>bookList = bookRepo.findAll();
        for (Book book : bookList) {
            BookDTO bookDTO = new BookDTO();
            bookDTO.setTitle(book.getTitle());
            bookDTO.setPages(book.getPages());
            bookDTO.setGanre(book.getGanre());
            String image = Base64.getEncoder().encodeToString(book.getImage());
            bookDTO.setImage(image);
            bookDTOs.add(bookDTO);
        }
        return bookDTOs;
    }
}
