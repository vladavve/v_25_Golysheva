package com.example.golysheva_v_25;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PersonalArea extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal_area);
        Button btn1 = (Button) findViewById(R.id.btnZv);
        btn1.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(v.getContext(), Notice.class);
        startActivity(intent);
    }
}
