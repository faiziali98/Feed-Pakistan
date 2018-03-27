package com.pakistan.feeding.feedingpakistan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Faizan on 7/26/2015.
 */


public class Login extends Activity{
    Button login;
    EditText us, pas;
    @Override
    protected void onCreate(Bundle feedpak) {
        super.onCreate(feedpak);
        setContentView(R.layout.login);
        login=(Button)findViewById(R.id.signin);
        us=(EditText)findViewById(R.id.user);
        pas=(EditText)findViewById(R.id.pass);
        us.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                us.setText("");
            }
        });
        pas.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                pas.setText("");
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Thread timer = new Thread() {
                    public void run() {
                        Intent startApp = new Intent("com.pakistan.feeding.feedingpakistan.ListFrag");
                        startActivity(startApp);
                    }
                };
                timer.start();
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
