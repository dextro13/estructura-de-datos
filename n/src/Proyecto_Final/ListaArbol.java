package Proyecto_Final;

import javax.swing.JOptionPane;

public class ListaArbol {
    public String Arboles;
    public void menu(){
        ListaMenu listita = new ListaMenu();
        int opcion = 0;
        int elemento;
        do{
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog("Menu De Arboles"
                    + "\n1. insertar"
                    + "\n2. insertar"
                    + "\n3. insertar"
                    + "\n4. insertar"
                    + "\n5. Volver a Menu Principal"));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ingreso un valor invalido: " +e.getMessage());
            }
            
            switch(opcion){
                case 1:
                    elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento del nodo "));
                   
                    break;
                case 2:
                    elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento del nodo"));
                   
                    break;
                case 3:
                    
                     elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "mostrar "));
                   
                    break;
                case 4:
                    
                     elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "mostrar"));
                    break;
                case 5:
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
