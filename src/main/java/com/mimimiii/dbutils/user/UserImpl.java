package com.mimimiii.dbutils.user;


import com.google.common.hash.Hashing;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.nio.charset.StandardCharsets;


@Builder(toBuilder = true)
public class UserImpl implements User {


    @Getter
    int id;

    @Getter
    String status;

    @Getter
    String username;

    @Getter
    String password;

    @Getter
    String token;

    @Getter
    @Setter
    @Builder.Default
    int coins = 20;

    @Override
    public boolean authorize(String password) {
        //noinspection __!  UnstableApiUsage
        String passwordHash = Hashing.sha256()
                .hashString(password, StandardCharsets.UTF_8)
                .toString();

        return passwordHash.equals(getPassword());
    }

    @Override
    public boolean buyPackage() {
        return false;
    }

    @Override
    public double getName() {
        return 0;
    }

    @Override
    public void battleLoost() {

    }

    @Override
    public void battleWon() {

    }

    @Override
    public void battleDraw() {

    }
}