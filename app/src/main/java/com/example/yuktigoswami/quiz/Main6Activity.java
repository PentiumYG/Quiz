package com.example.yuktigoswami.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main6Activity extends AppCompatActivity {
    TextView t ,ra ,wa,pers;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        t=(TextView)findViewById(R.id.finalresult);
        ra=(TextView)findViewById(R.id.rightAttempts);
        wa=(TextView)findViewById(R.id.wrongAttempts);
        pers=(TextView)findViewById(R.id.percentage);
        getIntent();
        Intent i=getIntent();
        String r=i.getStringExtra("b");
        t.setText(r);
        String a=t.getText().toString();
        int x=Integer.parseInt(a);
        int w=5-x;
        float p=(Float.parseFloat(a)/5)*100;
        String k=String.valueOf(x);
        ra.setText(k);
        String l=String.valueOf(w);
        wa.setText(l);
        String per=String.valueOf(p);
        pers.setText(per);


    }

}
