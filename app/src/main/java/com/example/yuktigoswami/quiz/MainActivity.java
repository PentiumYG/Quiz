package com.example.yuktigoswami.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RadioGroup rgp;
    RadioButton r1;
    Button b,n;
    TextView t;
    int a=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rgp=(RadioGroup)findViewById(R.id.radioGroup);
        b=(Button)findViewById(R.id.button);
        n=(Button)findViewById(R.id.next);
        t=(TextView)findViewById(R.id.textView3);

        b.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int i=rgp.getCheckedRadioButtonId();

                        r1=(RadioButton)findViewById(i);
                        if(i==R.id.rb3){
                            t.setText("RIGHT");
                            a=a+1;
                        }
                        else{
                            t.setText("WRONG");
                        }
                    }
                }
        );
        n.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String s=String.valueOf(a);
                        Intent x=new Intent(MainActivity.this,Main2Activity.class);
                        x.putExtra("b",s);
                        startActivity(x);
                    }
                }
        );
    }

}
