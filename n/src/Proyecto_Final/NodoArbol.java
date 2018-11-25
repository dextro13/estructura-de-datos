
package Proyecto_Final;

public class NodoArbol {
    
     protected int dato;
    protected NodoArbol izquierdo;
    protected NodoArbol derecho;
    public NodoArbol(int valor)    {
        dato = valor;
        izquierdo = derecho = null;
    }
    public NodoArbol(NodoArbol ramaIzdo, int valor, NodoArbol ramaDcho)    {
        this(valor);
        izquierdo = ramaIzdo;
        derecho = ramaDcho;
    }
    
}
