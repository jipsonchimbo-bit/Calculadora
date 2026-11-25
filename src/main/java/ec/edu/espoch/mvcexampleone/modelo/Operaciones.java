
package ec.edu.espoch.mvcexampleone.modelo;


public class Operaciones implements InterfazOperacion {
    
    @Override
    public float sumar(Operacion operacion){
        
        return operacion.getNumUno()+operacion.getNumDos();
        
    }
}
