package com.example.erlin.proyectoservices001;


import android.app.Fragment;
import android.app.FragmentManager;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {
    private String[] titulos;
    private DrawerLayout NavDrawerLayout;
    private ListView NavList;
    private ArrayList<Item_objct> NavItms;
    private TypedArray NavIcons;
    NavigationAdapter NavAdapter;
    private ActionBarDrawerToggle mDrawerToggle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        NavDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        NavList = (ListView) findViewById(R.id.lista);

        View header = getLayoutInflater().inflate(R.layout.header , null);
        NavList.addHeaderView(header);

        NavIcons = getResources().obtainTypedArray(R.array.navigation_iconos);

        titulos = getResources().getStringArray(R.array.nav_options);

        NavItms = new ArrayList<Item_objct>();

        NavItms.add(new Item_objct(titulos[0],NavIcons.getResourceId(0, -1)));
        NavItms.add(new Item_objct(titulos[1],NavIcons.getResourceId(1, -1)));
        NavItms.add(new Item_objct(titulos[2],NavIcons.getResourceId(2, -1)));


        NavAdapter = new NavigationAdapter(this,NavItms);
        NavList.setAdapter(NavAdapter);



        mDrawerToggle = new ActionBarDrawerToggle(

                this,

                NavDrawerLayout,

                R.mipmap.ic_drawer1,

                R.string.drawer_open,

                R.string.drawer_close

        );
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);


        NavList.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long id) {

                MostrarFragment(position);
            }
        });



        MostrarFragment(1);
    }



    private void MostrarFragment(int position) {


        Fragment fragment = null;
        ActionBarActivity actionBarActivity = null;

        switch (position) {
            case 0:


                break;

            case 1:

                fragment = new HomeFragment();

                break;

            case 2:

                fragment = new ProfileFragment();

                break;
            case 3:

                fragment = new Aviso();

                break;

            default:

                Toast.makeText(getApplicationContext(),"Opcion "+titulos[position-1]+"no disponible!", Toast.LENGTH_SHORT).show();

                fragment = new HomeFragment();

                position=1;

                break;

        }

        if (fragment != null) {

            FragmentManager fragmentManager = getFragmentManager();

            fragmentManager.beginTransaction().replace(R.id.content_frame, fragment).commit();


            NavList.setItemChecked(position, true);

            NavList.setSelection(position);


            setTitle(titulos[position-1]);

            NavDrawerLayout.closeDrawer(NavList);

        } else {


            Log.e(	"Error  ", "MostrarFragment"+position);
        }

    }


    @Override
    protected void onPostCreate(Bundle savedInstanceState) {

        super.onPostCreate(savedInstanceState);


        mDrawerToggle.syncState();

    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {

        super.onConfigurationChanged(newConfig);

        mDrawerToggle.onConfigurationChanged(newConfig);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        if (mDrawerToggle.onOptionsItemSelected(item)) {

            Log.e("mDrawerToggle pushed", "x");
            return true;
        }


        return super.onOptionsItemSelected(item);
    }

}
