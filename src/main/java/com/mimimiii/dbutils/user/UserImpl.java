package com.mimimiii.dbutils.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mimimiii.dbutils.database.DatabaseService;


public class UserImpl implements User {

    private final String username;

    private final String name;
    private final String password;
    private final String bio;
    private final String image;
    private final Integer coins;
    private int games;
    private int won_Games;
    private int elo;
// String token ?


    public UserImpl(String username, String name, String password, String bio, String image, Integer coins, int games, int won_Games, int elo) {
        this.username = username;
        this.name = name;
        this.password = password;
        this.bio = bio;
        this.image = image;
        this.coins = coins;
        this.games = games;
        this.won_Games = won_Games;
        this.elo = elo;
    }
/*
    @Override
    public int getId() {
        return 0;
    }

    @Override
    public String getStatus() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getToken() {
        return null;
    }

    @Override
    public int getCoins() {
        return 0;
    }

    @Override
    public void setCoins(int coins) {

    }

    @Override
    public boolean authorize(String password) {
        return false;
    }


 */
/*
    public String getInfo() {

        try {
            Map<String,String> map = new HashMap<>();
            map.put("Name:",name);
            map.put("Bio:",bio);
            map.put("Image:", image);
            map.put("Coins", coins.toString());
      //  return "";  //  return new ObjectMapper().writeValueAsString(map);

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getStats(){
        try {
            Map<String,Integer> map = new HashMap<>();
            map.put("Won_Games:",won_Games);
            map.put("Games:",games);
            return new ObjectMapper().writeValueAsString(map);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }


    public boolean buyPackage(){
        try {
            if (coins < 5){
                return false;
            }
            Connection conn = DatabaseService.getInstance().getConnection();
            PreparedStatement ps = conn.prepareStatement("UPDATE users SET coins = ? WHERE username = ?;");
            ps.setInt(1,coins-5);
            ps.setString(2,username);
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }


    public boolean battleWon(){
        won_Games++;
        games++;
        elo+=3;
        return saveStats();
    }
    public boolean battleLost(){
        games++;
        elo-=5;
        return saveStats();
    }
    public boolean battleDraw(){
        games++;
        return saveStats();
    }
    public boolean saveStats(){
        try {
            Connection conn = DatabaseService.getInstance().getConnection();
            PreparedStatement ps = conn.prepareStatement("UPDATE users SET won_Games = ?, games = ?, elo = ? WHERE username = ?;");
            ps.setInt(1,won_Games);
            ps.setInt(2,games);
            ps.setInt(3,elo);
            ps.setString(4,username);
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean setUserInfo(String name, String bio, String image, String username){
        try {
            Connection conn = DatabaseService.getInstance().getConnection();
            PreparedStatement ps = conn.prepareStatement("UPDATE users SET name = ?, bio = ?, image = ? WHERE username = ?;");
            ps.setString(1, name);
            ps.setString(2, bio);
            ps.setString(3, image);
            ps.setString(4, username);
            int affectedRows = ps.executeUpdate();
            ps.close();
            conn.close();
            if (affectedRows == 1) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }


    public String getUsername() {
    }

 */
}
