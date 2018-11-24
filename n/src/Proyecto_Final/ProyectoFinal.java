package Proyecto_Final;
 
import javax.swing.JOptionPane;
public class ProyectoFinal {
    
    public static void main(String[] args) {
        menu();  
    }
    public static void menu(){
        int opcion = 0;
        
        do{
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog("Menu Principal"
                    + "\n1. ordenamientos"
                    + "\n2. Listas "
                    + "\n3. Pilas"
                    + "\n4. Colas"
                    + "\n5. Arboles"
                    + "\n6. Grafos"
                    + "\n7. Salir"));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ingreso un valor invalido: " +e.getMessage());
            }
            
            switch(opcion){
                case 1:
                   
                    break;
                case 2:
                    ListaMenu objListas = new ListaMenu();
                    objListas.menu();
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    
                    break;
                 case 6:
                    
                    
                    break;    
                case 7:
                    JOptionPane.showMessageDialog(null, "Usted selecciono Salir.");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ingreso una opcion que no esta en el menu.");
                    break;
            }
            
        }while(opcion != 7);
    }
 
}
        
