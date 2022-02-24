package com.mimimiii.dbutils.user;

import java.util.ArrayList;
import java.util.List;

public class User2 {

    //testzwecke
public List<UserImpl> users = new ArrayList<>();

    public String Password;

    public String Username;


    public User2(String password, String username) {
        Password = password;
        Username = username;
    }


    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }





}
