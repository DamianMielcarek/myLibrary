package pl.akademiakodu.dao;

import pl.akademiakodu.model.User;

public interface UserDao {
    void save(User user);
    User get(int id);
}
