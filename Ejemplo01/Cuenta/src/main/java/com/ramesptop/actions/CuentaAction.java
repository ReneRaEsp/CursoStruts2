package com.ramesptop.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.ramesptop.model.Cuenta;

public class CuentaAction extends ActionSupport{
    private Cuenta cuenta;
    
    public String execute(){
        return SUCCESS;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    
}
