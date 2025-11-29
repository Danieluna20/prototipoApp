/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Objects;
/**
 *
 * @author corre
 */
public class producto {
    private String nombre;
    private double precio;
    private String categoria; // mujer, hombre, niño, accesorios
    private String imagen;    // ruta "/imagenes/loquesea.png"

    public producto() {}

    public producto(String nombre, double precio, String categoria, String imagen) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.imagen = imagen;
    }

    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public String getCategoria() { return categoria; }
    public String getImagen() { return imagen; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setPrecio(double precio) { this.precio = precio; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
    public void setImagen(String imagen) { this.imagen = imagen; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof producto)) return false;
        producto p = (producto) o;
        return Objects.equals(nombre, p.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}

