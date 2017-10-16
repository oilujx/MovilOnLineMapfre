package com.example.juluna.cargarutaweb.Models;

/**
 * Created by JULUNA on 11/10/2017.
 */

public class Banco {

    public int codigoBanco;
    public String descripcion;

    public Banco(int codigoBanco, String descripcion) {
        this.codigoBanco = codigoBanco;
        this.descripcion = descripcion;
    }

    public int getCodigoBanco() {
        return codigoBanco;
    }

    public void setCodigoBanco(int codigoBanco) {
        this.codigoBanco = codigoBanco;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString()
    {
        return this.descripcion;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Banco){
            Banco c = (Banco )obj;
            if(c.getDescripcion().equals(descripcion) && c.getCodigoBanco()==codigoBanco ) return true;
        }

        return false;
    }
}
