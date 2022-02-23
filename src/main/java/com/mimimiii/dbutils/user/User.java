package com.mimimiii.dbutils.user;



import java.io.StreamTokenizer;
public interface User {

    int getId();



    // int getToken();
    String getToken();

    String getUsername();

    String getPassword();

// to know if it is registered or not // to login
    boolean authorize(String password);



// deck status too
    String getStatus();







    int getCoins();

    void setCoins( int coins);


    boolean buyPackage();
}
