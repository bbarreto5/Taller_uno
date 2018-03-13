package com.example.android.zapatosapp;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public class Principal extends AppCompatActivity {
    private Spinner sp1,sp2,sp3;
    private EditText cantidad_pedir,total;
    private Resources recursos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        sp1 = findViewById(R.id.sp_sexo);
        sp2 = findViewById(R.id.sp_tipo);
        sp3 = findViewById(R.id.sp_marca);
        cantidad_pedir = findViewById(R.id.et_cantidad);
        total = findViewById(R.id.et_mostrar);
        recursos = this.getResources();
    }

    public void calcular(View v){
        if (validar()){
            int n = sp1.getSelectedItemPosition();
            int n2 = sp2.getSelectedItemPosition();
            int n3 = sp3.getSelectedItemPosition();
            double cantidad = Metodos.tipo1(n,n2,n3);
            int cantidad_valor= Integer.parseInt(cantidad_pedir.getText().toString());
            total.setText(cantidad*cantidad_valor+"");
        }


    }

    public boolean validar(){
        if(cantidad_pedir.getText().toString().equals("")){
            cantidad_pedir.setError(recursos.getString(R.string.mensaje_1));
            cantidad_pedir.requestFocus();
            return false;
        }
        int numero = Integer.parseInt(cantidad_pedir.getText().toString());
        if(numero <= 0){
            cantidad_pedir.setError(recursos.getString(R.string.mensaje_2));
            cantidad_pedir.requestFocus();
            return false;
        }
        return true;
    }
}
