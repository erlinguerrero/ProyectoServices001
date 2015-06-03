package com.example.erlin.proyectoservices001;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class ProfileFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v =  inflater.inflate(R.layout.tocacategoria, container, false);

       initUi(v);

        return v;
    }

    private void initUi(View v) {
        ImageView b1 = (ImageView)v.findViewById(R.id.Btn1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent se = new Intent(getActivity(), Categoria.class);
                    startActivity(se);
            }
        });
    }
}
