
package model;
/**
 * Esta clase representa una subclase de RecursoAgencia siendo esta
 * un colaborador externo de la empresa de Llanquihue tours.
 * @author pc-1
 */

public class ColaboradorExterno extends RecursoAgencia implements Registrable {
    private String empresa;
    /**
     * 
     * @param empresa Este parametro representa el nombre de la empresa quer empresta el servicio.
     * @param nombreRecurso 
     */

    public ColaboradorExterno(String empresa, String nombreRecurso) {
        super(nombreRecurso);
        this.empresa = empresa;
        
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

//metodo abstracto del interface, nos iondica que se registro la instancia con exito.
    @Override
    public String registrar() {
        return "colaborador registrado con exito.";
    }
    //metodo abstracto del interface, nos muestra la informacion de la clase.
    @Override
    public String mostrarResumen(){
        return "\nnombre del colaborador:" +getNombreRecurso() + "\nempresa: " + empresa;
    }
  
   
}
