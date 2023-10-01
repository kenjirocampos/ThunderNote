package com.example.thundernote;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rView;
    ItemAdapter itemAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        itemAdapter = new ItemAdapter((this));
        itemAdapter.setData(getData());
        rView = (RecyclerView) findViewById(R.id.rView);
        rView.setAdapter(itemAdapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rView.setLayoutManager(linearLayoutManager);
    }

    private List<Item> getData() {
        List<Item> list = new ArrayList<>();
        list.add(new Item(R.drawable.note_amarillo,"Pie de limon"));
        list.add(new Item(R.drawable.note_azul,"Trucos GTA"));
        list.add(new Item(R.drawable.note_celeste,"Compras"));
        list.add(new Item(R.drawable.note_rojo,"Tips Clases de Violin"));
        list.add(new Item(R.drawable.note_rosa,"Pensamientos bonitos"));
        list.add(new Item(R.drawable.note_verde,"No olvidar"));
        return list;
    }

    public void crearNota(View v){
    Intent cambiar = new Intent(this,AgregarNotaActivity.class);
    startActivity(cambiar);
}
    public void cambiarConfig(View v){
        Intent cambiar = new Intent(this,ConfiguracionActivity.class);
        startActivity(cambiar);
    }

}