package com.example.juluna.cargarutaweb.API.APIServices;

import com.example.juluna.cargarutaweb.Models.DatosRuta;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by JULUNA on 04/10/2017.
 */

public interface CobroMovilService {

    @GET("Ruta")
    Call<DatosRuta> obtenerRuta(@Query("datos") String city);
}
