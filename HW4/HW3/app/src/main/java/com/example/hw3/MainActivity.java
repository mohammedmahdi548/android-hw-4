package com.example.hw3;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText q = findViewById(R.id.Quize);
        final EditText h = findViewById(R.id.HW);
        final EditText m = findViewById(R.id.MID);
        final EditText f = findViewById(R.id.Final);
        final TextView r = findViewById(R.id.Result);
        Button c = findViewById(R.id.calculate);
        Button res = findViewById(R.id.Reset);


        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               //Result = quize + HomeWork + Midterms + Finals
                double quize = Double.parseDouble(q.getText().toString());
                      double homework = Double.parseDouble(h.getText().toString());
              double midterms = Double.parseDouble(m.getText().toString());
                      double finals = Double.parseDouble(f.getText().toString());
               double result = quize + homework + midterms + finals ;
                //Toast.makeText(MainActivity.this, "congrats"+result, Toast.LENGTH_SHORT).show();


                if (result ==100){
                    r.setText("Amazing Job");
                    r.setTextColor(Color.parseColor("#99b898"));

                    //  r.setTextColor(Integer.parseInt("#EA0808"));
                    // First try ^^

                }
                else if (result>90){
                    r.setText("A"+" : "+result);
                    r.setTextColor(Color.parseColor("#527318"));
                }
                else if (result>=80) {
                    r.setText("B"+" : "+result);
                    r.setTextColor(Color.parseColor("#ffe75e"));
                }
                else if (result>=70) {
                    r.setText("C"+" : "+result);
                    r.setTextColor(Color.parseColor("#f8b400"));
                }
                else if (result>=60) {
                    r.setText("D"+" : "+result);
                    r.setTextColor(Color.parseColor("#fe9801"));
                }
                else if (result<60) {
                    r.setText("F"+" : "+result);
                    r.setTextColor(Color.parseColor("#fd5e53"));
                }


            }


        });
        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q.setText("");
                m.setText("");
                f.setText("");
                h.setText("");
                r.setText("");
                //reset function
    }

        });



	        }
}








