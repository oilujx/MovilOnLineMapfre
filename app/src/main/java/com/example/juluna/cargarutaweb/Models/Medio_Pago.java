package com.example.juluna.cargarutaweb.Models;

/**
 * Created by JULUNA on 11/10/2017.
 */

public class Medio_Pago {

    private String codigo;
    private String descripcion;

    public Medio_Pago(String codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    //to display object as a string in spinner
    @Override
    public String toString() {
        return descripcion;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Medio_Pago){
            Medio_Pago c = (Medio_Pago )obj;
            if(c.getDescripcion().equals(descripcion) && c.getCodigo()==codigo ) return true;
        }

        return false;
    }
}
