package com.example.unicap.fono;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.unicap.model.Licoes;

import java.util.ArrayList;

public class AtividadesActivity extends AppCompatActivity {

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_atividades);

       // TextView t = findViewById (R.id.nomePaciente);
        //Button button = findViewById (R.id.bt_add_licao);



        ListView listView;


        listView = findViewById(R.id.list_atividades);

        listView.setAdapter(new LicaoAdapter(this, carregarLicoes()));



        Button button = findViewById (R.id.bt_add_atividade);


        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),CadAtividade.class); //ir para tela de cadastrar atividade
                i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                getApplicationContext().startActivity(i);
            }
        });





    }
    public ArrayList<Licoes> carregarLicoes(){
        ArrayList<Licoes> listLicoes = new ArrayList<>();
        Licoes pedro, avelino, pitt, matheus;

        pedro = new Licoes( "Atividade 1");
        avelino = new Licoes("Atividade 2");
        pitt =  new Licoes("Atividade 3");
        matheus  = new Licoes("Atividade 4");


        listLicoes.add(pedro);
        listLicoes.add(avelino);
        listLicoes.add(pitt);
        listLicoes.add(matheus);



        return listLicoes;


    }


}
