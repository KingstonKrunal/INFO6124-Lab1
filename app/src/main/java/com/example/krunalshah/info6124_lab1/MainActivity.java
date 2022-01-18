package com.example.krunalshah.info6124_lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText riddleAnswer;
    Button solveButton;
    ImageView tickImage;
    TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        riddleAnswer = findViewById(R.id.answerText);
        solveButton = findViewById(R.id.solveButton);
        tickImage = findViewById(R.id.tickImage);
        answer = findViewById(R.id.answer);

        solveButton.setOnClickListener(v -> {
            if (riddleAnswer.getText().toString().equalsIgnoreCase("promise")) {
                tickImage.setImageResource(R.drawable.tickmark);
            }
            else {
                tickImage.setImageResource(R.drawable.crossmark);
            }
            tickImage.setVisibility(View.VISIBLE);
            answer.setVisibility(View.VISIBLE);
        });
    }
}