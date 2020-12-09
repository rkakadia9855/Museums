package com.example.museums;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Activity2 extends AppCompatActivity {

    TextView title;
    String adultPrice = "";
    String seniorPrice = "";
    String studentPrice = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        title = (TextView) findViewById(R.id.textView);
        String selectedMuseum = getIntent().getStringExtra("Listviewclickvalue");
        title.setText(selectedMuseum);

        if(selectedMuseum.equals("The Museum of Modern Art")) {
            adultPrice = "adult $25.00";
            seniorPrice = "senior $18.00";
            studentPrice = "student $14.00";
        }
        else if(selectedMuseum.equals("Rubin Museum of Art")) {
            adultPrice = "adult $19.00";
            seniorPrice = "senior $14.00";
            studentPrice = "student $14.00";
        }
        else if(selectedMuseum.equals("American Museum of Natural History")) {
            adultPrice = "adult $23.00";
            seniorPrice = "senior $18.00";
            studentPrice = "student $18.00";
        }
        else if(selectedMuseum.equals("Whitney Museum of American Art")) {
            adultPrice = "adult $25.00";
            seniorPrice = "senior $18.00";
            studentPrice = "student $18.00";
        }

    }
}
