
package model;
/**
 * Esta clase representa una subclase de la clase padre 
 * RecursoAgencia que mostrara un empleado de LlanquihueTour
 * 
 * 
 * @author ariel ramirez
 */

public class GuiaTuristico extends RecursoAgencia implements Registrable {
   
    private String idioma;

    /**
     * 
     * @param idioma Este parametro representa el idioma nativo del guia turistico
     * @param nombreRecurso Este es el nombre del guia turistico.
     */
    
    
    public GuiaTuristico(String idioma, String nombreRecurso) {
        super(nombreRecurso);
        
        this.idioma = idioma;
    }

 

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
//metodo del interface que nos indica que la instancia se creo con exito.
    @Override
    public String registrar() {
        return "guia turistico agregado con exito.";
    }
//metodo del interface, nos muestra la informacion de la instancia creada.
    @Override
    public String mostrarResumen() {
        return "\nnombre del guia turistico: "+ getNombreRecurso() + "\nidioma: " + idioma;
    }
    
    

  
    
    
    
    
}
