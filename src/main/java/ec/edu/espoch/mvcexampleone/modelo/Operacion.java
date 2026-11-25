
package ec.edu.espoch.mvcexampleone.modelo;


public class Operacion {
    private float numUno;
    private float numDos;

    public Operacion() {
    }

    public Operacion(float numUno, float numDos) {
        this.numUno = numUno;
        this.numDos = numDos;
    }

    public float getNumUno() {
        return numUno;
    }

    public void setNumUno(float numUno) {
        this.numUno = numUno;
    }

    public float getNumDos() {
        return numDos;
    }

    public void setNumDos(float numDos) {
        this.numDos = numDos;
    }
    
    
}
