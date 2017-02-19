package pl.akademiakodu.dao;

import pl.akademiakodu.model.Book;

/**
 * Created by Lenovo on 2016-12-06.
 */
public interface BookDao {
    void save(Book book);
    Book get(int id);
}
