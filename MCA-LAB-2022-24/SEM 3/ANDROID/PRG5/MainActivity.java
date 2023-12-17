package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView disp;
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,add,sub,mul,div,clr,eql;

    double num1=0;
    double num2=0;

    String op="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0=(Button) findViewById(R.id.b0);
        b1=(Button) findViewById(R.id.b1);
        b2=(Button) findViewById(R.id.b2);
        b3=(Button) findViewById(R.id.b3);
        b4=(Button) findViewById(R.id.b4);
        b5=(Button) findViewById(R.id.b5);
        b6=(Button) findViewById(R.id.b6);
        b7=(Button) findViewById(R.id.b7);
        b8=(Button) findViewById(R.id.b8);
        b9=(Button) findViewById(R.id.b9);
        add=(Button) findViewById(R.id.add);
        sub=(Button) findViewById(R.id.sub);
        add=(Button) findViewById(R.id.add);
        mul=(Button) findViewById(R.id.mul);
        div=(Button) findViewById(R.id.div);
        clr=(Button) findViewById(R.id.clr);
        eql=(Button) findViewById(R.id.eql);
        disp=(TextView) findViewById(R.id.disp);

        b0.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        add.setOnClickListener(this);
        mul.setOnClickListener(this);
        sub.setOnClickListener(this);
        div.setOnClickListener(this);
        eql.setOnClickListener(this);
        clr.setOnClickListener(this);


    }

    @Override
    public void onClick(View view){

        Button b=(Button) view;

        if(view == clr){
            disp.setText("");
        }
        else if(view == sub || view == mul || view == div || view == add){
            num1=Integer.parseInt(disp.getText().toString());
            op=b.getText().toString();
            disp.setText("");
        }

        else if(view == eql){

            num2=Integer.parseInt(disp.getText().toString());
            if(op.equals("+")){
                disp.setText(num1+num2+" ");
            }
            if(op.equals("-")){
                disp.setText(num1-num2+" ");
            }
            if(op.equals("/")){
                disp.setText(num1/num2+" ");
            }
            if(op.equals("X")){
                disp.setText(num1*num2+" ");
            }
            else{
                String s = disp.getText().toString();
                disp.setText(s + b.getText().toString());
            }
        }
    }



}
