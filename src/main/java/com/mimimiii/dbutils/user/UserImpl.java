package com.mimimiii.dbutils.user;

import java.util.Scanner;

public class UserImpl implements User {


    private String name;
    private String password;
    private int id;


//Standartkonstruktor [UserImpl name wie klasse ] //zum objekte erzeugen.
    public UserImpl(){}

    public UserImpl(String name, String password){}




    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return this.name; // this nicht nötig.
    }

    public String getPassword() {
        return this.password;
    }



//validate password
    //editable profile page!!!
    public boolean setPassword(String password) {
        if (password.equals(this.password)) {
            System.out.println("Password correctly entered. Now it can be changed.");
            System.out.println("Please enter new password...");
           // Scanner scan = new Scanner(System.in);
            String newPassword = scan.nextLine();
            this.password = newPassword;
            System.out.println("new password: " + this.password);
        } else {
            System.out.println("Password wrong, you are not permitted to change!!!");
        }

       // return true;
    }


}



