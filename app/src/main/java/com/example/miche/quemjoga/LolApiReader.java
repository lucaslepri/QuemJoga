package com.example.miche.quemjoga;

import android.os.AsyncTask;

import org.json.JSONObject;

/**
 * Created by miche on 1/12/2017.
 */

class LolApiReader extends AsyncTask<String, Void, JSONObject> {

    @Override
    protected JSONObject doInBackground(String... params) {
        String playerName = params[0];
        Player p;
        JSONObject playerJson = new JSONObject();
        try {
            return JSONReader.readJsonFromUrl("https://na.api.pvp.net/api/lol/br/v1.4/summoner/by-name/" + playerName + "?api_key=RGAPI-30ba7060-29bd-46b7-a697-04c91598758a");

        } catch (Exception e) {

        }
        return new JSONObject();
    }

    public static JSONObject getPlayerJSon(String playerName){
        return null;
    }

}
