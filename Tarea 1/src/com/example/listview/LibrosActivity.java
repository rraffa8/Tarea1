package com.example.listview;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class LibrosActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_libros);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_libros, menu);
        return true;
    }
}
