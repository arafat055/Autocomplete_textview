package com.example.mazharulislam.autocomplete_textview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    String[] name= {"Bangldesh", "Germany", "Romania", "Russia", "Nederland", "Australia", "Srilanka","Austria"};
    AutoCompleteTextView autoCompleteTextViews;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        autoCompleteTextViews=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        ArrayAdapter<String>arrayAdapter= new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,name);
        autoCompleteTextViews.setThreshold(1);
        autoCompleteTextViews.setAdapter(arrayAdapter);
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
