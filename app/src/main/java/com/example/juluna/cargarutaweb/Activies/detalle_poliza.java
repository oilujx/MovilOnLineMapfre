package com.example.juluna.cargarutaweb.Activies;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.juluna.cargarutaweb.Models.Ruta;
import com.example.juluna.cargarutaweb.R;
import com.example.juluna.cargarutaweb.adapters.AdaptadorDetallePoliza;
import com.example.juluna.cargarutaweb.adapters.AdaptadorRuta;

import java.util.ArrayList;
import java.util.List;

public class detalle_poliza extends AppCompatActivity {

    private ListView listView;
    private TextView txtValorSeleccionado;
    private float TotalSuma = 0;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_poliza);
       context = this;

        listView = (ListView) findViewById(R.id.lstRequerimientos);
        txtValorSeleccionado = (TextView) findViewById(R.id.lblTotalSeleccionado);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.btnCobrar);



        Ruta ruta = (Ruta)getIntent().getSerializableExtra("extraRuta");

        List<Ruta> listadoRutas = new ArrayList<>();

        listadoRutas.add(ruta);
        listadoRutas.add(ruta);
        listadoRutas.add(ruta);
        listadoRutas.add(ruta);
        listadoRutas.add(ruta);
        listadoRutas.add(ruta);


        AdaptadorDetallePoliza adaptadorRuta = new AdaptadorDetallePoliza(getApplicationContext(), R.layout.requerimiento, listadoRutas);
        listView.setAdapter(adaptadorRuta);

        listView.setItemsCanFocus(true);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Ruta item = (Ruta) adapterView.getItemAtPosition(i);

                AdaptadorDetallePoliza.ViewHolder holder = (AdaptadorDetallePoliza.ViewHolder) view.getTag();

                CheckBox chk = holder.chkRequerimiento;

                if (chk.isChecked())
                {
                    chk.setChecked(false);
                    TotalSuma -= Float.parseFloat(item.getTotaReci());
                    txtValorSeleccionado.setText(String.valueOf(TotalSuma));
                }
                else {

                    chk.setChecked(true);
                    TotalSuma += Float.parseFloat(item.getTotaReci());
                    txtValorSeleccionado.setText(String.valueOf(TotalSuma));
                }
            }
        });


        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context, medio_pago.class);
                intent.putExtra("totalRequerimientos", TotalSuma);
                startActivity(intent);

            }
        });



    }
}
