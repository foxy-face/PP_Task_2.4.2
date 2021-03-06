package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    User show(Long id);
    void add(User user);
    void update(Long id, User user);
    void delete(Long id);
    User getUserByEmail(String email);
}
