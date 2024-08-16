package com.jdbcLearning.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectorBuilder {


    public static Connection createConnection() {

        Connection connection1 = null;

        final String DB_NAME = "javadevtest";
        final String DB_URL = "jdbc:mysql://localhost:3306/" + DB_NAME;
        final String DB_USERNAME = "root";
        final String DB_PASSWORD = "123456789";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection1 = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);

        } catch (ClassNotFoundException | SQLException e) {

            System.out.println(e.getMessage());
        }

        return connection1;

    }

//    Step 1: Finding the driver class.
//    Step 2: Establish the connection using Driver Manager by passing DB_URL, DB_USERNAME, DB_PASSWORD.
//    Step 3: Store the Connection in a variable.
//    Step 4: Return the connection.


}
