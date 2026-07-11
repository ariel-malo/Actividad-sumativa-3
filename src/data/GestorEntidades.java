
package data;

import java.util.ArrayList;
import java.util.List;
import model.ColaboradorExterno;
import model.GuiaTuristico;
import model.RecursoAgencia;
import model.Registrable;
import model.Transporte;


/**
 * Esta clase representa la gestion de las clase, con diversos
 * metodos con diferentes funciones.
 * 
 * 
 * @author ariel ramirez
 */
public class GestorEntidades {
    //se crea un arraylist de la clase RecursoAgencia
    List<RecursoAgencia> entidades;
    
    public GestorEntidades(){
        //se crea la instancia del arraylist
        entidades=new ArrayList<>();
    }
    //metodo que recibe el parametro de la clase RecursoAgencia y agrega un usuario
    public void agregarUsuario(RecursoAgencia usuario){
        entidades.add(usuario);
    }
    //metodo que devuelve los datos 
    public String mostrarDatos(){
        if(entidades.isEmpty()){
            return "no hay datos registrados";
        }
        String datos= "";
        for(RecursoAgencia u: entidades){
            if(u instanceof ColaboradorExterno){
                ColaboradorExterno colaborador= (ColaboradorExterno) u;
                datos += "\nel instanceof dice que este es un colaborador externo de la empresa"; 
                datos += colaborador.mostrarResumen();
            }else if(u instanceof GuiaTuristico){
              GuiaTuristico guia=(GuiaTuristico) u;
              datos+= "\nel instanceof dice que este es un guia turistico de la empresa";
              datos+= guia.mostrarResumen();
            }else if(u instanceof Transporte){
                Transporte transporte=(Transporte) u;
                datos+= "\nel instance of dice que este es un tipo de transporte";
                datos+= transporte.mostrarResumen();
            } 
            datos+="\n---------------------------------";
        }
        return datos;
    }
    
    
    
}
