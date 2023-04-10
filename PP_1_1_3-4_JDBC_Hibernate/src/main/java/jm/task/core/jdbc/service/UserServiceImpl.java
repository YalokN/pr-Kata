package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl extends UserDaoHibernateImpl implements UserService{
    UserDaoHibernateImpl pablo = new UserDaoHibernateImpl();
    public void createUsersTable() {
        pablo.createUsersTable();
    }

    public void dropUsersTable() {
        pablo.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        pablo.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) {
        pablo.removeUserById(id);
    }

    public List<User> getAllUsers() {
        return pablo.getAllUsers();
    }

    public void cleanUsersTable() {
        pablo.cleanUsersTable();
    }
}
