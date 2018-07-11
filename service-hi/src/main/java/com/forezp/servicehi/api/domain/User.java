package com.forezp.servicehi.api.domain;

/**
 * @author renpeng
 * @date 2018/7/11
 */
public class User {
    private int userID;
    private String userName,password;
    public User(int userID, String userName, String password) {
        super();
        this.userID = userID;
        this.userName = userName;
        this.password = password;
    }
    public int getUserID() {
        return userID;
    }
    public void setUserID(int userID) {
        this.userID = userID;
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
    public User() {
        super();
    }
    @Override
    public String toString() {
        return "User [userID=" + userID + ", userName=" + userName + ", password=" + password + "]";
    }
}
