/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.time.LocalDateTime;
/**
 *
 * @author corre
 */
public class Historial {
    private producto producto;
    private LocalDateTime fecha;

    public Historial() {}

    public Historial(producto producto, LocalDateTime fecha) {
        this.producto = producto;
        this.fecha = fecha;
    }

    public producto getProducto() { return producto; }
    public void setProducto(producto producto) { this.producto = producto; }

    public LocalDateTime getFecha() { return fecha; }
    public void setFecha(LocalDateTime fecha) { this.fecha = fecha; }
}

