package com.example.yuktigoswami.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    RadioGroup rgp;
    RadioButton r1;
    Button b,b2,b3;
    TextView t;
    int B=0;
    String r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        rgp=(RadioGroup)findViewById(R.id.radioGroup);
        b=(Button)findViewById(R.id.button2);
        b2=(Button)findViewById(R.id.button3);
        b3=(Button)findViewById(R.id.button4);
        t=(TextView)findViewById(R.id.answer);
        getIntent();
        Intent x=getIntent();
         r=x.getStringExtra("b");


        b.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int i=rgp.getCheckedRadioButtonId();

                        r1=(RadioButton)findViewById(i);
                        if(i==R.id.rb02){
                            t.setText("RIGHT");
                            int a=Integer.parseInt(r);
                            B=B+1+a;

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

                        Intent i=new Intent(Main2Activity.this,MainActivity.class);

                        startActivity(i);

                    }
                }
        );
        b3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String s=String.valueOf(B);
                        Intent j=new Intent(Main2Activity.this,Main3Activity.class);
                        j.putExtra("b",s);
                        startActivity(j);
                    }
                }
        );


    }
}
