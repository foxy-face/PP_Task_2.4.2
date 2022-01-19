package web.service;

import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    @Transactional
    public User show(Long id) {
        return null;
    }

    @Override
    @Transactional
    public void add(User user) {
    }

    @Override
    @Transactional
    public void update(Long id, User user) {
    }

    @Override
    @Transactional
    public void delete(Long id) {
    }

    @Override
    @Transactional
    public User getUserByEmail(String email) {
        return null;
    }
}
