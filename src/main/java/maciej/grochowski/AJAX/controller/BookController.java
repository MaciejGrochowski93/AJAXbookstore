package maciej.grochowski.AJAX.controller;

import maciej.grochowski.AJAX.dto.Book;
import maciej.grochowski.AJAX.dto.ServiceResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {

    List<Book> bookList = new ArrayList<>();

    @RequestMapping("/getBooks")
    public ResponseEntity<Object> getAllBooks(){
        ServiceResponse<List<Book>> response = new ServiceResponse<List<Book>>("success", bookList);
        return new ResponseEntity<Object>(response, HttpStatus.OK);
    }

    @RequestMapping(value = "/saveBook", method = RequestMethod.POST)
    public ResponseEntity<Object> addBook(@RequestBody Book book) {
        bookList.add(book);
        ServiceResponse<Book> response = new ServiceResponse<Book>("success", book);
        return new ResponseEntity<Object>(response, HttpStatus.OK);
    }

//    @GetMapping("/")
//    public Book getAllBooks(){
//        return Book book = Arrays.asList()
//    }

}
