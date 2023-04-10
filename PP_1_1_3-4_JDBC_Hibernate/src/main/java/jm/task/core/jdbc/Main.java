package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserServiceImpl diego = new UserServiceImpl();
        diego.createUsersTable();
        for (int i = 0; i < 4; i++) {
            String name = "Pablo";
            diego.saveUser(name, "Pablobich", (byte) 3);
            System.out.println("User с именем - " + name + " добавлен в базу данных");
        }
        System.out.println(diego.getAllUsers());
        diego.cleanUsersTable();
        diego.dropUsersTable();
    }
}
