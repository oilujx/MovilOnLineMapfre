package com.example.juluna.cargarutaweb.Models;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by JULUNA on 04/10/2017.
 */

public class DatosRuta {

    private List<Ruta> Requerimiento;

    public DatosRuta() {
        super();
    }

    public DatosRuta(List<Ruta> requerimiento) {
        Requerimiento = requerimiento;
    }

    public List<Ruta> getRequerimiento() {
        return Requerimiento;
    }

    public void setRequerimiento(List<Ruta> requerimiento) {
        Requerimiento = requerimiento;
    }
}
