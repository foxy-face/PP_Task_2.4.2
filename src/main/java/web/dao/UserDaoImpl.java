package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public User getUserByName(String name) {
        return null;
    }
}
