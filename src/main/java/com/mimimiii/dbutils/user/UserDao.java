package com.mimimiii.dbutils.user;

//ein userdiesnt // erzeugt , ändert user.
public interface UserDao {

    void create(User user);
    User read(Long id); //User bezogen auf das interface
    void update(User user);
    void delete(String userName);


    // zum profil ändern ein put auf den user

    //einloggen und dann route auf den user





}
