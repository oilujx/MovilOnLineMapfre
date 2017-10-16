package com.example.juluna.cargarutaweb.Activies;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.juluna.cargarutaweb.Models.DatosRuta;
import com.example.juluna.cargarutaweb.Models.Ruta;
import com.example.juluna.cargarutaweb.R;
import com.example.juluna.cargarutaweb.adapters.AdaptadorRuta;
import com.example.juluna.cargarutaweb.globales.MyApplication;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    Context context;
    private ListView listView;
    DatosRuta generalInfoObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listview);

//        float valorSuma = ((MyApplication) this.getApplication()).getValorSuma();
//
//        if (valorSuma == 0){
//
//            ((MyApplication) this.getApplication()).setSomeVariable(0);
//        }


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    Ruta item = (Ruta) adapterView.getItemAtPosition(i);

                    Intent intent = new Intent(context, detalle_poliza.class);

                    intent.putExtra("extraRuta", item);

                    startActivity(intent);

                }
            }

        );

        context = this;

        new JsonTask().execute();
//        CobroMovilService servicio = API.getApi().create(CobroMovilService.class);
//
//        //String json = "";
//
//        //String sBase64toSend = Base64.encodeToString(json.toString().getBytes(), Base64.DEFAULT);
//
//        Call<DatosRuta> datoCall = servicio.obtenerRuta("hola");
//
//        datoCall.enqueue(new Callback<DatosRuta>() {
//            @Override
//            public void onResponse(Call<DatosRuta> call, Response<DatosRuta> response) {
//
//                DatosRuta ruta = response.body();
//            }
//
//            @Override
//            public void onFailure(Call<DatosRuta> call, Throwable t) {
//
//            }
//        });
    }

    public class JsonTask extends AsyncTask<URL, Void, String> {

        @Override
        protected String doInBackground(URL... urls) {
            HttpURLConnection con = null;
            String resultado = null;

            try {

                URL urlToRequest = new URL("http://app2.mapfre.com.gt/WSJson/CobroMovil.svc/Ruta?datos=e3Npc3RlbWE6IDEsIHJ1dGE6MiwgZmVjaGE6ICcwNC8xMC8yMDE3JywgcmVxdWVyaW1pZW50bzogMH0=");

                // Establecer la conexión
                con = (HttpURLConnection)urlToRequest.openConnection();
                con.setConnectTimeout(15000);
                con.setReadTimeout(10000);
                con.connect();

                StringBuilder sb = new StringBuilder();
                BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String line;

                while ((line = br.readLine()) != null) {
                    sb.append(line).append("\n");//
                }

                resultado = sb.toString();

            } catch (Throwable e) {
                e.printStackTrace();

            }finally {
                con.disconnect();
            }

            return resultado;
        }

        @Override
        protected void onPostExecute(String respuesta) {

            String resp = "{ 'Requerimiento' : [{'Codigo' : '0','Descripcion' : 'OK','CdgoPais' : '502','NumeReci' : '118960358','NumeCuot' : '4','MaxiCuot' : '10','CdgoRamo' : '18','NumePoli' : '5403','NumeCert' : '1','FechInic' : '2017-05-29','FechVenc' : '2018-05-29','FechEmis' : '2017-05-31','FechLimi' : '2017-09-10','FechCobr' : '2017-10-04','CdgoReca' : '2','NombAseg' : 'LORENA NICTE RIVERA SANDOVAL','DirCobro' : '15 AVENIDA 9-52 COLONIA LOMAS DE COTIO, ZONA 3 MIXCO, GUATEMALA -- VISITA AL CLIENTE \\n cobrar en :15 AVENIDA 9-52 COLONIA LOMAS DE COTIO, ZONA 3 MIXCO, GUATEMALA','CdgoProd' : '900000','CdgoMone' : 'Q','MntoPrma' : '237.5','Recargos' : '35.63','Descuentos' : '0','Bomberos' : '0','MntoDiva' : '32.78','TotaReci' : '305.9','StatReci' : '1','TipoFact' : 'F','Nit' : '9722084','Numedoc2' : 'AUOL','Anticipado' : '0','Numefact' : '18960358','Serieauto' : 'REQ','indcontributiva' : 'N','tipogestion' : '106'}, {'Codigo' : '0','Descripcion' : 'OK','CdgoPais' : '502','NumeReci' : '118960359','NumeCuot' : '5','MaxiCuot' : '10','CdgoRamo' : '18','NumePoli' : '5403','NumeCert' : '1','FechInic' : '2017-05-29','FechVenc' : '2018-05-29','FechEmis' : '2017-05-31','FechLimi' : '2017-10-10','FechCobr' : '2017-10-04','CdgoReca' : '2','NombAseg' : 'LORENA NICTE RIVERA SANDOVAL','DirCobro' : '15 AVENIDA 9-52 COLONIA LOMAS DE COTIO, ZONA 3 MIXCO, GUATEMALA -- VISITA AL CLIENTE \\n cobrar en :15 AVENIDA 9-52 COLONIA LOMAS DE COTIO, ZONA 3 MIXCO, GUATEMALA','CdgoProd' : '900000','CdgoMone' : 'Q','MntoPrma' : '237.5','Recargos' : '35.63','Descuentos' : '0','Bomberos' : '0','MntoDiva' : '32.78','TotaReci' : '305.9','StatReci' : '1','TipoFact' : 'F','Nit' : '9722084','Numedoc2' : 'AUOL','Anticipado' : '0','Numefact' : '18960359','Serieauto' : 'REQ','indcontributiva' : 'N','tipogestion' : '106'}, {'Codigo' : '0','Descripcion' : 'OK','CdgoPais' : '502','NumeReci' : '119135110','NumeCuot' : '5','MaxiCuot' : '8','CdgoRamo' : '18','NumePoli' : '50753','NumeCert' : '1','FechInic' : '2017-06-11','FechVenc' : '2018-06-11','FechEmis' : '2017-06-13','FechLimi' : '2017-10-23','FechCobr' : '2017-10-04','CdgoReca' : '2','NombAseg' : 'LUZ ELENA CASTAÑEDA CERNA DE GONZALEZ','DirCobro' : '18 CALLE 13-08 CASA NO. 9 CONDOMINIO MALLORCA, ZONA 7 MIXCO, GUATEMALA -- Favor pasar por el pago, sin falta, muchas gracias. confirmo asegurada que la direccion de cobro es en el trabajo, la cual no la brindo.  favor tomar en cuenta ','CdgoProd' : '002104','CdgoMone' : 'Q','MntoPrma' : '304.75','Recargos' : '39.62','Descuentos' : '0','Bomberos' : '0','MntoDiva' : '41.32','TotaReci' : '385.69','StatReci' : '1','TipoFact' : 'F','Nit' : '15837521','Numedoc2' : 'AUOL','Anticipado' : '0','Numefact' : '19135110','Serieauto' : 'REQ','indcontributiva' : 'N','tipogestion' : '006'}, {'Codigo' : '0','Descripcion' : 'OK','CdgoPais' : '502','NumeReci' : '119143549','NumeCuot' : '4','MaxiCuot' : '6','CdgoRamo' : '18','NumePoli' : '30214','NumeCert' : '1','FechInic' : '2017-06-18','FechVenc' : '2018-06-18','FechEmis' : '2017-06-16','FechLimi' : '2017-09-18','FechCobr' : '2017-10-04','CdgoReca' : '2','NombAseg' : 'ROBERTO MAURICIO VIDES DOMINGUEZ','DirCobro' : 'AVENIDA SIMEÓN CAÑAS 8-91  ZONA 2 GUATEMALA, GUATEMALA -- LUISA MENDOZA CONFIRMO PAGO, POR FAVOR PASAR SIN FALTA cobrar en :AVENIDA SIMEÓN CAÑAS 8-91  ZONA 2 GUATEMALA, GUATEMALA','CdgoProd' : '001050','CdgoMone' : 'Q','MntoPrma' : '440.5','Recargos' : '48.46','Descuentos' : '0','Bomberos' : '0','MntoDiva' : '58.67','TotaReci' : '547.63','StatReci' : '1','TipoFact' : 'F','Nit' : '2301415','Numedoc2' : 'AUOL','Anticipado' : '0','Numefact' : '19143549','Serieauto' : 'REQ','indcontributiva' : 'N','tipogestion' : '006'}, {'Codigo' : '0','Descripcion' : 'OK','CdgoPais' : '502','NumeReci' : '119185361','NumeCuot' : '4','MaxiCuot' : '6','CdgoRamo' : '18','NumePoli' : '6813','NumeCert' : '1','FechInic' : '2017-06-16','FechVenc' : '2018-06-16','FechEmis' : '2017-06-20','FechLimi' : '2017-09-30','FechCobr' : '2017-10-04','CdgoReca' : '2','NombAseg' : 'RICARDO FRANCISCO CHAVEZ PEREZ','DirCobro' : '28 CALLE \\'A\\' Y 19 AVENIDA LOTE 19 FINCA SAN RAFAEL ZONA 6 GUATEMALA, GUATEMALA -- se hablo con el cliente quien informo que el dia miercoles se pase a recoger el cheque sin falta despues de la 1:00','CdgoProd' : '900000','CdgoMone' : 'Q','MntoPrma' : '565.69','Recargos' : '62.23','Descuentos' : '0','Bomberos' : '0','MntoDiva' : '75.35','TotaReci' : '703.27','StatReci' : '1','TipoFact' : 'F','Nit' : '1020587','Numedoc2' : 'AUOL','Anticipado' : '0','Numefact' : '19185361','Serieauto' : 'REQ','indcontributiva' : 'N','tipogestion' : '006'}, {'Codigo' : '0','Descripcion' : 'OK','CdgoPais' : '502','NumeReci' : '119518925','NumeCuot' : '2','MaxiCuot' : '6','CdgoRamo' : '18','NumePoli' : '24026','NumeCert' : '1','FechInic' : '2017-08-29','FechVenc' : '2018-08-29','FechEmis' : '2017-07-07','FechLimi' : '2017-09-29','FechCobr' : '2017-10-04','CdgoReca' : '2','NombAseg' : 'HUGO GONZALEZ GRIJALVA','DirCobro' : '12 CALLE 12-64 COL. SAN JOSE LAS ROSAS SECTOR 2, ZONA 6 MIXCO, GUATEMALA -- VISITA AL CLIENTE 58332924 cobrar en :12 CALLE 12-64 COL. SAN JOSE LAS ROSAS SECTOR 2, ZONA 6 MIXCO, GUATEMALA','CdgoProd' : '002148','CdgoMone' : 'Q','MntoPrma' : '456.17','Recargos' : '50.18','Descuentos' : '0','Bomberos' : '0','MntoDiva' : '60.76','TotaReci' : '567.11','StatReci' : '1','TipoFact' : 'F','Nit' : '93904711','Numedoc2' : 'AUOL','Anticipado' : '0','Numefact' : '19518925','Serieauto' : 'REQ','indcontributiva' : 'N','tipogestion' : '106'}, {'Codigo' : '0','Descripcion' : 'OK','CdgoPais' : '502','NumeReci' : '119636837','NumeCuot' : '4','MaxiCuot' : '12','CdgoRamo' : '18','NumePoli' : '30056','NumeCert' : '1','FechInic' : '2017-07-07','FechVenc' : '2018-07-07','FechEmis' : '2017-07-14','FechLimi' : '2017-10-24','FechCobr' : '2017-10-04','CdgoReca' : '2','NombAseg' : 'HILDER HAMILTON GRAMAJO CIFUENTES','DirCobro' : '5A. AVENIDA B 8-29 COLONIA NUEVA MONTSERRAT ZONA 3 MIXCO, GUATEMALA -- CONFIRMO PAGO BARBARA MEDINA 59400201 cobrar en :5A. AVENIDA B 8-29 COLONIA NUEVA MONTSERRAT ZONA 3 MIXCO, GUATEMALA','CdgoProd' : '900000','CdgoMone' : 'Q','MntoPrma' : '74.61','Recargos' : '13.78','Descuentos' : '0','Bomberos' : '0','MntoDiva' : '10.61','TotaReci' : '99','StatReci' : '1','TipoFact' : 'F','Nit' : '15964469','Numedoc2' : 'AUOL','Anticipado' : '0','Numefact' : '19636837','Serieauto' : 'REQ','indcontributiva' : 'N','tipogestion' : '006'} ] }";

            Gson gson = new Gson();

            generalInfoObject = gson.fromJson(resp, DatosRuta.class);

            AdaptadorRuta adaptadorRuta = new AdaptadorRuta(getApplicationContext(), R.layout.vista_ruta, generalInfoObject);
            listView.setAdapter(adaptadorRuta);
        }
    }


}
