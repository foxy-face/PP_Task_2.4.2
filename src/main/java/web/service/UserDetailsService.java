package web.service;

import web.model.User;

import javax.swing.*;

public interface UserDetailsService {
    User getUserByName(Spring name);
}
