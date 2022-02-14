package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl service = new UserServiceImpl();
        service.createUsersTable();
        service.saveUser("Ivan", "Ivanov", (byte) 16);
        service.saveUser("Petr", "Petrov", (byte) 32);
        service.saveUser("Sergey", "Sergeev", (byte) 64);
        service.saveUser("Anonymous", "Anonymous", (byte) 127);
        service.getAllUsers().forEach(System.out::println);
        service.cleanUsersTable();
        service.dropUsersTable();
        Util.closeHibernate();
    }
}
