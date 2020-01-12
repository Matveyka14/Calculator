package ru.matveyka.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText1;
    EditText editText2;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);
        textView = findViewById(R.id.textView);
    }

    public void summary(View view) {
        //если editText1 не пустой и editText2 тоже
        if (!editText1.getText().toString().isEmpty() && !editText2.getText().toString().isEmpty()) {
            float a = Float.parseFloat(editText1.getText().toString());
            float b = Float.parseFloat(editText2.getText().toString());

            textView.setText(a + b + "");
        }
    }
    public void minus(View view) {
        //если editText1 не пустой и editText2 тоже
        if (!editText1.getText().toString().isEmpty() && !editText2.getText().toString().isEmpty()) {
            float a = Float.parseFloat(editText1.getText().toString());
            float b = Float.parseFloat(editText2.getText().toString());

            textView.setText(a - b + "");
        }
    }
}
