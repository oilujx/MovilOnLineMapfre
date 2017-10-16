package com.example.juluna.cargarutaweb.globales;

import android.app.Application;

/**
 * Created by JULUNA on 09/10/2017.
 */

public class MyApplication extends Application {

    private float valorSuma;

    public float getValorSuma() {
        return valorSuma;
    }

    public void setSomeVariable(float someVariable) {
        this.valorSuma = someVariable;
    }


}
