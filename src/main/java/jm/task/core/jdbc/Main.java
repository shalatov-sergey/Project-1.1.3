package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private final static UserService userService = new UserServiceImpl();

    public static void main(String[] args) {
        userService.createUsersTable();

        userService.saveUser("Анна", "Крылова", (byte) 23);
        userService.saveUser("Ригина", "Ткачева", (byte) 56);
        userService.saveUser("Барик", "Барбариан", (byte) 21);
        userService.saveUser("Дмитрий", "Рогов", (byte) 57);

        userService.removeUserById(2);

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
