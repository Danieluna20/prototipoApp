/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author corre
 */
public class Carrito {
 private producto producto;
 private int cantidad;

    public Carrito() {}

    public Carrito(producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public producto getProducto() { return producto; }
    public void setProducto(producto producto) { this.producto = producto; }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }
}   

