package com.mimimiii.dbutils.user;

import com.mimimiii.dbutils.user.User;
import lombok.AllArgsConstructor;

import java.util.Scanner;

public class UserImpl implements User {

    private String username;
    private String password;

//Standartkonstruktor [UserImpl name wie klasse ]
    public UserImpl(){}


    public void setUsername(String username) {
        this.username = username;
    }


    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    //editable profile page!!!
    public void setPassword(String password) {
        if (password.equals(this.password)) {
            System.out.println("Password correctly entered. Now it can be changed.");
            System.out.println("Please enter new password...");
            Scanner scan = new Scanner(System.in);
            String newPassword = scan.nextLine();
            this.password = newPassword;
            System.out.println("new password: " + this.password);
        } else {
            System.out.println("Password wrong, you are not permitted to change!!!");
        }
    }


}



