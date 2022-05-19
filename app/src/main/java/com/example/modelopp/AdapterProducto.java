package com.example.modelopp;

import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterProducto extends RecyclerView.Adapter<ProductoVH> {

    static List<Producto> productos;
    Activity a;

    public AdapterProducto(){

    }

    public AdapterProducto(List<Producto> productos, Activity a){
        AdapterProducto.productos = productos;
        this.a = a;
    }

    @NonNull
    @Override
    public ProductoVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.producto, parent, false);

        return new ProductoVH(v, this.a);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductoVH holder, int position) {

        holder.tvId.setText(AdapterProducto.productos.get(position).getId().toString());
        holder.tvNombre.setText(AdapterProducto.productos.get(position).getNombre());
        holder.tvCantidad.setText(AdapterProducto.productos.get(position).getCantidad().toString());
        holder.tvPrecioUnidad.setText(AdapterProducto.productos.get(position).getPrecioUnidad().toString());
        holder.item.setOnClickListener(holder);

    }

    @Override
    public int getItemCount() {
        return this.productos.size();
    }


    public void ActualizarItem(Integer indice, Producto producto){
        AdapterProducto.productos.set(indice, producto);
    }
}
