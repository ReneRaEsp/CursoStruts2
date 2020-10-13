package beans.actions;

import org.apache.logging.log4j.*;
import org.apache.logging.log4j.Logger;

public class SaludarAction {
    
    Logger log = LogManager.getLogger(SaludarAction.class);
    
    private String saludosAtr;

    public String execute(){
        log.info("ejecutando metodo execute desde struts2");
        this.saludosAtr = "Hola desde struts2 con convenciones";
        return "exito";
    }
    
    public String getSaludosAtr() {
        return saludosAtr;
    }

    public void setSaludosAtr(String saludosAtr) {
        this.saludosAtr = saludosAtr;
    }
    
    
}
