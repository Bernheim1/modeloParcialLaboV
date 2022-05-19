package com.example.modelopp;

import android.app.Activity;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ProductoView {

    Producto producto;
    Activity a;
    TextView tvId;
    EditText edNombre;
    EditText edCantidad;
    EditText edPrecioUnidad;
    Button btn;

    public ProductoView(Producto producto, Activity a, ProductoController controller){

        this.producto = producto;
        this.a = a;

        if(this.edNombre == null){
            this.tvId = this.a.findViewById(R.id.tvId);
            this.edNombre = this.a.findViewById(R.id.edNombre);
            this.edCantidad = this.a.findViewById(R.id.edCantidad);
            this.edPrecioUnidad = this.a.findViewById(R.id.edPrecioUnidad);
            this.btn = this.a.findViewById(R.id.btnEditar);
            this.btn.setOnClickListener(controller);
        }

    }

    public void cargarModelo(){
        this.producto.setId(Integer.parseInt(tvId.getText().toString()));
        this.producto.setNombre(edNombre.getText().toString());
        this.producto.setCantidad(Integer.parseInt(edCantidad.getText().toString()));
        this.producto.setPrecioUnidad(Float.parseFloat(edPrecioUnidad.getText().toString()));

        AdapterProducto aux = new AdapterProducto();
        aux.ActualizarItem(this.producto.getIndice(), this.producto);
        this.a.finish();
    }

    public void mostrarModelo(){
        tvId.setText(this.producto.getId().toString());
        edNombre.setText(this.producto.getNombre());
        edCantidad.setText(this.producto.getCantidad().toString());
        edPrecioUnidad.setText(this.producto.getPrecioUnidad().toString());

    }


}
