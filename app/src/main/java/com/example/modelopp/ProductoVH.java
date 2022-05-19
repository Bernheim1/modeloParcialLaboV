package com.example.modelopp;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class ProductoVH extends RecyclerView.ViewHolder implements View.OnClickListener {

    TextView tvId;
    TextView tvNombre;
    TextView tvCantidad;
    TextView tvPrecioUnidad;
    View item;
    Activity a;

    public ProductoVH (View itemView, Activity a){
        super(itemView);
        this.tvId = itemView.findViewById(R.id.tvId);
        this.tvNombre = itemView.findViewById(R.id.txtNombre);
        this.tvCantidad = itemView.findViewById(R.id.txtCantidad);
        this.tvPrecioUnidad = itemView.findViewById(R.id.txtPrecio);
        this.item = itemView.findViewById(R.id.producto);
        this.a = a;
    }

    public void onClick(View v){

        Intent i = new Intent(this.a, EditActivity.class);
        i.putExtra("id", Integer.parseInt((String) this.tvId.getText()));
        i.putExtra("nombre", this.tvNombre.getText());
        i.putExtra("cantidad", Integer.parseInt((String) this.tvCantidad.getText()));
        i.putExtra("precioUnidad", Float.parseFloat((String) this.tvCantidad.getText()));
        i.putExtra("indice", this.getAdapterPosition());

        a.startActivity(i);

    }
}
