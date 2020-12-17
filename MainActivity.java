package com.example.temperaturedatalogger;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button= findViewById(R.id.createChannel);

        button.setOnClickListener(v -> {
            Intent intent=new Intent(MainActivity.this , CreateNewChannel.class);
            startActivity(intent);
        });
    }

}