package com.mimimiii.dbutils.rest_stateTransfer;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {

// Anfragen beantworten || lokalemn server
   //  Klasse ServerSocket // serversocket member dieser klasse
    private ServerSocket serversocket = null;




    private int port;


    // Konstruktor
    public Server (int port) {

        try {
            serversocket = new ServerSocket(port);
        } catch(IOException exc) {
            exc.printStackTrace();
        }

    }

public void start () {
if ( serversocket == null) {
    System.out.println("Server kann nicht gestartet werden, da der socket null ist!:  ");
    return;
}
    System.out.println("Server startet:  " + serversocket.toString());
try {


    // hier wird eine client verbindung akzeptiert.
    Socket clientsocket =     serversocket.accept(); // wenn zurück kommen, dann muss schon einer verbunden sein.
    InputStream reader = clientsocket.getInputStream();

    // read Methode liefert mir meien int variable zurück || 1 read sind 8 bit (1 int ) - 1 byte
    int variable_für_read = reader.read();
    // in variable_für_read gecastet.
    char ascii_fuer_einInt = (char)variable_für_read;

    System.out.println(" folgenden Wert eingelesen: " + ascii_fuer_einInt );
    clientsocket.close();
} catch (IOException exc ){
    exc.printStackTrace();
    // hier ende, dann habe ich exception geschmissen
    return;
}



    }

    // eine accept methode, welche die anfrage vom serverSocket nach MyHandler bearbeitet
   //  accept()

// Antowrt 400 "bad request"
    // Antwort 200 "OK"

   // POST http://localhost:10001 / users




    // client öffnet socket

  //   eindeutige ip adresse
   //  kanal öffnen



}
