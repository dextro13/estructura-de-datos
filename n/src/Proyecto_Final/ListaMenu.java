package Proyecto_Final;

import javax.swing.JOptionPane;
public class ListaMenu {
     public String listas;
    
    public void menu(){
        Listas listita = new Listas();
        int opcion = 0;
        int dato = 0;
        do{
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog("Menu Listas"
                    + "\n1. Agregar al Inicio"
                    + "\n2. imprimir lista"
                    + "\n3. Mostrar lista de Inicio a Fin"
                    + "\n4. Eliminar el primer elemento"
                    + "\n5. imprimir nodo"
                    + "\n6.  lista vacia"    
                    + "\n7. Volver a Menu Principal"));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ingreso un valor invalido: " +e.getMessage());
            }
            
            switch(opcion){
                case 1:
                    dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento del nodo: "));
                    listita.Insertar( dato);
                    Listas objListas = new Listas();
                    objListas.Insertar( dato);
                    break;
                case 2:
                   
                    listita.imprimirLista();
                   
                    break;
                case 3:
                      if (!listita.listaVacia()) {
                        listita.mostrarInicioFin();
                        } else {
                        JOptionPane.showMessageDialog(null, "No existen nodos aun");
                        }

                    break;
                case 4:
                    listita.imprimirNodo(dato);
                    
                    break;
                case 5:
                    listita.eliminarPrimero();
                    
                    break;
                case 6:
                    
                    
                    break;    
                case 7:
                    JOptionPane.showMessageDialog(null, "Usted selecciono volver.");
                    ProyectoFinal objPrincipal = new ProyectoFinal();
                    objPrincipal.menu();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ingreso una opcion que no esta en el menu.");
                    break;
            }
            
        }while(opcion != 6);
    }
    
    public void insertarDatoAlInicio(){
            
    }
}
