package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lab2.utils.TextCounter;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spCountingOptions;
    EditText edPhraseInput;
    TextView tvResult;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    this.spCountingOptions = findViewById(R.id.spCountingOptions);
    this.edPhraseInput = findViewById(R.id.edPhraseInput);
    this.tvResult = findViewById(R.id.tvResult);
    this.textView = findViewById(R.id.textView);

    ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
            R.array.counter_options, android.R.layout.simple_spinner_item);
    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    this.spCountingOptions.setAdapter(adapter);
    this.spCountingOptions.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String text = adapterView.getItemAtPosition(i).toString();
        Toast.makeText(adapterView.getContext(), text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void onBtnClick(View view) {
        if (spCountingOptions.getSelectedItem().toString().trim().equals("Chars")) {
            this.textView.setText("Quantity:");
            this.tvResult.setText(String.valueOf(TextCounter.getCharsCount(this.edPhraseInput.getText().toString())));
        }
        else if (spCountingOptions.getSelectedItem().toString().trim().equals("Words"))
        {
            String[] text_string = this.edPhraseInput.getText().toString().split("\\s+");
            if (text_string != null && text_string.length != 0 && this.edPhraseInput.getText().toString().trim().length() > 0){
                int text1 = text_string.length;
                this.textView.setText("Quantity:");
                this.tvResult.setText(String.valueOf(text1));
            }
            else
            {
                Toast.makeText(this, "Error! The string is empty, try again.", Toast.LENGTH_SHORT).show();
            }
        }
    }
}