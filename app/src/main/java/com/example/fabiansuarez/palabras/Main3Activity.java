package com.example.fabiansuarez.palabras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    Button volver,salir;
    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        volver=(Button)findViewById(R.id.regresar);
        salir=(Button)findViewById(R.id.exit);
        texto=(TextView)findViewById(R.id.text);

        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regresar=new Intent(Main3Activity.this, Main2Activity.class);
                startActivity(regresar);
            }
        });

        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });

        String s= getIntent().getExtras().getString("palabra");
        String sub="";
        for (int i=s.length();i>0;i--) {
            sub = sub.concat(s.substring(i - 1, i));
        }
        texto.setText(sub.toString());
    }
}