package Proyecto_Final;

public class Colas {
    private NodoCola frente;
    private NodoCola fin;
   
    public Colas(){
        frente=fin=null;
    }
   
    public void insertarCola(int dato){
        NodoCola nuevoNodo;
        nuevoNodo=new NodoCola(dato);
        if(colaVacia()){
            frente=nuevoNodo;
            
        }else{
            fin.siguiente=nuevoNodo;
        }
        fin=nuevoNodo;
    }
    //si es vacia
    public boolean colaVacia(){
        return frente==null;
    }
    //Saber cual está en el inicio
    public int frenteCola(){
        return frente.informacion;
    }
    //Eliminar un elemento
    public int elimnarDato(){
        int aux=frente.informacion;
        frente=frente.siguiente;
        return aux;
    }
    //limpiar cola
    public void limpiarCola(){
        while(!colaVacia()){
            frente=frente.siguiente;
        }
    }
}