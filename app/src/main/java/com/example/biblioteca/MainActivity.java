package com.example.biblioteca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login (View v){

        EditText campo1 = this.findViewById(R.id.correo);
        String correo = campo1.getText().toString();
        EditText campo2 = this.findViewById(R.id.contraseña);
        String contraseña = campo2.getText().toString();

        if(correo.equals("c1") && contraseña.equals("123")){
            Intent i = new Intent(this,Principal1.class);
            startActivity(i);
        }else{
            Toast.makeText(this, "Error en las credenciales", Toast.LENGTH_SHORT).show();
        }


    }
}