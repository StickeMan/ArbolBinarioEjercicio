
import javax.swing.JOptionPane;

/**
 * @author Francisco Delgado Martínez.
 *
 */
public class ArbolBinario {

    //Creacion de la raiz del arbol.
    NodoArbol Raiz;

    //Get y Set.
    public NodoArbol getRaiz() {
        return Raiz;
    }

    public void setRaiz(NodoArbol Raiz) {
        this.Raiz = Raiz;
    }

    //Método para insertar un nodo en el árbol.
    public void agregarNodo(String apellidoP, String apellidoM, String nombre, String clave, int horas) {
        NodoArbol n = new NodoArbol();

        n.setApellidoP(apellidoP);
        n.setApellidoM(apellidoM);
        n.setNombre(nombre);
        n.setClave(clave);
        n.setHoras(horas);

        if (Raiz == null) {
            Raiz = n;
        } else {
            NodoArbol Aux = Raiz;
            while (true) {
                if (n.equals(Aux.getApellidoP())) {
                    if (Aux.getHijoIzq() == null) {
                        Aux.setHijoIzq(n);
                        break;
                    } else {
                        Aux = Aux.getHijoIzq();
                    }
                } else if (Aux.getHijoDer() == null) {
                    Aux.setHijoDer(n);
                    break;
                } else {
                    Aux = Aux.getHijoDer();
                }
            }
        }
    }

    //Método para imprimer los datos del profesor en preorden.
    public String Preorden(NodoArbol padre) {
        if (padre == null) {
            return "";
        } else {
            return padre.toString() + "\n"
                    + Preorden(padre.getHijoIzq())
                    + Preorden(padre.getHijoDer());
        }
    }

    //Metodo para buscar a un profesor por medio de su clave.
    public int Buscar(NodoArbol padre, String ClaveBuscar, int encontrado) {
        if (padre == null) {
            return encontrado;
        } else {
            if (ClaveBuscar.equals(padre.getClave())) {
                JOptionPane.showMessageDialog(null, "Profesor encontrado: " + ClaveBuscar);
                return encontrado + 1;
            }
            encontrado = Buscar(padre.getHijoIzq(), ClaveBuscar, encontrado);
            encontrado = Buscar(padre.getHijoDer(), ClaveBuscar, encontrado);
            
            JOptionPane.showMessageDialog(null, "No se encuentra el profesor.");
            return encontrado;
        }
    }

    Object Buscar(NodoArbol raiz, String clave, Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
