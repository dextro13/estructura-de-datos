
package Proyecto_Final;

import javax.swing.JOptionPane;
public class MenuCola {
     public String listas;
    
    public void menu(){
        Colas col = new Colas();
        int opcion = 0;
        int dato = 0;
        do{
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog("Menu Listas"
                    + "\n1. Agregar al Inicio"
                    + "\n2. cola vacia"
                    + "\n3. Mostrar frente de la cola"
                    + "\n4. Eliminar cola"
                    + "\n5. limpiar la "
                    + "\n6.  lista vacia"    
                    + "\n7. Volver a Menu Principal"));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ingreso un valor invalido: " +e.getMessage());
            }
            
            switch(opcion){
                case 1:
                    dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento del nodo: "));
                    col.insertarCola( dato);
                    Colas objListas = new Colas();
                    objListas.insertarCola( dato);
                    break;
                case 2:
                   
                    col.colaVacia();
                   
                    break;
                case 3:
                     col.frenteCola();
                    break;
                case 4:
                   
                    col.frenteCola();
                    break;
                case 5:
                   col.elimnarDato();
                    
                    break;
                case 6:
                    col.limpiarCola();
                    
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
}    
    
   
