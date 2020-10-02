package com.example.cardviewtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    ArrayList<Contacto> listaContactos;
    RecyclerView recyclerContactos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        listaContactos = new ArrayList<>();
        recyclerContactos = (RecyclerView) findViewById(R.id.Lista);
        recyclerContactos.setLayoutManager(new LinearLayoutManager(this));

        llenarContactos();

        Adaptador adaptador = new Adaptador(listaContactos);
        recyclerContactos.setAdapter(adaptador);

    }

    private void llenarContactos() {
        listaContactos.add(new Contacto("Contacto 1","123456",R.drawable.ic_launcher_background));
        listaContactos.add(new Contacto("Contacto 2","123456",R.drawable.ic_launcher_background));
        listaContactos.add(new Contacto("Contacto 3","123456",R.drawable.ic_launcher_background));

    }
}