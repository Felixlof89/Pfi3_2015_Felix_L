package com.example.felix.a1_felix_l;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends ActionBarActivity {
    Random rand = new Random();
    int i = 0;

    public void buttonClick(View v) {

        TextView t1 = (TextView) findViewById(R.id.quote1);
        t1.setText (null);



        String[] quoteList = getResources().getStringArray(R.array.stringQuotes);

        i = rand.nextInt(quoteList.length);
        t1.setText(quoteList[i]);




        t1.setText(quoteList[i]);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
    @Override
    protected void onStart(){
        super.onStart();
        Log.i("OnStart", "Started");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i("OnPause", "Pause");
        ]

        @Override
        protected void onResume() {
            super.onResume();
            Log.i("OnResume", "Resumed");
        }

       @Override
            protected void onDestroy() {
            super.onDestroy();
            Log.i("OnDestroy", "Destroyed");
        }
}
