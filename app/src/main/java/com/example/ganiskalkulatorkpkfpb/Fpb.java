package com.example.ganiskalkulatorkpkfpb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Arrays;

public class Fpb extends AppCompatActivity {

    private EditText editText;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fpb);

        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);
    }
    public void calculateButton(View view){

        String[] stringsNumbers = editText.getText().toString().split(",");
        Integer[] integersNumbers = new Integer[stringsNumbers.length];

        for (int i=0; i<stringsNumbers.length; i++){
            integersNumbers[i] = Integer.parseInt(stringsNumbers[i]);
        }

        Arrays.sort(integersNumbers);

        int FPB = 1;
        int intRemainder;

        for (int i = 2; i<=integersNumbers[0]; i++){
            intRemainder = 0;

            for(int j=0;j<integersNumbers.length; j++){
                if(integersNumbers[j]%i != 0){
                    intRemainder = 1;
                    break;
                }
            }

            if (intRemainder == 0){
                FPB = i;
            }
        }
        textView.setText(String.valueOf(FPB));
    }
}

