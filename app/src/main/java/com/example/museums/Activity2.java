/**
 This class represents the 2nd activity for the app
 @author John Juarez, Rudra Kakadia

 */

package com.example.museums;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class Activity2 extends AppCompatActivity  {

    TextView title;
    TextView adultTickets;
    TextView seniorTickets;
    TextView studentTickets;
    String adultPrice = "";
    String seniorPrice = "";
    String studentPrice = "";
    Button calculator;
    double adultPriceValue = 0.0;
    double seniorPriceValue = 0.0;
    double studentPriceValue = 0.0;
    private Toolbar toolbar;
    int numAdults = 0;
    int numSeniors = 0;
    int numStudents = 0;
    double ticketTotal = 0.0;
    double salesTax = 0.0;
    double totalAmount = 0.0;
    TextView displayTicketTotal;
    TextView displaySalesTax;
    TextView displayTotalAmount;
    ImageButton image;
    Spinner adult;
    Spinner senior;
    Spinner student;
    String select1;
    String select2;
    String select3;


    /**
     This method handles all the functions for the 2nd activity
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Toast.makeText(Activity2.this,
                "Maximum of 5 tickets each!", Toast.LENGTH_SHORT).show();

        toolbar=findViewById(R.id.myToolBar);
        adultTickets=findViewById(R.id.adultTicket);
        seniorTickets=findViewById(R.id.seniorTicket);
        studentTickets=findViewById(R.id.studentTicket);
        displaySalesTax=findViewById(R.id.salesValue);
        displayTicketTotal=findViewById(R.id.ticketValue);
        displayTotalAmount=findViewById(R.id.totalValue);
        calculator=findViewById(R.id.Calculate);
        title = (TextView) findViewById(R.id.secondTitle);
        String selectedMuseum = getIntent().getStringExtra("Listviewclickvalue");
        title.setText(selectedMuseum);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        image = (ImageButton)findViewById(R.id.image);

        adult = (Spinner)findViewById(R.id.adultSpinner);
        senior = (Spinner)findViewById(R.id.seniorSpinner);
        student = (Spinner)findViewById(R.id.studentSpinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(Activity2.this,R.array.amountOfTickets,
                android.R.layout.simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adult.setAdapter(adapter);
        senior.setAdapter(adapter);
        student.setAdapter(adapter);

        adult.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            /**
             Gets the value from the Spinner
             */
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                 select1 = adult.getSelectedItem().toString();
                 select2 = senior.getSelectedItem().toString();
                 select3 = student.getSelectedItem().toString();
                 numAdults = Integer.parseInt(select1);
                numSeniors = Integer.parseInt(select2);
                numStudents = Integer.parseInt(select3);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        senior.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            /**
             Gets the value from the Spinner
             */
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {

                select2 = senior.getSelectedItem().toString();
                numSeniors = Integer.parseInt(select2);

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        student.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            /**
             Gets the value from the Spinner
             */
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                select3 = student.getSelectedItem().toString();
                numStudents = Integer.parseInt(select3);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        calculator.setOnClickListener(new View.OnClickListener() {
            /**
             Handles all the ticket Calculations
             */
            @Override
            public void onClick(View view) {
                ticketTotal = (numAdults * adultPriceValue) + (numSeniors * seniorPriceValue)
                        + (numStudents * studentPriceValue);
                salesTax = ticketTotal * 0.08875;
                totalAmount = ticketTotal + salesTax;
                DecimalFormat formatter = new DecimalFormat("#,##0.00");
                displaySalesTax.setText(formatter.format(salesTax));
                displayTicketTotal.setText(String.valueOf(ticketTotal));
                displayTotalAmount.setText(formatter.format(totalAmount));
            }
        });

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
            int imageResource = getResources().getIdentifier("@drawable/moma",
                    null,this.getPackageName());

            image.setImageResource(imageResource);

            image.setOnClickListener(new View.OnClickListener() {
                /**
                 Opens Moma.org when image button is clicked
                 */
                @Override
                public void onClick(View view) {
                  startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.moma.org/")));
                }
            });

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

            int imageResource = getResources().getIdentifier("@drawable/rubin",
                    null,this.getPackageName());
            image.setImageResource(imageResource);

            image.setOnClickListener(new View.OnClickListener() {
                /**
                 Opens Rubinmuseum.org when image button is clicked
                 */
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://rubinmuseum.org/")));
                }
            });
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

            int imageResource = getResources().getIdentifier("@drawable/naturalhistory",
                    null,this.getPackageName());
            image.setImageResource(imageResource);

            image.setOnClickListener(new View.OnClickListener() {
                /**
                 Opens amnh.org when image button is clicked
                 */
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amnh.org/")));
                }
            });


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

            int imageResource = getResources().getIdentifier("@drawable/whitney",
                    null,this.getPackageName());
            image.setImageResource(imageResource);

            image.setOnClickListener(new View.OnClickListener() {
                /**
                 Opens whitney.org when image button is clicked
                 */
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://whitney.org/")));
                }
            });
        }

    }

}
