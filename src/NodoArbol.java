
/**
 * @author Francisco Delgado Martínez.
 * */
public class NodoArbol {

    //Declaracion de los atributos a utilizar.
    private NodoArbol hijoIzq, hijoDer;
    private String apellidoP, apellidoM, nombre, clave;
    private int horas;

    //Constructor.
    public NodoArbol(String apellidoP, String apellidoM, String nombre, String clave, int horas) {
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.nombre = nombre;
        this.clave = clave;
        this.horas = horas;
        this.hijoIzq = null;
        this.hijoDer = null;
    }

    //Contructor.
    public NodoArbol() {

    }

    //Getters y Setters.
    public NodoArbol getHijoIzq() {
        return hijoIzq;
    }

    public void setHijoIzq(NodoArbol hijoIzq) {
        this.hijoIzq = hijoIzq;
    }

    public NodoArbol getHijoDer() {
        return hijoDer;
    }

    public void setHijoDer(NodoArbol hijoDer) {
        this.hijoDer = hijoDer;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    //Método que imprime los datos del profesor.
    @Override
    public String toString() {
        return "\n Apellido Paterno: " + apellidoP
                + "\n Apellido Materno: " + apellidoM
                + "\n Nombre: " + nombre
                + "\n Clave del profesor: " + clave
                + "\n Horas semanales: " + horas;

    }
}
