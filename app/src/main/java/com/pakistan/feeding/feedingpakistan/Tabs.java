package com.pakistan.feeding.feedingpakistan;

import android.app.Fragment;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TabHost;
import android.view.LayoutInflater;
import android.widget.TextView;



/**
 * Created by Faizan on 7/26/2015.
 */
public class Tabs extends Fragment {
//    int counter;
//    Button sub,add;
//    TextView display;
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_main,
                container, false);
//        counter=0;

//        Button sub =(Button) view.findViewById(R.id.sub);
//        Button add=(Button) view.findViewById(R.id.add);
        TabHost th=(TabHost)view.findViewById(R.id.tabHost);
        th.setup();
        TabHost.TabSpec specs=th.newTabSpec("tag1");
        specs.setContent(R.id.tab1);
        specs.setIndicator("Counter");
        th.addTab(specs);
        specs=th.newTabSpec("tag2");
        specs.setContent(R.id.tab2);
        specs.setIndicator("Live chat");
        th.addTab(specs);
        specs=th.newTabSpec("tag3");
        specs.setContent(R.id.tab3);
        specs.setIndicator("Maps");
        th.addTab(specs);
//        display=(TextView)view.findViewById(R.id.text);

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
        return view;
    }
    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}
