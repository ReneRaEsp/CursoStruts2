package com.ramesptop.model;

public class Cuenta {
    private String propientario;
    private int numeroDeCuenta;
    private int saldo;

    public String getPropientario() {
        return propientario;
    }

    public void setPropientario(String propientario) {
        this.propientario = propientario;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "propientario= " + propientario + ", numeroDeCuenta= " + numeroDeCuenta + ", saldo= " + saldo + '}';
    }
    
    
}
