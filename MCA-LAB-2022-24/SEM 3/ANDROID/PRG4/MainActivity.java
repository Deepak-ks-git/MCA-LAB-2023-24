package com.example.program4;


import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.app.Notification;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    LinearLayout l1;
    TextView t;
    Button b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        l1=new LinearLayout(this);
        t=new TextView(this);
        b=new Button(this);

        LinearLayout.LayoutParams dim=new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT
                ,ActionBar.LayoutParams.MATCH_PARENT);
        l1.setLayoutParams(dim);
        LinearLayout.LayoutParams vdim=new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT
                ,ViewGroup.LayoutParams.WRAP_CONTENT);
        vdim.setMargins(0,50,0,0);

        t.setLayoutParams(vdim);
        b.setLayoutParams(vdim);

        l1.setOrientation(LinearLayout.VERTICAL);
        l1.setVerticalGravity(Gravity.CENTER);

        t.setText("HELLO ALL!");
        t.setGravity(Gravity.CENTER);
        t.setTextSize(35);
        t.setTextColor(Color.BLUE);
        t.setTypeface(Typeface.DEFAULT_BOLD);

        b.setText("Hi Button");
        b.setBackgroundColor(Color.YELLOW);
        l1.addView(t);
        l1.addView(b);





       // setContentView(R.layout.activity_main);
        setContentView(l1);
    }
}
