package com.example.juluna.cargarutaweb.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.juluna.cargarutaweb.Models.Ruta;
import com.example.juluna.cargarutaweb.R;

import java.util.List;

/**
 * Created by JULUNA on 09/10/2017.
 */

public class AdaptadorDetallePoliza extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Ruta> requerimientos;

    public AdaptadorDetallePoliza(Context context, int layout, List<Ruta> requerimientos) {
        this.context = context;
        this.layout = layout;
        this.requerimientos = requerimientos;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public int getLayout() {
        return layout;
    }

    public void setLayout(int layout) {
        this.layout = layout;
    }

    public List<Ruta> getRequerimientos() {
        return requerimientos;
    }

    public void setRequerimientos(List<Ruta> requerimientos) {
        this.requerimientos = requerimientos;
    }

    @Override
    public int getCount() {
        return this.requerimientos.size();
    }

    @Override
    public Object getItem(int i) {
        return requerimientos.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {


        ViewHolder holder;

        if (view == null)
        {
            LayoutInflater inflater = LayoutInflater.from(this.context);
            view = inflater.inflate(R.layout.requerimiento, null);

            holder = new ViewHolder();

            holder.lblCuotaRequerimiento = (TextView) view.findViewById(R.id.lblCuotaRequerimiento);
            holder.lblMonedaRequerimiento = (TextView) view.findViewById(R.id.lblMonedaRequerimiento);
            holder.lblRequerimiento = (TextView) view.findViewById(R.id.lblRequerimiento);
            holder.lblTotalRequerimiento = (TextView) view.findViewById(R.id.lblTotalRequerimiento);
            holder.lblVencimientoRequerimiento = (TextView) view.findViewById(R.id.lblVencimientoRequerimiento);
            holder.chkRequerimiento = (CheckBox) view.findViewById(R.id.chkRequerimiento);

            view.setTag(holder);

        }
        else {

            holder = (ViewHolder) view.getTag();
        }

        Ruta item = requerimientos.get(i);


        holder.lblCuotaRequerimiento.setText(item.getNumeCuot() + "/" + item.getMaxiCuot());
        holder.lblMonedaRequerimiento.setText(item.getCdgoMone());
        holder.lblRequerimiento.setText(item.getNumeReci());
        holder.lblTotalRequerimiento.setText(item.getTotaReci());
        holder.lblVencimientoRequerimiento.setText(item.getFechVenc());


        return  view;

    }

    public static class ViewHolder
    {
        private TextView lblRequerimiento;
        private TextView lblVencimientoRequerimiento;
        private TextView lblCuotaRequerimiento;
        private TextView lblMonedaRequerimiento;
        private TextView lblTotalRequerimiento;
        public CheckBox chkRequerimiento;
    }

}
