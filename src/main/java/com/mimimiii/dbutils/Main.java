package com.mimimiii.dbutils;


import com.mimimiii.dbutils.battle.Battle;
import com.mimimiii.dbutils.database.DatabaseService;
import com.mimimiii.dbutils.rest_stateTransfer.Server;
import com.mimimiii.dbutils.user.User;
import lombok.AllArgsConstructor;

import java.awt.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static java.awt.Color.green;
import static java.awt.Color.red;


// http anfrage einlesen könne, http protokoll implementieren. // get und useres... zur user klasse ... // anfrage richtig einlesen.
@AllArgsConstructor
public class Main {

    public static void main(String[] args) {

       // Color c = new Color(String red, String green,);


        Server myServer = new Server(10001);
        myServer.start();
        //Thread starten für den server zum hören im hintergrund, könnte auch eienn 2. rest server starten.

 // Battle battle = new Battle("huhu");

/*
// bedienung von db __tabellen ausgeben . bug no suchen
        System.out.println(battle.getMatched());
        DatabaseService ichprobiere = DatabaseService.getInstance();
        Connection verbindung = ichprobiere.getConnection();
        try{
            Statement stm = verbindung.createStatement();
            String austesten = "SELECT * from http_news";
            ResultSet result = stm.executeQuery(austesten);
            while (result.next()) {
                System.out.println(result.getString(1) + " - " + result.getString(2) );

            }
        } catch(SQLException exc) {
            System.out.println(exc.getMessage());

        }




        System.out.println();



 */
    }

}
