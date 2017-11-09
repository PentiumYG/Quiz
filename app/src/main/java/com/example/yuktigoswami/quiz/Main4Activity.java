package com.example.yuktigoswami.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {
    RadioGroup rgp;
    RadioButton r1;
    Button b,b2,b3;
    TextView t;
    int d;
    String r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        rgp=(RadioGroup)findViewById(R.id.radioGroup3);
        b=(Button)findViewById(R.id.button5);
        b2=(Button)findViewById(R.id.button10);
        b3=(Button)findViewById(R.id.button6);
        t=(TextView)findViewById(R.id.textView12);
        getIntent();
        Intent i=getIntent();
        r=i.getStringExtra("b");

        b.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int i=rgp.getCheckedRadioButtonId();

                        r1=(RadioButton)findViewById(i);
                        if(i==R.id.r){
                            t.setText("RIGHT");
                            int a=Integer.parseInt(r);
                            d=d+1+a;
                        }
                        else{
                            t.setText("WRONG");
                        }
                    }
                }
        );
        b2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i=new Intent(Main4Activity.this,Main3Activity.class);
                        startActivity(i);
                    }
                }
        );
       b3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String s=String.valueOf(d);
                        Intent j=new Intent(Main4Activity.this,Main5Activity.class);
                        j.putExtra("b",s);
                        startActivity(j);
                    }
                }
        );
    }
}
