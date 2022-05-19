package com.example.modelopp;

import android.view.View;

public class ProductoController implements View.OnClickListener{

    Producto producto;
    ProductoView view;

    public ProductoController(Producto producto){
        this.producto = producto;
    }

    public void setView(ProductoView view){
        this.view = view;
    }

    public void onClick(View v){
        this.view.cargarModelo();
    }

}
