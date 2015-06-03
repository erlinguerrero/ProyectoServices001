package com.example.erlin.proyectoservices001;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class Servicio extends ActionBarActivity {
    ListViewAdapter adapter;

    ListView list;
    String[] servicios = new String[]{
            "Carpintero",
            "Tecnico Computo",
            "Belleza",
            "Electricista",
            "Pintor",
            "Soldadura",
            "Mecanica"
    };
    int[] img = {
            R.mipmap.ic_action_home,
            R.mipmap.ic_action_home,
            R.mipmap.ic_action_home,
            R.mipmap.ic_action_home,
            R.mipmap.ic_action_home,
            R.mipmap.ic_action_home,
            R.mipmap.ic_action_home
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.servicio);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        list = (ListView) findViewById(R.id.milista);
        ArrayAdapter adapters = new ArrayAdapter(this, android.R.layout.simple_list_item_1, servicios);
        list.setAdapter(adapters);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int posicion, long l) {

                switch (posicion) {
                    case 0 :
                        Toast toast1 = Toast.makeText(getApplicationContext(), "Cliente", Toast.LENGTH_SHORT);
                        toast1.show();
                        break;
                    case 1 :


                        break;
                    case 2:


                        break;
                    case 3 :


                        break;
                    case 4 :


                        break;
                    case 5 :


                        break;
                    case 6 :


                        break;
                    default:
                        Toast.makeText(getApplicationContext(), "", Toast.LENGTH_SHORT).show();
                }
            }
        });
        final ListView list = (ListView) findViewById(R.id.milista);
        adapter = new ListViewAdapter(this, servicios, img);
        list.setAdapter(adapter);




    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_utilidad, menu);
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
