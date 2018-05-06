package org.zj.tieba.bean;

public class User {
    private int id;
    private String userName;
    private String password;
    private String permission;

    public User() {
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public User(int id, String userName, String password, String permission) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.permission = permission;
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}
