package com.mimimiii.dbutils.battle;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mimimiii.dbutils.http_news.ContentType;
import com.mimimiii.dbutils.http_news.Crud_Method;
import com.mimimiii.dbutils.http_news.HttpStatus;
import com.mimimiii.dbutils.rest_stateTransfer.Request;
import com.mimimiii.dbutils.rest_stateTransfer.Response;
import com.mimimiii.dbutils.rest_stateTransfer.ServerApp;
import com.mimimiii.dbutils.user.User2;

import java.sql.SQLOutput;

public class App implements ServerApp {
    private final Controller.BattleController battleController;

    public App() {
        this.battleController = new Controller.BattleController(new BattleService());
    }




    private User2 parseStringToObject(String json) throws JsonProcessingException{
    //  System.out.println(json);

      String[] test = json.split(":");

      /*  for(String s: test){
            System.out.println(s);
        }

       */

      String[] test2 = test[1].split(",");

      String Username = test2[0];
      String Password = test[2].substring(0, test[2].length() -1 );
       // System.out.println(Username);
     //   System.out.println(Password);


        User2 user2 = new User2(Password, Username);
/*
        JsonFactory factory = new JsonFactory();
        ObjectMapper mapper = new ObjectMapper(factory);
        User2 user2 = new User2();
      //  JsonNode node = mapper.readTree(json);
       // JsonNode node = mapper.
        System.out.println(node);
        user2.setUsername(node.get("Username").toString().replace("\"",""));
        user2.setPassword(node.get("Password").toString().replace("\"", ""));
         System.out.println(user2);
        return user2;

 */
        return user2;
    }




    @Override
    public Response handleRequest(Request request) { // meine methode
        if (request.getPathname().equals("/users") && request.getCrud_Method() == Crud_Method.POST)
        {

       //  System.out.println("requestBody: \n" + request.getBody() );


           // String json = request.getBody();


/*
            ObjectMapper objectMapper = new ObjectMapper();
            try {
                String json = "{\"Username\":\"kienboec\", \"Password\":\"daniel\"}";
                JsonNode node = objectMapper.readTree(json);
                String name = node.get("Username").asText();
                System.out.println("NAme: " + name);
              //  User2 user2 = objectMapper.readValue(json, User2.class);
               // System.out.println("NAme: " + user2.getUsername());
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }

 */


            System.out.println("hier"); //battleController.getBattle();


            try {
              User2 gotbackUser2 =  parseStringToObject(request.getBody());
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }

            return new Response(HttpStatus.OK, ContentType.JSON, "[great work! :D ]");




        } else if (request.getPathname().equals("/battle") && request.getCrud_Method() == Crud_Method.POST) {
            return this.battleController.addBattle(request);
        }

        return new Response(
                HttpStatus.BAD_REQUEST,
                ContentType.JSON,
                "[Error.]"
        );
    }
}