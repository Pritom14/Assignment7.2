package com.example.shaloin.seventhassignmentb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private AGSQLiteHelper sqlliteCountryAssistant;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final AutoCompleteTextView textView = (AutoCompleteTextView) findViewById(R.id.autocompleteID);

        sqlliteCountryAssistant = new AGSQLiteHelper(MainActivity.this);
        sqlliteCountryAssistant.openDB();

        // Insert a few countries that begin with "C"
        sqlliteCountryAssistant.insertCountry("Cambodia");
        sqlliteCountryAssistant.insertCountry("Cameroon");
        sqlliteCountryAssistant.insertCountry("Canada");
        sqlliteCountryAssistant.insertCountry("Cape Verde");
        sqlliteCountryAssistant.insertCountry("Cayman Islands");
        sqlliteCountryAssistant.insertCountry("Chad");
        sqlliteCountryAssistant.insertCountry("Chile");
        sqlliteCountryAssistant.insertCountry("China");

        //sqlliteCountryAssistant.removeCountry("Chad");
        //sqlliteCountryAssistant.updateCountry("Canada", "Costa Rica");

        String[] countries = sqlliteCountryAssistant.getAllCountries();

        // Print out the values to the log
        for(int i = 0; i < countries.length; i++)
        {
            Log.i(this.toString(), countries[i]);
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item, countries);
        textView.setAdapter(adapter);
    }

    public void onDestroy()
    {
        super.onDestroy();
        sqlliteCountryAssistant.close();
    }
}