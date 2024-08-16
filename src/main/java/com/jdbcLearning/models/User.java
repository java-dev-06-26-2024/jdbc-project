package com.jdbcLearning.models;

import java.util.Objects;

public class User {

    //    id int primary key,
//    fullname varchar(25),
//    email varchar(25),
//    salary double(5,2)
    private int id;
    private String fullname;
    private String email;
    private double salary;

    public User() {

    }

    public User(int id, String fullname, String email, double salary) {
        this.id = id;
        this.fullname = fullname;
        this.email = email;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;
        return id == user.id && Double.compare(salary, user.salary) == 0 && Objects.equals(fullname, user.fullname) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + Objects.hashCode(fullname);
        result = 31 * result + Objects.hashCode(email);
        result = 31 * result + Double.hashCode(salary);
        return result;
    }
}
