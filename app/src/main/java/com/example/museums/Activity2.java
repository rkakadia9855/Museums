package com.example.museums;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    TextView title;
    TextView adultTickets;
    TextView seniorTickets;
    TextView studentTickets;
    String adultPrice = "";
    String seniorPrice = "";
    String studentPrice = "";
    double adultPriceValue = 0.0;
    double seniorPriceValue = 0.0;
    double studentPriceValue = 0.0;
    private Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        toolbar=findViewById(R.id.myToolBar);
        adultTickets=findViewById(R.id.adultTicket);
        seniorTickets=findViewById(R.id.seniorTicket);
        studentTickets=findViewById(R.id.studentTicket);
        title = (TextView) findViewById(R.id.secondTitle);
        String selectedMuseum = getIntent().getStringExtra("Listviewclickvalue");
        title.setText(selectedMuseum);

        if(selectedMuseum.equals("The Museum of Modern Art")) {
            adultPrice = "adult $25.00";
            adultTickets.setText(adultPrice);
            adultPriceValue = 25.00;
            seniorPrice = "senior $18.00";
            seniorTickets.setText(seniorPrice);
            seniorPriceValue = 18.00;
            studentPrice = "student $14.00";
            studentTickets.setText(studentPrice);
            studentPriceValue = 14.00;
        }
        else if(selectedMuseum.equals("Rubin Museum of Art")) {
            adultPrice = "adult $19.00";
            adultTickets.setText(adultPrice);
            adultPriceValue = 19.00;
            seniorPrice = "senior $14.00";
            seniorTickets.setText(seniorPrice);
            seniorPriceValue = 14.00;
            studentPrice = "student $14.00";
            studentTickets.setText(studentPrice);
            studentPriceValue = 14.00;
        }
        else if(selectedMuseum.equals("American Museum of Natural History")) {
            adultPrice = "adult $23.00";
            adultTickets.setText(adultPrice);
            adultPriceValue = 23.00;
            seniorPrice = "senior $18.00";
            seniorTickets.setText(seniorPrice);
            seniorPriceValue = 18.00;
            studentPrice = "student $18.00";
            studentTickets.setText(studentPrice);
            studentPriceValue = 18.00;
        }
        else if(selectedMuseum.equals("Whitney Museum of American Art")) {
            adultPrice = "adult $25.00";
            adultTickets.setText(adultPrice);
            adultPriceValue = 25.00;
            seniorPrice = "senior $18.00";
            seniorTickets.setText(seniorPrice);
            seniorPriceValue = 18.00;
            studentPrice = "student $18.00";
            studentTickets.setText(studentPrice);
            studentPriceValue = 18.00;
        }

    }
}
