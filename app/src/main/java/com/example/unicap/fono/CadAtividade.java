package com.example.unicap.fono;

import android.app.AppComponentFactory;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.unicap.model.Licoes;

import java.util.ArrayList;

public class CadAtividade extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_cad_atividade);

        // TextView t = findViewById (R.id.nomePaciente);
        //Button button = findViewById (R.id.bt_add_licao);

        Button button = findViewById (R.id.bt_add_licao);




        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),LicaoActivity.class); //ir para tela de cadastrar atividade
                i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                getApplicationContext().startActivity(i);
            }
        });



    }


}
