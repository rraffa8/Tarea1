package com.example.listview;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class LegosActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legos);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_legos, menu);
        return true;
    }
}
