package com.example.juluna.cargarutaweb.Activies;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.juluna.cargarutaweb.Models.Banco;
import com.example.juluna.cargarutaweb.Models.Medio_Pago;
import com.example.juluna.cargarutaweb.R;
import com.getbase.floatingactionbutton.FloatingActionButton;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class medio_pago extends AppCompatActivity {

    private float totalPago;
    private TextView txtTotalPago;
    private TextView txtTotalFaltante;
    private Spinner cmbBanco ;
    private Spinner cmbMedios ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medio_pago);

        txtTotalPago = (TextView) findViewById(R.id.txtTotalAPagar);
        txtTotalFaltante = (TextView) findViewById(R.id.txtTotalPendiente);

        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();

        totalPago = bundle.getFloat("totalRequerimientos");

        txtTotalPago.setText(String.valueOf(totalPago));
        txtTotalFaltante.setText(String.valueOf(totalPago));

        FloatingActionButton btnAgregarMedioPago = (FloatingActionButton) findViewById(R.id.btnAgregarMedioPago);


        btnAgregarMedioPago.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    alerta("Titulo","Hola");
            }
        });

    }

    private void alerta(String titulo, String mensaje)
    {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        if (titulo != null)
        {
            //builder.setTitle(titulo);
        }

        if (mensaje != null)
        {
           // builder.setMessage(mensaje);
        }

        View view = LayoutInflater.from(this).inflate(R.layout.dialogo_medio_pago, null);
        builder.setView(view);

        final EditText input = (EditText) view.findViewById(R.id.txtResultado);

        ArrayList<Banco> bancos = new ArrayList<>();

        bancos.add(( new Banco(1, "Banco PROMERICA")));
        bancos.add(( new Banco(2, "Banco Industrial")));
        bancos.add(( new Banco(3, "Banco GyT Continental")));
        bancos.add(( new Banco(4, "BAC")));

        ArrayList<Medio_Pago> medios = new ArrayList<>();

        medios.add(new Medio_Pago("EFE","Efectivo"));
        medios.add(new Medio_Pago("CHQ","Cheque"));
        medios.add(new Medio_Pago("EIV","Exención de IVA"));

        ArrayAdapter<Banco> bancoAdapter = new ArrayAdapter<Banco>(this, R.layout.support_simple_spinner_dropdown_item, bancos);
        ArrayAdapter<Medio_Pago> medioAdapter = new ArrayAdapter<Medio_Pago>(this, R.layout.support_simple_spinner_dropdown_item, medios);

        final Spinner cmbBanco = (Spinner) view.findViewById(R.id.cmbBanco);
        Spinner cmbMedios = (Spinner) view.findViewById(R.id.cmbMedioPago);
        final EditText txtNoDoc = (EditText) view.findViewById(R.id.txtNoDocumento);


        cmbBanco.setAdapter(bancoAdapter);
        cmbMedios.setAdapter(medioAdapter);

        cmbMedios.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                Medio_Pago medio = (Medio_Pago) adapterView .getSelectedItem();

                switch (medio.getCodigo())
                {
                    case "EFE":
                        cmbBanco.setEnabled(false);
                        txtNoDoc.setEnabled(false);

                        break;
                    case "CHQ":
                        cmbBanco.setEnabled(true);
                        txtNoDoc.setEnabled(true);
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


//        builder.setPositiveButton("Agregar", new DialogInterface.OnClickListener() {
//            public void onClick(DialogInterface dialog, int which) {
//
//
//            }
//        });


        builder.create().show();
    }

    private void createNewBoard(String boardName) {
    }
}
