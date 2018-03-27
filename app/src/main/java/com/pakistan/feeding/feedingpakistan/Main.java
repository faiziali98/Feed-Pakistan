package com.pakistan.feeding.feedingpakistan;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.TextView;


/**
 * Created by Faizan on 7/26/2015.
 */
public class Main extends AppCompatActivity {
//    int counter;
//    Button add, sub,menu;
//    TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabHost th=(TabHost)findViewById(R.id.tabHost);
        th.setup();
        TabHost.TabSpec specs=th.newTabSpec("tag1");
        specs.setContent(R.id.tab1);
        specs.setIndicator("Counter");
        th.addTab(specs);
        specs=th.newTabSpec("tag2");
        specs.setContent(R.id.tab2);
        specs.setIndicator("Live chat");
        th.addTab(specs);
        specs=th.newTabSpec("tag2");
        specs.setContent(R.id.tab2);
        specs.setIndicator("Maps");
        th.addTab(specs);
//        counter=0;
//        add=(Button)findViewById(R.id.add);
//        sub=(Button)findViewById(R.id.sub);
//        menu=(Button)findViewById(R.id.menu);

//        display=(TextView)findViewById(R.id.text);
//
//        add.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                counter++;
//                display.setText("Your Total is " + counter);
//            }
//        });
//        sub.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                counter--;
//                display.setText("Your Total is " + counter);
//            }
//        });
//        menu.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                Intent startApp = new Intent("com.pakistan.feeding.feedingpakistan.menu");
//                startActivity(startApp);
//            }
//        });
//        FragmentManager fragmentManager=getFragmentManager();
//        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
//        WindowManager wm=getWindowManager();
//        Display d=wm.getDefaultDisplay();
//
//        if (d.getWidth()>d.getHeight()) {
//            Fagmanet1 fragment1=new Fagmanet1();
//            fragmentTransaction.replace(android.R.id.content,fragment1);
//        }else{
//            Fagmanet2 fragment2=new Fagmanet2();
//            fragmentTransaction.replace(android.R.id.content,fragment2);
//        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    protected void onPause() {
        super.onPause();
        finish();
    }
}
