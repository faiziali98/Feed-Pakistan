package com.pakistan.feeding.feedingpakistan;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
//    int counter;
//    Button add, sub;
//    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //counter=0;
//        add=(Button)findViewById(R.id.add);
//        sub=(Button)findViewById(R.id.sub);

//        display=(TextView)findViewById(R.id.text);
//
//        add.setOnClickListener(new View.OnClickListener(){
//            public void onClick(View v){
//                counter++;
//                display.setText("Your Total is "+counter);
//            }
//        });
//        sub.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                counter--;
//                display.setText("Your Total is "+counter);
//            }
//        });
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
}
