package com.example.ganiskalkulatorkpkfpb;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Kpk extends AppCompatActivity {
    Button button;
    EditText editText1,editText2;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kpk);

        button=(Button)findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check();
            }
        });

    }

    public void check()
    {
        editText1=(EditText)findViewById(R.id.editText1);
        editText2=(EditText)findViewById(R.id.editText2);

        String a,b;
        a=editText1.getText().toString();
        b=editText2.getText().toString();

        if (TextUtils.isEmpty(a) && TextUtils.isEmpty(b))
        {
            Toast.makeText(this, "Masukkan angka", Toast.LENGTH_SHORT).show();
        }

        else if (TextUtils.isEmpty(a))
        {
            Toast.makeText(this, "Masukkan angka", Toast.LENGTH_SHORT).show();
        }

        else if(TextUtils.isEmpty(b))
        {
            Toast.makeText(this, "Masukkan angka", Toast.LENGTH_SHORT).show();
        }

        else
        {
            kpk();
        }
    }

    public void kpk()
    {
        editText1=(EditText)findViewById(R.id.editText1);
        editText2=(EditText)findViewById(R.id.editText2);
        textView=(TextView) findViewById(R.id.kpk);

        String a,b;
        a=editText1.getText().toString();
        b=editText2.getText().toString();

        Integer a1,a2,i,x;

        a1=Integer.parseInt(a);
        a2=Integer.parseInt(b);
        x=a1*a2;

        for (i=1;i<=x;i++)
        {
            if (x%i==0 && i%a1==0 && i%a2==0)
            {
                textView.setText(""+i);
                break;
            }
        }

    }
}



