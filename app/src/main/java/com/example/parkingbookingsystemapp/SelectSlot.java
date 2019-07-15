package com.example.parkingbookingsystemapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class SelectSlot extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_slot);
        TimePicker picker=(TimePicker)findViewById(R.id.timePicker1);
        picker.setIs24HourView(true);

        b1 = (Button)findViewById(R.id.button1);
        b2 = (Button)findViewById(R.id.button2);
        b3 = (Button)findViewById(R.id.button3);
        b4 = (Button)findViewById(R.id.button4);
        b5 = (Button)findViewById(R.id.button5);
        b6 = (Button)findViewById(R.id.button6);
        b7 = (Button)findViewById(R.id.button7);
        b8 = (Button)findViewById(R.id.button8);
        b9 = (Button)findViewById(R.id.button9);

    }
    public void b1Clicked(View v)
    {
        b1.setVisibility(View.INVISIBLE);
        b1.setClickable(false);
        b2.setVisibility(View.VISIBLE);
        b3.setVisibility(View.VISIBLE);
        b4.setVisibility(View.VISIBLE);
        b5.setVisibility(View.VISIBLE);
        b6.setVisibility(View.VISIBLE);
        b7.setVisibility(View.VISIBLE);
        b8.setVisibility(View.VISIBLE);
        b9.setVisibility(View.VISIBLE);
        Intent intent = new Intent(SelectSlot.this,HomeActivity.class);
        startActivity(intent);
    }
    public void b2Clicked(View v)
    {

        b2.setVisibility(View.INVISIBLE);
        b2.setClickable(false);
        b3.setVisibility(View.VISIBLE);
        b4.setVisibility(View.VISIBLE);
        b5.setVisibility(View.VISIBLE);
        b6.setVisibility(View.VISIBLE);
        b7.setVisibility(View.VISIBLE);
        b8.setVisibility(View.VISIBLE);
        b9.setVisibility(View.VISIBLE);
        Intent intent = new Intent(SelectSlot.this,HomeActivity.class);
        startActivity(intent);
    }
    public void b3Clicked(View v)
    {


        b3.setVisibility(View.INVISIBLE);
        b3.setClickable(false);
        b4.setVisibility(View.VISIBLE);
        b5.setVisibility(View.VISIBLE);
        b6.setVisibility(View.VISIBLE);
        b7.setVisibility(View.VISIBLE);
        b8.setVisibility(View.VISIBLE);
        b9.setVisibility(View.VISIBLE);
        Intent intent = new Intent(SelectSlot.this,HomeActivity.class);
        startActivity(intent);
    }
    public void b4Clicked(View v)
    {

        b4.setVisibility(View.INVISIBLE);
        b4.setClickable(false);
        b5.setVisibility(View.VISIBLE);
        b6.setVisibility(View.VISIBLE);
        b7.setVisibility(View.VISIBLE);
        b8.setVisibility(View.VISIBLE);
        b9.setVisibility(View.VISIBLE);
        Intent intent = new Intent(SelectSlot.this,HomeActivity.class);
        startActivity(intent);
    }
    public void b5Clicked(View v)
    {

        b5.setVisibility(View.INVISIBLE);
        b5.setClickable(false);
        b6.setVisibility(View.VISIBLE);
        b7.setVisibility(View.VISIBLE);
        b8.setVisibility(View.VISIBLE);
        b9.setVisibility(View.VISIBLE);
        Intent intent = new Intent(SelectSlot.this,HomeActivity.class);
        startActivity(intent);
    }

    public void b6Clicked(View v)
    {
        b6.setVisibility(View.INVISIBLE);
        b7.setVisibility(View.VISIBLE);
        b8.setVisibility(View.VISIBLE);
        b9.setVisibility(View.VISIBLE);
        Intent intent = new Intent(SelectSlot.this,HomeActivity.class);
        startActivity(intent);
    }
    public void b7Clicked(View v)
    {

        b7.setVisibility(View.INVISIBLE);
        b8.setVisibility(View.VISIBLE);
        b9.setVisibility(View.VISIBLE);
        Intent intent = new Intent(SelectSlot.this,HomeActivity.class);
        startActivity(intent);
    }

    public void b8Clicked(View v)
    {

        b8.setVisibility(View.INVISIBLE);
        b9.setVisibility(View.VISIBLE);
        Intent intent = new Intent(SelectSlot.this,HomeActivity.class);
        startActivity(intent);
    }


    public void b9Clicked(View v)
    {

        b9.setVisibility(View.INVISIBLE);
        Intent intent = new Intent(SelectSlot.this,HomeActivity.class);
        startActivity(intent);

    }

}
