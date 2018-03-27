package com.pakistan.feeding.feedingpakistan;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

//Several Activity lifecycle methods are instrumented to emit LogCat output
//so you can follow this class' lifecycle
public class ListFrag extends Activity {

    Button menu;
    menu m=new menu();
    private final menu mQuoteFragment = new menu();
    private FragmentManager mFragmentManager;
    private FrameLayout mTitleFrameLayout, mQuotesFrameLayout;
    boolean set=false;
   /* private static final int MATCH_PARENT = LinearLayout.LayoutParams.MATCH_PARENT;
    private static final String TAG = "ListFrag";*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Get the string arrays with the titles and qutoes

        setContentView(R.layout.listfrag);

        // Get references to the TitleFragment and to the QuotesFragment
        mTitleFrameLayout = (FrameLayout) findViewById(R.id.main_fragment_container);
        mQuotesFrameLayout = (FrameLayout) findViewById(R.id.bar_fragment_container);


        // Get a reference to the FragmentManager
        mFragmentManager = getFragmentManager();

        // Start a new FragmentTransaction
        FragmentTransaction fragmentTransaction = mFragmentManager
                .beginTransaction();

        // Add the TitleFragment to the layout
        fragmentTransaction.add(R.id.main_fragment_container,
                new Tabs());

        // Commit the FragmentTransaction
        fragmentTransaction.commit();
        menu=(Button)findViewById(R.id.menu);
        // Add a OnBackStackChangedListener to reset the layout when the back stack changes
        menu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setLayout();
            }
        });
    }

    private void setLayout() {

        // Determine whether the QuoteFragment has been added
        if (!set) {
            FragmentTransaction fragmentTransaction = mFragmentManager
                    .beginTransaction();

            // Add the TitleFragment to the layout
            fragmentTransaction.add(R.id.main_fragment_container,
                    new menu());

            // Commit the FragmentTransaction
            fragmentTransaction.commit();
            set=true;
        } else {
            FragmentTransaction transaction= mFragmentManager
                    .beginTransaction();
            transaction.remove(new menu());
            transaction.commit();
            transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);
            FragmentTransaction fragmentTransaction = mFragmentManager
                    .beginTransaction();

            // Add the TitleFragment to the layout
            fragmentTransaction.add(R.id.main_fragment_container,
                    new Tabs());

            // Commit the FragmentTransaction
            fragmentTransaction.commit();
            set=false;
        }
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
