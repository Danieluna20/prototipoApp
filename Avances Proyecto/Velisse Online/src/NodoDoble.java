/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author corre
 */
public class NodoDoble<T> {
    public T dato;
    public NodoDoble<T> siguiente;
    public NodoDoble<T> anterior;

    public NodoDoble(T dato) {
        this.dato = dato;
    }
}   

