package com.example.miche.quemjoga;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PlayerDataActivity extends AppCompatActivity {

    Player p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_data);

        Intent intent = getIntent();
        String playerName = intent.getStringExtra("playerName");
        Player p = new Player(playerName);
        TextView t = (TextView)findViewById(R.id.textoPlayer);
        String textToShow = "NICK: " + playerName + "/" + p.getName() + "Level: " + p.getLevel();
        t.setText(textToShow);
    }

    public void setPlayer(Player p){
        this.p = p;
    }


}
