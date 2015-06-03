package com.example.erlin.proyectoservices001;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

public class Aviso extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.aviso, container, false);

        initUi(v);

        return v;
    }

    private void initUi(View v) {
        ImageView b1 = (ImageView) v.findViewById(R.id.aviso);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent se = new Intent(getActivity(), Publicar.class);
                startActivity(se);
            }
        });
    }
}