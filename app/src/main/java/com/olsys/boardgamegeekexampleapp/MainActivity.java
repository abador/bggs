package com.olsys.boardgamegeekexampleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.olsys.boardgamegeekexampleapp.adapter.BoardGamesAutocompleteAdapter;
import com.olsys.boardgamegeekexampleapp.widget.DelayAutoCompleteTextView;
import com.olsys.utils.Log;

public class MainActivity extends AppCompatActivity {
    private static String TAG = "AppCompatActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "OnCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final DelayAutoCompleteTextView searchInput = (DelayAutoCompleteTextView) findViewById(R.id.edit_boardgame_search);
        searchInput.setThreshold(3);
        searchInput.setAdapter(new BoardGamesAutocompleteAdapter(this));
        searchInput.setLoadingIndicator(
                (android.widget.ProgressBar) findViewById(R.id.pb_loading_indicator));
    }
}
