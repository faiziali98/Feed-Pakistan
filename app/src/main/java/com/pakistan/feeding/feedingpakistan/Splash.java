package com.pakistan.feeding.feedingpakistan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by Faizan on 7/26/2015.
 */


public class Splash extends Activity{
    @Override
    protected void onCreate(Bundle feedpak) {
        super.onCreate(feedpak);
        setContentView(R.layout.splash);
        Thread timer=new Thread(){
          public void run(){
              try {
                  sleep(3000);
              }catch(InterruptedException e){

              }finally {
                  Intent startApp=new Intent("com.pakistan.feeding.feedingpakistan.Login");
                  startActivity(startApp);

              }
          }
        };
        timer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
