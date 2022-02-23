package com.mimimiii.dbutils.user;

import java.util.List;

public interface UserService {

    boolean loggedIn();

    boolean isRegistered();


    List<User> getUser();

    User manageCards(String card, String deck);


    User getUser(int id);

    User getUserWithoutSensibleData(int id);

    User getUserByUsername(String username);


    User addUser(User user);

    User updateUser(int id, UserService user);

    boolean deleteUser(int id);


}

