package com.example.modelopp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    AdapterProducto adapterProducto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Producto> productos = new ArrayList<>();

        for(int i = 0; i < 15; i++){
            productos.add(new Producto(i,"Nombre" + i, i, Float.parseFloat(String.valueOf(i))));
        }

        this.adapterProducto = new AdapterProducto(productos, this);

        RecyclerView rv = super.findViewById(R.id.rvProductos);
        rv.setAdapter(adapterProducto);
        rv.setLayoutManager(new LinearLayoutManager(this));

    }

    protected void onResume(){
        this.adapterProducto.notifyDataSetChanged();
        super.onResume();
    }
}