package com.mimimiii.dbutils;


import com.mimimiii.dbutils.battle.Battle;
import com.mimimiii.dbutils.database.DatabaseService;
import lombok.AllArgsConstructor;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@AllArgsConstructor
public class Main {

    public static void main(String[] args) {
// args.length();

        //Thread starten für den server zum hören im hintergrund, könnte auch eienn 2. rest server starten.

 Battle battle = new Battle("huhu");


// bedienung von db __tabellen ausgeben . bug no suchen
        System.out.println(battle.getMatched());
        DatabaseService ichprobiere = DatabaseService.getInstance();
        Connection verbindung = ichprobiere.getConnection();
        try{
            Statement stm = verbindung.createStatement();
            String austesten = "SELECT * from information_schema.tables";
            ResultSet result = stm.executeQuery(austesten);
            while (result.next()) {
                System.out.println(result.getString(1) + " - " + result.getString(2) +" - " + result.getString(3) +" - " + result.getString(4));

            }
        } catch(SQLException exc) {
            System.out.println(exc.getMessage());

        }




        System.out.println();


    }

}
