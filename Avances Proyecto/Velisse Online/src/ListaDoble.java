/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author corre
 */
public class ListaDoble<T> {

    private NodoDoble<T> cabeza;
    private NodoDoble<T> cola;
    private int size = 0;

    public void agregar(T dato) {
        NodoDoble<T> nuevo = new NodoDoble<>(dato);
        if (cabeza == null) {
            cabeza = cola = nuevo;
        } else {
            cola.siguiente = nuevo;
            nuevo.anterior = cola;
            cola = nuevo;
        }
        size++;
    }

    public boolean eliminar(T dato) {
        NodoDoble<T> actual = cabeza;

        while (actual != null) {
            if ((dato == null && actual.dato == null) ||
                (dato != null && dato.equals(actual.dato))) {

                if (actual == cabeza && actual == cola) {
                    cabeza = cola = null;
                } else if (actual == cabeza) {
                    cabeza = cabeza.siguiente;
                    cabeza.anterior = null;
                } else if (actual == cola) {
                    cola = cola.anterior;
                    cola.siguiente = null;
                } else {
                    actual.anterior.siguiente = actual.siguiente;
                    actual.siguiente.anterior = actual.anterior;
                }
                size--;
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    public List<T> toList() {
        List<T> lista = new ArrayList<>();
        NodoDoble<T> actual = cabeza;

        while (actual != null) {
            lista.add(actual.dato);
            actual = actual.siguiente;
        }
        return lista;
    }

    public int size() {
        return size;
    }

    public NodoDoble<T> getCabeza() {
        return cabeza;
    }
}

