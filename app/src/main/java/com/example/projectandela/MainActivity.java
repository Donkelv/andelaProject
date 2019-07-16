package com.example.projectandela;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Button button4;
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar)  findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("ALC 4 Phase 1");

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityabout();
            }
        });

        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityprofile();
            }
        });
    }
    public void openActivityabout(){
        Intent intent = new Intent(this, aboutAndela.class);
        startActivity(intent);
    }
    public void openActivityprofile(){
        Intent intent = new Intent(this, myProfile.class);
        startActivity(intent);
    }
}
