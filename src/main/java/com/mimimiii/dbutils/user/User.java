package com.mimimiii.dbutils.user;


// soll ein funktionales Interface bleiben! /// der tatsächliche user
public interface User {



    public String getName();

    public String getPassword();


    public boolean setPassword(String password);



}
