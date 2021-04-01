package com.ssreagents.pojo;

import java.util.Objects;

public class User {
    private Integer id;
    private String username;
    private String password;
    private String email;
    private String phone_num;
    private String school;
    private String college;
    private String identity;
    private String pi_name;
    private String student_name ;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phone_num='" + phone_num + '\'' +
                ", school='" + school + '\'' +
                ", college='" + college + '\'' +
                ", identity='" + identity + '\'' +
                ", pi_name='" + pi_name + '\'' +
                ", student_name='" + student_name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(username, user.username) &&
                Objects.equals(password, user.password) &&
                Objects.equals(email, user.email) &&
                Objects.equals(phone_num, user.phone_num) &&
                Objects.equals(school, user.school) &&
                Objects.equals(college, user.college) &&
                Objects.equals(identity, user.identity) &&
                Objects.equals(pi_name, user.pi_name) &&
                Objects.equals(student_name, user.student_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, email, phone_num, school, college, identity, pi_name, student_name);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(String phone_num) {
        this.phone_num = phone_num;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getPi_name() {
        return pi_name;
    }

    public void setPi_name(String pi_name) {
        this.pi_name = pi_name;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public User() {
    }

    public User(Integer id, String username, String password, String email, String phone_num, String school, String college, String identity, String pi_name, String student_name) {

        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone_num = phone_num;
        this.school = school;
        this.college = college;
        this.identity = identity;
        this.pi_name = pi_name;
        this.student_name = student_name;
    }
}
