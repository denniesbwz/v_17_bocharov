package com.example.bocharov_v_17;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }

    public void startNewActivity(View v){
     Intent intent = new Intent(this, Personal_area.class );
     startActivity(intent);

    }
}