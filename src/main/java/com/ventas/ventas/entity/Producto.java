package com.ventas.ventas.entity;

public class Producto {
    private Integer id;
    private String name;
    private String marca;
    private Integer cantidad;

    public Producto(Integer id, String name, String marca, Integer cantidad) {
        this.id = id;
        this.name = name;
        this.marca = marca;
        this.cantidad = cantidad;
    }

    public Producto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marca='" + marca + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
