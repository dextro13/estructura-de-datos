
package Proyecto_Final;

import javax.swing.JOptionPane;
public class Listas {
    int dato;
    protected nodolista primero;
    protected nodolista  ultimo;
    protected int tamano;
    public Listas() {
        primero=null;
        ultimo=null;
        
    }
    public void Insertar(int dato){
        nodolista nuevoNodo=new nodolista();
        nuevoNodo.setInformacion(dato);
        if(primero==null){
            primero=nuevoNodo;
            nuevoNodo.setSiguiente(null);
            ultimo=primero;
        }else{
            ultimo.setSiguiente(nuevoNodo);
            nuevoNodo.setSiguiente(null);
            ultimo=nuevoNodo;
        }
    }
    public boolean listaVacia(){
        if(primero==null){
            return true;
        }else{
            
            return false;
        }
    }
    public int eliminarPrimero(){
        int nodoEliminar=0;
        if(!listaVacia()){
            nodoEliminar=primero.getInformacion();
            primero=primero.getSiguiente();
            tamano=-1;
            
        }
            return nodoEliminar;
    }
    public void imprimirNodo(int dato){
        if(!listaVacia()){
            if(dato>tamano-1){
            }
            nodolista tmp=primero;
            for(int i=0;i<dato;i++){
            tmp=tmp.getSiguiente();
            if(tmp==null){
                return;
            }
          }
            JOptionPane.showMessageDialog(null,"el nodo a mostrar es:"+tmp.getInformacion());
        }else{
            JOptionPane.showMessageDialog(null,"el nodo no existe");
        }
    }
    public void imprimirLista(){
         if(!listaVacia()){
             nodolista  tmp=primero;
             while(tmp!=null){
                 System.out.println(tmp.getInformacion()+"=>");
                 tmp=tmp.getSiguiente();
             }
         }
    }
    public void mostrarInicioFin(){
        if(!listaVacia()){
            String datos="";
            nodolista  tmp=primero;
            while(tmp!=null){
                datos=datos+" [ "+tmp.getInformacion()+"] =<";
                tmp=tmp.getSiguiente();
            }
            JOptionPane.showMessageDialog(null,datos);
        }
    }
}
