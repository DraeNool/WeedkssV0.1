package com.pethoalpar.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class activity_login extends AppCompatActivity {

    Button siguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        siguiente=(Button)findViewById(R.id.btnIngresar);

        siguiente.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Intent siguiente = new Intent(activity_login.this,activity_menu_principal.class);
                startActivity(siguiente);
            }}

        );
    }




}
