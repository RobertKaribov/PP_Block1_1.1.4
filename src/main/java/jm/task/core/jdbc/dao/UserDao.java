package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;

import java.util.List;

public interface UserDao {
    //  метод для создания таблицы пользователей в базе данных.
    void createUsersTable();

    // метод для удаления таблицы пользователей
    void dropUsersTable();

    // метод для добавления нового пользователя в таблицу
    void saveUser(String name, String lastName, byte age);

    // метод для удаления пользователя по идентификатору
    void removeUserById(long id);

    // метод для получения списка всех пользователей из базы данных
    List<User> getAllUsers();

    // метод для очистки таблицы пользователей
    void cleanUsersTable();
}
