package com.mimimiii.dbutils.battle;

import com.mimimiii.dbutils.http_news.ContentType;
import com.mimimiii.dbutils.http_news.Crud_Method;
import com.mimimiii.dbutils.http_news.HttpStatus;
import com.mimimiii.dbutils.rest_stateTransfer.Request;
import com.mimimiii.dbutils.rest_stateTransfer.Response;
import com.mimimiii.dbutils.rest_stateTransfer.ServerApp;

public class App implements ServerApp {
    private final Controller.BattleController battleController;

    public App() {
        this.battleController = new Controller.BattleController(new BattleService());
    }

    @Override
    public Response handleRequest(Request request) { // meine methode
        if (request.getPathname().equals("/users") && request.getCrud_Method() == Crud_Method.POST) {

            System.out.println("hier"); //weatherController.getWeather();




            return new Response(HttpStatus.OK, ContentType.JSON, "[]");  ///




        } else if (request.getPathname().equals("/weather") && request.getCrud_Method() == Crud_Method.POST) {
            return this.battleController.addBattle(request);
        }

        return new Response(
                HttpStatus.BAD_REQUEST,
                ContentType.JSON,
                "[]"
        );
    }
}