
package Proyecto_Final;
public class Pila {
    
    private NodoPila cima;
    
    //constructor para inicializar la pila vacia
    public Pila(){
        cima=null;
        
    }
    
    //push
    public void insertarDato(int dato){
        NodoPila nuevoNodo;
        nuevoNodo=new NodoPila(dato);
        nuevoNodo.siguiente=cima;
        cima=nuevoNodo;
    }
    
    //Top
    public int cima(){
        return cima.informacion;
      
    }
    
    //is Empty
    public boolean pilaVacia(){
        return cima==null;
    }
    
    //pop
    public int eliminarDato(){
        int aux=cima.informacion;
        cima=cima.siguiente;
        return aux;
    }
    //clear
    public void limpiarPila(){
        NodoPila nodo;
        while(!pilaVacia()){
            nodo=cima.siguiente;
            nodo.siguiente=null;
            
        }
    }
    
}
