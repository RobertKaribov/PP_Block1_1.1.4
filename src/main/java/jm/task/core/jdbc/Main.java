package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        // Создание таблицы User(ов)
        userService.createUsersTable();

        // Добавление 4 User(ов) в таблицу
        userService.saveUser("Jack", "Doy", (byte) 30);
        userService.saveUser("Jane", "Smith", (byte) 25);
        userService.saveUser("Michael", "Johnson", (byte) 35);
        userService.saveUser("Emily", "Brown", (byte) 28);

        // Вывод всех User из базы и вывод в консоль
        List<User> users = userService.getAllUsers();
        for (User user : users) {
            System.out.println(user);
        }

        // Очистка таблицы User(ов)
        userService.cleanUsersTable();

        // Удаление таблицы
        userService.dropUsersTable();
    }
}

