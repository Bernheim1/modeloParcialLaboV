package com.example.modelopp;

public class Producto {

    private Integer id;
    private String nombre;
    private Integer cantidad;
    private Float precioUnidad;
    private Integer indice;


    public Producto(Integer id, String nombre, Integer cantidad, Float precioUnidad) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioUnidad = precioUnidad;
    }

    public Producto(Integer id, String nombre, Integer cantidad, Float precioUnidad, Integer indice) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioUnidad = precioUnidad;
        this.indice = indice;
    }

    public Integer getId(){
        return this.id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Float getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(Float precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public Integer getIndice() {
        return indice;
    }

    public void setIndice(Integer indice) {
        this.indice = indice;
    }
}
