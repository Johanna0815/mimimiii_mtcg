package com.mimimiii.dbutils.battle;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mimimiii.dbutils.http_news.ContentType;
import com.mimimiii.dbutils.http_news.HttpStatus;
import com.mimimiii.dbutils.rest_stateTransfer.Request;
import com.mimimiii.dbutils.rest_stateTransfer.Response;
import lombok.Getter;

import java.util.List;

public class Controller {
    @Getter
    private ObjectMapper objectMapper;

    public Controller() {
        this.objectMapper = new ObjectMapper();
    }

    public static class BattleController extends Controller {
        private BattleService battleService;

        public BattleController(BattleService battleService) {
            super();
            this.battleService = battleService;
        }

        // GET /weather
        public Response getBattle() {
            try {
                List battleData = this.battleService.getBattle();
                // "[ { \"id\": 1, \"battle\": \"Ork\", \"temperature\": 9.0 }, { ... }, { ... } ]"
                String battleDataJSON = this.getObjectMapper().writeValueAsString(battleData);

                return new Response(
                        HttpStatus.OK,
                        ContentType.JSON,
                        battleDataJSON
                );
            } catch (JsonProcessingException exc) {
                exc.printStackTrace();
                return new Response(
                        HttpStatus.INTERNAL_SERVER_ERROR,
                        ContentType.JSON,
                        "{ \"message\" : \"Internal Server Error\" }"
                );
            }
        }

        // POST /battle
        public Response addBattle(Request request) {
            Battle battle = null;
            try {

                // request.getBody() => "{ \"id\": 4, \"city\": \"Graz\", ... }
                battle = this.getObjectMapper().readValue(request.getBody(), Battle.class);
                this.battleService.addBattle(battle);

                return new Response(
                        HttpStatus.CREATED,
                        ContentType.JSON,
                        "{ message: \"Success\" }"
                );
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }

            return new Response(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    ContentType.JSON,
                    "{ \"message\" : \"Internal Server Error\" }"
            );
        }
    }
}

