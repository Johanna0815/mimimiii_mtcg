package com.mimimiii.dbutils;
import com.mimimiii.dbutils.rest_stateTransfer.Server;
import com.mimimiii.dbutils.battle.App;
import com.mimimiii.dbutils.rest_stateTransfer.Server;
import com.mimimiii.dbutils.user.User;
import lombok.AllArgsConstructor;

import java.io.IOException;


// http anfrage einlesen könne, http protokoll implementieren. // get und useres... zur user klasse ... // anfrage richtig einlesen.
@AllArgsConstructor
public class Main {

    public static void main(String[] args) throws IOException {
        App app = new App();
        Server myServer;
        myServer = new Server(10001, app);

        try {
            myServer.start();
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }

}


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



