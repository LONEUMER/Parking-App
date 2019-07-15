package com.example.parkingbookingsystemapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RegistrationForm extends AppCompatActivity {
    EditText editText,editText1,  et1, et2, et3;
    Spinner spnnr;
    Button btn1;

    DatabaseReference reff;
    Member member;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration_form);

        editText = (EditText) findViewById(R.id.date);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String currentDate = sdf.format(new Date());
        editText.setText(currentDate);

        editText1 = (EditText) findViewById(R.id.ettime);
        SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");
        String currentTime = time.format(new Date());
        editText1.setText(currentTime);


        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        et3 = (EditText) findViewById(R.id.et3);
        spnnr =  (Spinner) findViewById(R.id.spinerslot);
        btn1 = (Button) findViewById(R.id.btn1);

        member = new Member();
        reff = FirebaseDatabase.getInstance().getReference().child("Member");
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addMember();
            }

        });

    }

    private void addMember() {


         if (TextUtils.isEmpty(et1.getText()) || TextUtils.isEmpty(et2.getText()) || TextUtils.isEmpty(et3.getText())) {
            Toast.makeText(this, "Please Enter All Fields", Toast.LENGTH_SHORT).show();
        }



        else{


            String slot = spnnr.getSelectedItem().toString();
            String name = et1.getText().toString();
            Integer vehical = Integer.parseInt(et2.getText().toString().trim());
            Long phone = Long.parseLong(et3.getText().toString().trim());


            member.setName(name);
            member.setVehical(vehical);
            member.setPhone(phone);
            member.setSpinnerslot(slot);

            reff.push().setValue(member);

            Toast.makeText(this, "Booking Confirm", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(RegistrationForm.this, SelectSlot.class);
            intent.putExtra("name", name);
            intent.putExtra("vehical",vehical);
            intent.putExtra("phone",phone);
            startActivity(intent);
        }

    }
}