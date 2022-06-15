package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnect {

    private static final String pass = "jdbc:mysql://localhost/studentManagent";
    private static final String name = "root";
    private static final String password = "";
    private static Connection connection;

    private static boolean flag=true;

    DbConnect() throws SQLException {
        connection= connection=DriverManager.getConnection(pass, name, password);
    }

    public static Connection connect() throws SQLException {
        if(flag)new DbConnect(); flag=false;
        return connection;
    }

}
