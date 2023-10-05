package com.example.loginfirst;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.loginfirst.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   EditText user,pwd;
   String u="s6108";
   String p="abc";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }

        public void verify(View v){
            if (v.getId() == R.id.loginButton) {
                user = (EditText) findViewById(R.id.username);
                pwd = (EditText) findViewById(R.id.password);
                String a = user.getText().toString();
                String b = pwd.getText().toString();
                if (a.equals(u) && b.equals(p))
                    Toast.makeText(this, "Login Successfully", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(this, "Invalid Login", Toast.LENGTH_LONG).show();
            }
        }

}



