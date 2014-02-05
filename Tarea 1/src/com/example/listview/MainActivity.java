package com.example.listview;

import java.util.ArrayList;
import java.util.Arrays;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity   {
	
	 private ListView mainListView ;  
	  private ArrayAdapter<String> listAdapter ; 

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        mainListView = (ListView) findViewById( R.id.listView1 ); 
    
        String[] planets = new String[] { "tienda de lego", "tienda de libros", "tienda de zapatos", "tienda de ropa",  
                "tienda de vinos"};    
       
        ArrayList<String> planetList = new ArrayList<String>();  
        planetList.addAll( Arrays.asList(planets) ); 
        
        listAdapter = new ArrayAdapter<String>(this, R.layout.item, planetList); 
        
       
        mainListView.setAdapter( listAdapter ); 
        
        mainListView.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                    int position, long id) {
            	Intent newActivity;
            	switch (position) {
                case 0:
                 newActivity = new Intent(MainActivity.this, LegosActivity.class);     
                 MainActivity.this.startActivity(newActivity);
                 break;
                case 1:
                    newActivity = new Intent(MainActivity.this, LibrosActivity.class);     
                    MainActivity.this.startActivity(newActivity);
                break;
             
                default:
                  
              }
            	

          }
        });

        
        
        
    }
    
   

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
