package com.example.erlin.proyectoservices001;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class ProfileFragment extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v =  inflater.inflate(R.layout.categoria, container, false);

       initUi(v);

        return v;
    }

    private void initUi(View v) {
        Button b1 = (Button)v.findViewById(R.id.Btn1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent se = new Intent(getActivity(), Servicio.class);
                    startActivity(se);
            }
        });
    }
}
