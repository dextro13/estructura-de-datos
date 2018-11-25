package Proyecto_Final;

public class ArbolBinario {
    
    protected NodoArbol raiz;
    int cant;
    int altura;
   

    public ArbolBinario() {
        raiz=null;
    }
            
    public void insertar (int info) {
        if (!existe(info)) {
            NodoArbol nuevo;
            nuevo = new NodoArbol (info);
            if (raiz == null)
                raiz = nuevo;
            else {
                NodoArbol anterior = null, reco;
                reco = raiz;
                while (reco != null)  {
                    anterior = reco;
                    if (info < reco.dato)
                        reco = reco.izquierdo;
                    else
                        reco = reco.derecho;
                }
                if (info < anterior.dato)
                    anterior.izquierdo = nuevo;
                else
                    anterior.derecho = nuevo;
            }
        }else{
            System.out.println("El dato " + info + " ya existe en el arbol");
        }    
    
}

    void insertar() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    void imprimirEntre() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    void imprimirEntreConNivel() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    boolean retornarAltura() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    String cantidad() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    String cantidadNodosHoja() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    void mayorValorl() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    void borrarMenor() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    private boolean existe(int info) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}

