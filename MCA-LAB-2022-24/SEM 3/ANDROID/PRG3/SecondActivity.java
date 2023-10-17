package com.example.prog3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    SharedPreferences sp;
    TextView t1,t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        sp=getSharedPreferences("Mypref",MODE_PRIVATE);
        t1=(TextView) findViewById(R.id.userview);
        t1=(TextView) findViewById(R.id.emailview);
        if(sp.contains("Name"))
            t1.setText(sp.getString("Name",""));
        if(sp.contains("Email"))
            t2.setText(sp.getString("Email",""));

    }
    public void previousActivity(View v){
        System.out.println("Previous");
        startActivity(new Intent(this,MainActivity.class));
    }
}
