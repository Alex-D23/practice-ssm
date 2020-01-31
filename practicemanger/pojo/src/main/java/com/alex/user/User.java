package com.alex.user;

/**
 * @Duthor: Dailm
 * @Date: 2020-01-30 14:59
 * @Descripton:
 * @Version: 1.0
 */
public class User {
    private int id;
    private String userName;
    private String phone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
