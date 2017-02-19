package pl.akademiakodu.dao;

import pl.akademiakodu.model.Person;

/**
 * Created by Lenovo on 2016-12-07.
 */
public interface PersonDao {
    void save(Person person);
    Person get(int id);
}
