package com.example.prog3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name,email;
    String a,b;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        sp=getSharedPreferences("MyPref",MODE_PRIVATE);
        name=(EditText) findViewById(R.id.uname);
        email=(EditText) findViewById(R.id.email);
        if(sp.contains("Name"))
            name.setText(sp.getString("Name",""));
        if(sp.contains("Email"))
            email.setText(sp.getString("Email",""));
    }
    public void nextAvtivity(View v){
        a=name.getText().toString();
        b=email.getText().toString();
        SharedPreferences.Editor editor=sp.edit();
        editor.putString("Name",a);
        editor.putString("Name",b);
        editor.apply();
        System.out.println("Next");
        Intent i=new Intent(this,SecondActivity.class);
        startActivity(i);



    }

}
