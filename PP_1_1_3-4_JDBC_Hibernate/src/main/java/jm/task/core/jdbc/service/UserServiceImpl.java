package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl extends UserDaoJDBCImpl implements UserService{
    UserDaoJDBCImpl pablo = new UserDaoJDBCImpl();
    public void createUsersTable() throws SQLException {
        pablo.createUsersTable();
    }

    public void dropUsersTable() throws SQLException {
        pablo.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) throws SQLException {
        pablo.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) throws SQLException {
        pablo.removeUserById(id);
    }

    public List<User> getAllUsers() throws SQLException {
        return pablo.getAllUsers();
    }

    public void cleanUsersTable() throws SQLException {
        pablo.cleanUsersTable();
    }
}
