
package model;
/**
 * Esta clase representa una subclase de la clase padre RecursoAgencia 
 * 
 * @author ariel ramirez
 */

public class Transporte extends RecursoAgencia implements Registrable {
    
    private String tipoAuto;
    /**
     * 
     * @param tipoAuto representa el tipo de vehiculo que participara en los tours.
     * @param nombreRecurso representa el nombre de la empresa de transporte.
     */

    public Transporte( String tipoAuto, String nombreRecurso) {
        super(nombreRecurso);
        
        this.tipoAuto = tipoAuto;
    }

   
    

    public String getTipoAuto() {
        return tipoAuto;
    }

    public void setTipoAuto(String tipoAuto) {
        this.tipoAuto = tipoAuto;
    }
//metodo del interface, nos indica que la instancia se creo con exito.
    @Override
    public String registrar() {
       return "transporte registrado con exito";
    }
//metodo del interface, nos muestra la informacion de la instancia creada.
    @Override
    public String mostrarResumen() {
        return "\nnombre del transporte: "+getNombreRecurso() + "\ntipo de auto: " + tipoAuto;
    }
    
    

   
    
}
