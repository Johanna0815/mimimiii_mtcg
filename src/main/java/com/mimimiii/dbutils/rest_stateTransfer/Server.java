package com.mimimiii.dbutils.rest_stateTransfer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mimimiii.dbutils.user.UserImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;


// public class Server<ObjectMapper>
public class Server {

    // Anfragen beantworten || lokalemn server
    //  Klasse ServerSocket // serversocket member dieser klasse
    private ServerSocket serversocket = null;

    private int port;

    public Server(int port) {

        try {
            serversocket = new ServerSocket(port);
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }

    public void start() {
        if (serversocket == null) {
            System.out.println("Server kann nicht gestartet werden, da der socket null ist!:  ");
            return;
        }
        System.out.println("Server starts:  " + serversocket.toString());
        try {
            // accepts connection to the client.
            Socket clientsocket = serversocket.accept(); // when it comes back here, one must already be connected
            InputStream stream = clientsocket.getInputStream();

            // sagt mir die bytesZahl in mein inputstream
            stream.available();


// Das Lesen erfolgt zur Performance-Optimierung zunächst in einen BufferedReader
// der ein Objekt eines InputStreamReaders im Konstrukor entgegennimmt

// The BufferedReader class of Java is used to read the stream of characters
// from the specified source (character-input stream). The constructor of this class accepts an InputStream object as a parameter.
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(stream));
// bis hier liest 1. zeile header.
            System.out.println(bufferedReader.readLine());
            //       System.out.println(bufferedReader.readLine());


// ------------------roto -- ganzes objekt auslesen.
        Norm2AllModes.NoopNormalizer2 jsonStrBuilder = null;
            variable_für_read.append((char) reader.read());

            ObjectMapper mapper = new ObjectMapper();
            String jsonResult = mapper.writeValueAsString(movie);

            String jsonStr = jsonStrBuilder.toString();

            UserImpl user = .fromJson(jsonStr, UserImpl.class);
            System.out.println(user.Username + "" + user.Password);


//------------------


            //     System.out.println(" folgenden Wert eingelesen: " + ascii_fuer_einInt);
            clientsocket.close();
        } catch (IOException exc) {
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
