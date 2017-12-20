package com.example.bantumakers.kiandamuzik;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreenActivity extends AppCompatActivity {
    Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
    }

    @Override
    protected void onResume(){
        super.onResume();
        Timer timer = new Timer();
        TimerTask task = new TimerTask(){
        @Override
                public void run(){
                    //Iremos colocar o activity aqui
                    Intent intent = new Intent(context, PrincipalActivity.class);
                    //Intent é o mensageiro do mundo android que nos permite fazer diversas tarefas
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP).setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
                    startActivity(intent);
                    finish();
                }

        };
        timer.schedule(task, 3000L);

    }
}
