package com.jdbcLearning.daos;

import com.jdbcLearning.models.User;

import java.util.List;

public interface UserDao {

    public int insertUser(User user);

    public List<User> getAllUsers();

    public int updateUser(User updatedUser, int id);

    public void deleteUser(User user);

}
