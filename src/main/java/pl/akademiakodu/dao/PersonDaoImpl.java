package pl.akademiakodu.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.akademiakodu.model.Person;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class PersonDaoImpl implements PersonDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void save(Person person) {
        entityManager.persist(person);
    }

    @Override
    @Transactional
    public Person get(int id) {
        return entityManager.find(Person.class, id);
    }
}
