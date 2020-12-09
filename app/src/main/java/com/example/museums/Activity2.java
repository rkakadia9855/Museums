package com.example.museums;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Activity2 extends AppCompatActivity {

    TextView textView;
    double adultPrice = 0.0;
    double seniorPrice = 0.0;
    double studentPrice = 0.0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        textView = (TextView) findViewById(R.id.textView);
        String selectedMuseum = getIntent().getStringExtra("Listviewclickvalue");
        textView.setText(selectedMuseum);

        if(selectedMuseum.equals("The Museum of Modern Art")) {
            adultPrice = 25.00;
            seniorPrice = 18.00;
            studentPrice = 14.00;
        }
        else if(selectedMuseum.equals("Rubin Museum of Art")) {
            adultPrice = 19.00;
            seniorPrice = 14.00;
            studentPrice = 14.00;
        }
        else if(selectedMuseum.equals("American Museum of Natural History")) {
            adultPrice = 23.00;
            seniorPrice = 18.00;
            studentPrice = 18.00;
        }
        else if(selectedMuseum.equals("Whitney Museum of American Art")) {
            adultPrice = 25.00;
            seniorPrice = 18.00;
            studentPrice = 18.00;
        }

    }
}
