package com.example.unicap.fono;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.unicap.model.Paciente;

import java.util.ArrayList;

public class PacientesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pacientes);

        ListView listView;


        listView = findViewById(R.id.listViewPaciente);

        listView.setAdapter(new PacienteAdapter(this,carregarPacientes()));





    }



    public ArrayList<Paciente> carregarPacientes(){
        ArrayList<Paciente> listPacientes = new ArrayList<>();
        Paciente pedro, avelino, pitt, matheus;

        pedro = new Paciente( "Pedro", 24, "M", "Paciente");
        avelino = new Paciente("Avelino",20,"M","Paciente");
        pitt =  new Paciente("Lucas Pitt",26,"M","Paciente");
        matheus  = new Paciente("Matheus",24,"M","Paciente");


        listPacientes.add(pedro);
        listPacientes.add(avelino);
        listPacientes.add(pitt);
        listPacientes.add(matheus);



        return listPacientes;


    }

}
