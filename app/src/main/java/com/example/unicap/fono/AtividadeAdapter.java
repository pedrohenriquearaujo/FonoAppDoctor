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

import com.example.unicap.model.Atividade;
import com.example.unicap.model.Licoes;

import java.util.ArrayList;
import java.util.List;

public class AtividadeAdapter extends ArrayAdapter<Atividade> {

    private Context context;
    private List<Atividade> listLicao;

    public AtividadeAdapter(@NonNull Context context, ArrayList<Atividade> listLicao) {
        super(context, 0, listLicao);
        this.context = context;
        this.listLicao = listLicao;
    }

    @Override
    public View getView(final int position, final View convertView, ViewGroup parent) {
        View listItem = convertView;
        if (listItem == null)
            listItem = LayoutInflater.from(context).inflate(R.layout.lista_itens_licoes, parent, false);

        final Atividade posicaoPaciente = listLicao.get(position);

        Button btnAtividade = listItem.findViewById(R.id.bt_licao);
        btnAtividade.setText(posicaoPaciente.getDescricao());

        btnAtividade.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context.getApplicationContext(),DetalhesActivity.class));
                Toast.makeText(context, "Play chupetinha", Toast.LENGTH_LONG).show();
            }
        });

        return listItem;
    }
}
