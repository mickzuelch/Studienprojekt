package org.tensorflow.lite.examples.detection;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;

import android.graphics.Color;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    public static final float MINIMUM_CONFIDENCE_TF_OD_API = 0.5f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cameraButton = findViewById(R.id.cameraButton);
        staticScansButton = findViewById(R.id.scanText);

        cameraButton.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, DetectorActivity.class)));

        staticScansButton.setTextSize(20);
        staticScansButton.setTextColor(Color.BLACK);
        staticScansButton.setTextAlignment(View.TEXT_ALIGNMENT_GRAVITY);
    }

    private Button cameraButton;
    private TextView staticScansButton;
}
