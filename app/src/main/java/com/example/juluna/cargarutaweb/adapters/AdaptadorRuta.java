package com.example.juluna.cargarutaweb.adapters;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.juluna.cargarutaweb.Models.DatosRuta;
import com.example.juluna.cargarutaweb.Models.Ruta;
import com.example.juluna.cargarutaweb.R;

import java.util.List;

/**
 * Created by JULUNA on 06/10/2017.
 */

public class AdaptadorRuta extends BaseAdapter {

    private Context context;
    private int layout;
    private DatosRuta ruta;

    public AdaptadorRuta(Context context, int layout, DatosRuta ruta) {
        this.context = context;
        this.layout = layout;
        this.ruta = ruta;
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



    @Override
    public int getCount() {
        return ruta.getRequerimiento().size();
    }

    @Override
    public Object getItem(int i) {
        return ruta.getRequerimiento().get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        //View v = view;

        ViewHolder holder;
        if (view == null)
        {

            LayoutInflater inflater = LayoutInflater.from(this.context);
            view = inflater.inflate(R.layout.vista_ruta, null);

            holder = new ViewHolder();

            holder.txtAsegurado = (TextView)view.findViewById(R.id.textViewAsegurado);
            holder.txtDireccion = (TextView)view.findViewById(R.id.textViewDireccion);

            view.setTag(holder);
        }
        else
        {
            holder = (ViewHolder) view.getTag();
        }

        Ruta item = ruta.getRequerimiento().get(i);

        holder.txtAsegurado.setText(item.getNombAseg());
        holder.txtDireccion.setText(item.getDirCobro());

        return  view;
    }

    static class ViewHolder
    {
        private TextView txtAsegurado;
        private TextView txtDireccion;
    }
}
