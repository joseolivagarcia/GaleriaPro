package joseoliva.com.gallerypro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreen extends AppCompatActivity {

    LottieAnimationView imagelotti; //esta es la var donde se reporducira la animacion
    int animation; //esta es la animacion a reproducir

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        imagelotti = findViewById(R.id.lotticamera);
        animation = R.raw.photography; //inicializo la var de la animacion

        imagelotti.setAnimation(animation); //pongo la animacion en su sitio
        imagelotti.playAnimation(); //y la reproduzco

        //creo una tarea que se ejecutara en un tiempo determinado. En este caso la carga del main activity
        TimerTask tarea = new TimerTask (){
            @Override
            public void run(){
                Intent intent = new Intent(SplashScreen.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        };
        //creo una var timer para decirle cuando tiene que ejecutar la tarea
        Timer tiempo = new Timer();
        tiempo.schedule(tarea,2000);
    }
}