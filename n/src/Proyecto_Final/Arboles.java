
package Proyecto_Final;

public class Arboles {
    
    
    public static void main(String[] args) {
        
     
        ArbolBinario abo = new ArbolBinario ();
        
        abo.insertar (100);
        abo.insertar (50);
        abo.insertar (25);
        abo.insertar (75);
        abo.insertar (150);
        abo.insertar (100);
        System.out.println ("Impresion entreorden: ");
        abo.imprimirEntre ();
        System.out.println ("Cantidad de nodos del árbol:"+abo.cantidad());
        System.out.println ("Cantidad de nodos hoja:"+abo.cantidadNodosHoja());          
        System.out.println ("Impresion en entre orden junto al nivel del nodo.");
        abo.imprimirEntreConNivel();
        System.out.print ("Altura del arbol:");
        System.out.println(abo.retornarAltura());        
        abo.mayorValorl();
        abo.borrarMenor();
        System.out.println("Luego de borrar el menor:");
        abo.imprimirEntre ();
        
    }
    
}
