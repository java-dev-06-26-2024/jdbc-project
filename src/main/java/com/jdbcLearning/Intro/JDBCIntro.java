package com.jdbcLearning.Intro;

public class JDBCIntro {

    public static void main(String[] args) {



        // JDBC - Java Database Connectivity.
        // mySQL Driver Lib -> mysql-connector-j

        // Driver Manager (class) -> this will create a connections to database.

        // Connection (Interface) -> This represents a physical connection to a database.

        // Statement (Interface) -> This represents an SQL statements to run against the database.

        // PreparedStatements (Interface) -> this represents an SQL statement that is ready to accept parameters.

        // ResultSet (Interface) -> This represents a response to query from the database.


        // DAO design Pattern
        // DAO => Data Access Object.
        // -> It provides a clean separation between the business logic and data access logic.

        // DAOs => Abstract CRUD (create, read, update, delete) operations on Specific entity.
            // DAO Interface
            // DAO Implementation => This will implement the DAO Interface.
        // Entity's / Models => POJO Class => Plain old java object class => Java Template for SQL Table
        // Services => Build the business logic.
        // Controllers => users will interact with this layer to perform certain actions.
        // Util => for Utility Functions.

        // Data flow
//         Database => DAO Implementation  => Service => Controller => user
//         Database <= DAO Implementation  <= Service <= Controller <= user

    }
}
