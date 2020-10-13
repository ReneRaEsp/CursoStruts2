package com.ramesptop.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.ramesptop.model.Persona;

public class PersonasAction extends ActionSupport{
    
    private Persona persona;
    
    @Override
    public String execute(){
        if(this.persona != null){
            return SUCCESS;
        }
        else{
            return INPUT;
        }
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    
}
