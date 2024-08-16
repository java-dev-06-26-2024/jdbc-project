package com.jdbcLearning.controllers;

import com.jdbcLearning.daos.UserDaoImpl;
import com.jdbcLearning.models.User;
import com.jdbcLearning.util.ConnectorBuilder;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;

public class MainController {

    public static void main(String[] args) {



        UserDaoImpl userDaoImpl1 = new UserDaoImpl();
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter your id");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter your Fullname: ");
        String fullname = scanner.nextLine();

        System.out.println("Enter your email: ");
        String email = scanner.nextLine();

        System.out.println("Enter your salary: ");
        double salary = scanner.nextDouble();

        User user = new User(id, fullname, email, salary);
        userDaoImpl1.insertUser(user);

      System.out.println("You have successfully inserted into the database");

      System.out.println("These are the Data available in database");

    List<User> users = userDaoImpl1.getAllUsers();

      for(User user1 : users){
        System.out.println(user1);
      }

    }


}
