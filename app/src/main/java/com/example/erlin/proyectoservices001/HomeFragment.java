package com.example.erlin.proyectoservices001;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Erlin on 19/05/2015.
 */
public class HomeFragment extends Fragment {

public  HomeFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

       View rootView = inflater.inflate(R.layout.home, container, false);
        return rootView;

    }
}
