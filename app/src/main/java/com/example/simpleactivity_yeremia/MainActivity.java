package com.example.simpleactivity_yeremia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText lahirInput;

    private TextView outputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lahirInput = findViewById(R.id.input_lahir);
        outputText = findViewById(R.id.text_output);
    }

    public void handleSubmit(View view) {
        int lahir = Integer.parseInt(lahirInput.getText().toString());

        if (lahir >= 1946 && lahir <= 1964) {
            outputText.setText("Ok, Boomers!");
        }else if (lahir >= 1965 && lahir <= 1980 ) {
            outputText.setText("Hai, Generasi X");
        }else if (lahir >= 1981 && lahir <= 1994 ) {
            outputText.setText("Hai, Milenials!");
        }else if (lahir >=1995 && lahir <= 2010 ) {
            outputText.setText("Hai, Generasi Z");
        }else if (lahir >= 2011 && lahir <= 2025 ) {
            outputText.setText("Hai, Generasi Alpha");
        }else   {
            outputText.setText("Unidentified");
        }
    }
}