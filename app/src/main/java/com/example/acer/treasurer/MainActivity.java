package com.example.acer.treasurer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout backG;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        backG = (ConstraintLayout)findViewById(R.id.backG);

        backG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent select_project = new Intent(MainActivity.this,Select_project.class);
                startActivity(select_project);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(MainActivity.this,"Tap to start",Toast.LENGTH_LONG).show();
    }
}
