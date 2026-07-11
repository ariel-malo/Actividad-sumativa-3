
package model;
/**
 * Esta clase representa la clase padre de nuestro sistema
 * donde implementara un parametro que se heredara a cada clase
 * de nuestro sistema.
 * 
 * @author ariel ramirez
 */

public class RecursoAgencia {
    private String nombreRecurso;
/**
 * 
 * @param nombreRecurso representa el nombre del tipo de servicio o cargo dentro de la empresa.
 */
    public RecursoAgencia(String nombreRecurso) {
        this.nombreRecurso = nombreRecurso;
    }

    public String getNombreRecurso() {
        return nombreRecurso;
    }

    public void setNombreRecurso(String nombreRecurso) {
        this.nombreRecurso = nombreRecurso;
    }
    
   
}
