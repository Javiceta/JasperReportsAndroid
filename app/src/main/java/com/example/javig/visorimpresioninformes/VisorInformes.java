package com.example.javig.visorimpresioninformes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class VisorInformes extends AppCompatActivity {

    JasperParser parser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visor_informes);

        parser = new JasperParser(this);
        TextView visor = findViewById(R.id.txtVisor);
        visor.setText(parser.parseXML());
    }

}
