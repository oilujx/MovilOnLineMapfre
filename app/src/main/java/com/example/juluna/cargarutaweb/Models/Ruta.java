package com.example.juluna.cargarutaweb.Models;

import java.io.Serializable;

/**
 * Created by JULUNA on 04/10/2017.
 */

public class Ruta implements Serializable{

    private String Codigo;
    private String Descripcion;
    private String CdgoPais ;
    private String NumeReci ;
    private String NumeCuot ;
    private String MaxiCuot ;
    private String CdgoRamo ;
    private String NumePoli ;
    private String NumeCert ;
    private String FechInic ;
    private String FechVenc ;
    private String FechEmis ;
    private String FechLimi ;
    private String FechCobr ;
    private String CdgoReca ;
    private String NombAseg ;
    private String DirCobro ;
    private String CdgoProd ;
    private String CdgoMone ;
    private String MntoPrma ;
    private String Recargos ;
    private String Descuentos;
    private String Bomberos ;
    private String MntoDiva ;
    private String TotaReci ;
    private String StatReci ;
    private String TipoFact ;
    private String Nit ;
    private String Numedoc2;
    private String Anticipado;
    private String Numefact ;
    private String Serieauto ;
    private String indcontributiva;
    private String tipogestion ;


    public Ruta() {
    }

    public Ruta(String codigo, String descripcion, String cdgoPais, String numeReci, String numeCuot, String maxiCuot, String cdgoRamo, String numePoli, String numeCert, String fechInic, String fechVenc, String fechEmis, String fechLimi, String fechCobr, String cdgoReca, String nombAseg, String dirCobro, String cdgoProd, String cdgoMone, String mntoPrma, String recargos, String descuentos, String bomberos, String mntoDiva, String totaReci, String statReci, String tipoFact, String nit, String numedoc2, String anticipado, String numefact, String serieauto, String indcontributiva, String tipogestion) {
        Codigo = codigo;
        Descripcion = descripcion;
        CdgoPais = cdgoPais;
        NumeReci = numeReci;
        NumeCuot = numeCuot;
        MaxiCuot = maxiCuot;
        CdgoRamo = cdgoRamo;
        NumePoli = numePoli;
        NumeCert = numeCert;
        FechInic = fechInic;
        FechVenc = fechVenc;
        FechEmis = fechEmis;
        FechLimi = fechLimi;
        FechCobr = fechCobr;
        CdgoReca = cdgoReca;
        NombAseg = nombAseg;
        DirCobro = dirCobro;
        CdgoProd = cdgoProd;
        CdgoMone = cdgoMone;
        MntoPrma = mntoPrma;
        Recargos = recargos;
        Descuentos = descuentos;
        Bomberos = bomberos;
        MntoDiva = mntoDiva;
        TotaReci = totaReci;
        StatReci = statReci;
        TipoFact = tipoFact;
        Nit = nit;
        Numedoc2 = numedoc2;
        Anticipado = anticipado;
        Numefact = numefact;
        Serieauto = serieauto;
        this.indcontributiva = indcontributiva;
        this.tipogestion = tipogestion;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getCdgoPais() {
        return CdgoPais;
    }

    public void setCdgoPais(String cdgoPais) {
        CdgoPais = cdgoPais;
    }

    public String getNumeReci() {
        return NumeReci;
    }

    public void setNumeReci(String numeReci) {
        NumeReci = numeReci;
    }

    public String getNumeCuot() {
        return NumeCuot;
    }

    public void setNumeCuot(String numeCuot) {
        NumeCuot = numeCuot;
    }

    public String getMaxiCuot() {
        return MaxiCuot;
    }

    public void setMaxiCuot(String maxiCuot) {
        MaxiCuot = maxiCuot;
    }

    public String getCdgoRamo() {
        return CdgoRamo;
    }

    public void setCdgoRamo(String cdgoRamo) {
        CdgoRamo = cdgoRamo;
    }

    public String getNumePoli() {
        return NumePoli;
    }

    public void setNumePoli(String numePoli) {
        NumePoli = numePoli;
    }

    public String getNumeCert() {
        return NumeCert;
    }

    public void setNumeCert(String numeCert) {
        NumeCert = numeCert;
    }

    public String getFechInic() {
        return FechInic;
    }

    public void setFechInic(String fechInic) {
        FechInic = fechInic;
    }

    public String getFechVenc() {
        return FechVenc;
    }

    public void setFechVenc(String fechVenc) {
        FechVenc = fechVenc;
    }

    public String getFechEmis() {
        return FechEmis;
    }

    public void setFechEmis(String fechEmis) {
        FechEmis = fechEmis;
    }

    public String getFechLimi() {
        return FechLimi;
    }

    public void setFechLimi(String fechLimi) {
        FechLimi = fechLimi;
    }

    public String getFechCobr() {
        return FechCobr;
    }

    public void setFechCobr(String fechCobr) {
        FechCobr = fechCobr;
    }

    public String getCdgoReca() {
        return CdgoReca;
    }

    public void setCdgoReca(String cdgoReca) {
        CdgoReca = cdgoReca;
    }

    public String getNombAseg() {
        return NombAseg;
    }

    public void setNombAseg(String nombAseg) {
        NombAseg = nombAseg;
    }

    public String getDirCobro() {
        return DirCobro;
    }

    public void setDirCobro(String dirCobro) {
        DirCobro = dirCobro;
    }

    public String getCdgoProd() {
        return CdgoProd;
    }

    public void setCdgoProd(String cdgoProd) {
        CdgoProd = cdgoProd;
    }

    public String getCdgoMone() {
        return CdgoMone;
    }

    public void setCdgoMone(String cdgoMone) {
        CdgoMone = cdgoMone;
    }

    public String getMntoPrma() {
        return MntoPrma;
    }

    public void setMntoPrma(String mntoPrma) {
        MntoPrma = mntoPrma;
    }

    public String getRecargos() {
        return Recargos;
    }

    public void setRecargos(String recargos) {
        Recargos = recargos;
    }

    public String getDescuentos() {
        return Descuentos;
    }

    public void setDescuentos(String descuentos) {
        Descuentos = descuentos;
    }

    public String getBomberos() {
        return Bomberos;
    }

    public void setBomberos(String bomberos) {
        Bomberos = bomberos;
    }

    public String getMntoDiva() {
        return MntoDiva;
    }

    public void setMntoDiva(String mntoDiva) {
        MntoDiva = mntoDiva;
    }

    public String getTotaReci() {
        return TotaReci;
    }

    public void setTotaReci(String totaReci) {
        TotaReci = totaReci;
    }

    public String getStatReci() {
        return StatReci;
    }

    public void setStatReci(String statReci) {
        StatReci = statReci;
    }

    public String getTipoFact() {
        return TipoFact;
    }

    public void setTipoFact(String tipoFact) {
        TipoFact = tipoFact;
    }

    public String getNit() {
        return Nit;
    }

    public void setNit(String nit) {
        Nit = nit;
    }

    public String getNumedoc2() {
        return Numedoc2;
    }

    public void setNumedoc2(String numedoc2) {
        Numedoc2 = numedoc2;
    }

    public String getAnticipado() {
        return Anticipado;
    }

    public void setAnticipado(String anticipado) {
        Anticipado = anticipado;
    }

    public String getNumefact() {
        return Numefact;
    }

    public void setNumefact(String numefact) {
        Numefact = numefact;
    }

    public String getSerieauto() {
        return Serieauto;
    }

    public void setSerieauto(String serieauto) {
        Serieauto = serieauto;
    }

    public String getIndcontributiva() {
        return indcontributiva;
    }

    public void setIndcontributiva(String indcontributiva) {
        this.indcontributiva = indcontributiva;
    }

    public String getTipogestion() {
        return tipogestion;
    }

    public void setTipogestion(String tipogestion) {
        this.tipogestion = tipogestion;
    }
}
