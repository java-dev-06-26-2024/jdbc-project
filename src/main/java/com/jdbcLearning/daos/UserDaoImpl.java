package com.jdbcLearning.daos;

import com.jdbcLearning.models.User;
import com.jdbcLearning.util.ConnectorBuilder;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserDaoImpl implements UserDao{


    // step 1: use connection
    // step 2: create SQL statement
    // step 3: prepare statement
    // step 4: execute statement.



    @Override
    public int insertUser(User user) {
//         User(1, "James","james@gmail.com", 343.45);
         int status =0;
        try(Connection con = ConnectorBuilder.createConnection()){
//                                                                             1, 2, 3, 4
            String sql = "insert into user(id, fullname, email, salary) values(?, ?, ?,? )";
//           Datatype         name =  Object
            PreparedStatement ps   =  con.prepareStatement(sql);
            ps.setInt(1, user.getId());
            ps.setString(2, user.getFullname());
            ps.setString(3, user.getEmail());
            ps.setDouble(4, user.getSalary());

           status = ps.executeUpdate();


        }catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return status;
    }

    @Override
    public List<User> getAllUsers() {

        ArrayList<User> users = new ArrayList<>();

        try(Connection con = ConnectorBuilder.createConnection()){
//                                                                             1, 2, 3, 4
            String sql = "select * from user;";
//           Datatype         name =  Object
            PreparedStatement ps   =  con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

           while (rs.next()){
               User user = new User();
               user.setId(rs.getInt(1));
               user.setFullname(rs.getString(2));
               user.setEmail(rs.getString(3));
               user.setSalary(rs.getDouble(4));

               users.add(user);
           }



        }catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return users;

    }

    @Override
    public int updateUser(User updatedUser, int id) {
        int status =0;
        try(Connection con = ConnectorBuilder.createConnection()){
//                                                   1          2           3            4
            String sql = "update user set fullname = ?, email = ?, salary = ? where id = ?";

            PreparedStatement ps   =  con.prepareStatement(sql);
            ps.setString(1, updatedUser.getFullname());
            ps.setString(2, updatedUser.getEmail());
            ps.setDouble(3, updatedUser.getSalary());
            ps.setInt(4, id);

            status = ps.executeUpdate();


        }catch (SQLException e) {
            throw new RuntimeException(e);
        }

      return status;
    }

    @Override
    public void deleteUser(User user) {

    }
}
