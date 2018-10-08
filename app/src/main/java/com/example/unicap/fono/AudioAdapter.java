package com.example.unicap.fono;

import android.app.Activity;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.unicap.model.Gravacao;
import com.example.unicap.model.Licoes;
import com.example.unicap.model.Paciente;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class AudioAdapter  extends ArrayAdapter<Licoes> {

    private final Activity context;
    private List<Licoes> gList = new ArrayList<>();

    private String path = Environment.getExternalStorageDirectory() + File.separator;

    public AudioAdapter(Activity context, ArrayList<Licoes> list) {
        super(context, 0, list);
        this.context = context;
        this.gList = list;
    }

    @Override
    public View getView(final int position, final View convertView, ViewGroup parent) {


        View listItem = convertView;
        if(listItem == null)
            listItem = LayoutInflater.from(context).inflate(R.layout.lista_itens_avaliacao,parent,false);

        final Button btnPlay = listItem.findViewById(R.id.buttonPlay);
        final Button btnStop = listItem.findViewById(R.id.buttonStop);
        final Button btnRecord = listItem.findViewById(R.id.buttonRecord);
        btnStop.setEnabled(false);
        btnPlay.setEnabled(false);

        btnRecord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Gravando chupetinha", Toast.LENGTH_LONG).show();
                btnRecord.setEnabled(false);
                btnStop.setEnabled(true);
            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Stop chupetinha", Toast.LENGTH_LONG).show();

                btnRecord.setEnabled(true);
                btnStop.setEnabled(false);
                btnPlay.setEnabled(true);

            }
        });

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Play chupetinha", Toast.LENGTH_LONG).show();

            }
        });

        return listItem;
    }


}
