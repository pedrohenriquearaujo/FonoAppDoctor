package com.example.unicap.fono;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Toast;

import com.example.unicap.model.Paciente;

import java.util.ArrayList;
import java.util.List;

public class PacienteAdapter extends ArrayAdapter<Paciente> {


    private Context context;
    private List<Paciente> listPaciente;


    public PacienteAdapter(@NonNull Context context, ArrayList<Paciente> listPaciente) {
        super(context, 0, listPaciente);
        this.context = context;
        this.listPaciente = listPaciente;
    }

    @Override
    public View getView(final int position, final View convertView, ViewGroup parent) {
        View listItem = convertView;
        if (listItem == null)
            listItem = LayoutInflater.from(context).inflate(R.layout.lista_itens_paciente, parent, false);

        final Paciente posicaoPaciente = listPaciente.get(position);

        Button btnAtividade = listItem.findViewById(R.id.bt_paciente);
        btnAtividade.setText(posicaoPaciente.getNome());

        btnAtividade.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(context.getApplicationContext(),AtividadesActivity.class);

                i.putExtra("itemSelecionadoTitulo", listPaciente.get(position).getNome());
                Toast.makeText(context, listPaciente.get(position).getNome(), Toast.LENGTH_LONG).show();

                context.startActivity(i);
            }
        });

        return listItem;
    }

}
