package com.example.erlin.proyectoservices001;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


public class Splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Lanzarthread();

    }
    private void Lanzarthread(){
        Thread timer = new Thread(){
          public void run(){
              try{
                  sleep(5000);
              }catch (InterruptedException e){
                  e.printStackTrace();
              }finally {
                  Intent intent = new Intent(Splash.this, MainActivity.class);
                  startActivity(intent);
              }
          }

        };
        timer.start();
    }

}
