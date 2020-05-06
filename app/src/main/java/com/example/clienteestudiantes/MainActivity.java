package com.example.clienteestudiantes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.clienteestudiantes.cliente.ClienteEstudianteImpl;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.listViewEstudiantes)
    public ListView listViewEstudiantes;

    ClienteEstudianteImpl clienteEstudiante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        clienteEstudiante = new ClienteEstudianteImpl(this);
    }

    public void listar(View view) {
       clienteEstudiante.obtenerEstudiantes(listViewEstudiantes);
    }
}
