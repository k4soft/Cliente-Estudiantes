package com.example.clienteestudiantes.cliente;

import com.example.clienteestudiantes.entidad.Estudiante;
import com.example.clienteestudiantes.util.Parametro;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ClienteEstudiante {


    @GET(Parametro.ENDPOINT_LISTADO_ESTUDIANTE)
    Call<List<Estudiante>> obtenerEstudiantes();
}
