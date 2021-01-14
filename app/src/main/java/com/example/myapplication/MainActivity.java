package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mButton = findViewById(R.id.button1);

        mButton.setOnClickListener(new View.OnClickListener() { //I will set listener on this button
            @Override
            public void onClick(View v) { //When button is clicked this line is called
                Log.i("Hack-a-thing","Hello World!");
            }
        });
    }
}
