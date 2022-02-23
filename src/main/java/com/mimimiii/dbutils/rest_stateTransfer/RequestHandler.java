package com.mimimiii.dbutils.rest_stateTransfer;

import com.mimimiii.dbutils.http_news.HttpStatus;
import com.mimimiii.dbutils.http_news.ContentType;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class RequestHandler implements Runnable {

    private Socket clientSocket;
    private ServerApp app;
    private PrintWriter output;
    private BufferedReader in;


    public RequestHandler(Socket clientSocket, ServerApp app) throws IOException {
        this.clientSocket = clientSocket; // inputstreamreader direkt als char interpretiert.
        this.in = new BufferedReader(new InputStreamReader(this.clientSocket.getInputStream())); // bufferedreader liest bis ende an einer zeile // zeile für zeile
        this.output = new PrintWriter(this.clientSocket.getOutputStream(), true);
        this.app = app;
        // wenn socket beendet, und stream gschlossen, beendet sich der BufferedReaDER:
    }


    @Override
    public void run() {
        try {
            Response response;
            Request request = RequestBuilder.buildRequest(this.in);

            if (request.getPathname() == null) {
                response = new Response(
                        HttpStatus.BAD_REQUEST,
                        ContentType.JSON,
                        "[]"
                );
            } else {
                response = this.app.handleRequest(request); // METHODE WO MEINE antwort gibt.// bastelt. entscheided was aufrufen, was ...
            }
            output.write(response.get());
        } catch (IOException exc) {
            System.err.println(Thread.currentThread().getName() + " Error: " + exc.getMessage());
        } finally {
            try {
                if (output != null) {
                    output.close();
                }
                if (in != null) {
                    in.close();
                    clientSocket.close();
                }
            } catch (IOException exc) {
                exc.printStackTrace();
            }
        }
    }

}
