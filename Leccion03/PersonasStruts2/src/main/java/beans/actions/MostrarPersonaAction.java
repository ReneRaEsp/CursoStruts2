package beans.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.*;
import org.apache.logging.log4j.Logger;

public class MostrarPersonaAction extends ActionSupport{
    
    Logger log = LogManager.getLogger(MostrarPersonaAction.class);
    
    private String nombre;

    @Override
    public String execute(){
        log.info("El nombre es: " + this.nombre);
        
        return SUCCESS;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}