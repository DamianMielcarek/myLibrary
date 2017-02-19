package pl.akademiakodu.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.akademiakodu.model.Book;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Repository
public class BookDaoImpl implements BookDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void save(Book book) {
        entityManager.persist(book);
    }

    @Override
    @Transactional
    public Book get(int id) {
        return entityManager.find(Book.class, id);
    }
}
