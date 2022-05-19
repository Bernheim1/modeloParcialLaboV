package com.example.modelopp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

public class EditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        ActionBar actionBar = super.getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        Intent i = getIntent();
        Bundle extras = i.getExtras();

        Integer id = extras.getInt("id");
        String nombre = extras.getString("nombre");
        Integer cantidad = extras.getInt("cantidad");
        Float precioUnidad = extras.getFloat("precioUnidad");
        Integer indice = extras.getInt("indice");

        Producto producto = new Producto(id, nombre, cantidad, precioUnidad, indice);

        ProductoController controller = new ProductoController(producto);

        ProductoView view = new ProductoView(producto, this, controller);

        controller.setView(view);

        view.mostrarModelo();

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}