/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author corre
 */
public class Usuario {

    private String correo;
    private String contraseña;
    private String nombre;

    private ListaDoble<Carrito> carrito = new ListaDoble<>();
    private ListaDoble<producto> favoritos = new ListaDoble<>();
    private ListaDoble<Historial> historial = new ListaDoble<>();

    public Usuario() {}

    public Usuario(String correo, String contraseña, String nombre) {
        this.correo = correo;
        this.contraseña = contraseña;
        this.nombre = nombre;
    }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getContraseña() { return contraseña; }
    public void setContraseña(String contraseña) { this.contraseña = contraseña; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public ListaDoble<Carrito> getCarrito() { return carrito; }
    public ListaDoble<producto> getFavoritos() { return favoritos; }
    public ListaDoble<Historial> getHistorial() { return historial; }
}   

