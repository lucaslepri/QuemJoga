package com.example.miche.quemjoga;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

/**
 * Created by miche on 1/12/2017.
 */

public class Player {
    String name;
    String level;
    String elo;
    JSONObject playerJson;

    public Player(String name){

        JSONObject playerJson = null;
        try {
            playerJson = new LolApiReader().execute(name).get();
            JSONObject jo = playerJson.getJSONObject(name.toLowerCase());
            this.name = jo.getString("name");
            this.level = jo.getString("summonerLevel");
        } catch (Exception e) {
            name = "erro";
            level = "erro";
        }
    }

    public Player(String name, String level){
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public String getLevel(){
        return level;
    }

    public void setName(String playerName){this.name = playerName;}

    public void setLevel(String level){this.level = level;}

}
