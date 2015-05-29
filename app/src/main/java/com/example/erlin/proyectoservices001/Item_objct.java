package com.example.erlin.proyectoservices001;

/**
 * Created by Erlin on 19/05/2015.
 */
public class Item_objct {
    private String titulo;
    private int icono;
    public Item_objct(String title, int icon){
        this.titulo = title;
        this.icono = icon;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getIcono() {
        return icono;
    }

    public void setIcono(int icono) {
        this.icono = icono;
    }
}
