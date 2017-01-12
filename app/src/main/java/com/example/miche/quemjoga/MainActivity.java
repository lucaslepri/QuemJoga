package com.example.miche.quemjoga;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mostrarPlayer(View view){
        Intent intent = new Intent(this, PlayerDataActivity.class);
        EditText editText = (EditText) findViewById(R.id.playerName);
        String playerName = editText.getText().toString();
        intent.putExtra("playerName", playerName);
        startActivity(intent);
    }
}
