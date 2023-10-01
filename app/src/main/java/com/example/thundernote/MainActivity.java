package com.example.thundernote;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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