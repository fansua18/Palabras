package com.example.fabiansuarez.palabras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    Button volver;
    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        volver=(Button)findViewById(R.id.regresar);
        texto=(TextView)findViewById(R.id.text);

        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regresar=new Intent(Main3Activity.this, Main2Activity.class);
                startActivity(regresar);
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