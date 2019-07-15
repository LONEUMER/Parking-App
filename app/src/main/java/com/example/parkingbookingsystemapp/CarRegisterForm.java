package com.example.parkingbookingsystemapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.SimpleTimeZone;

public class CarRegisterForm extends AppCompatActivity {
    EditText etName,etVechical,etPhone;
    Button btnRegister;
    Spinner spSlot;
    DatabaseReference CarRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_register_form);

        EditText editText = (EditText) findViewById(R.id.date);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String currentDate = sdf.format(new Date());
        editText.setText(currentDate);

        EditText editText1 = (EditText) findViewById(R.id.ettime);
        SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");
        String currentTime =time.format(new Date());
        editText1.setText(currentTime);


        etName = findViewById(R.id.etName);
        etVechical = findViewById(R.id.etVehical);
        etPhone= findViewById(R.id.etPhone);
        btnRegister = findViewById(R.id.btnRegister);
        spSlot = findViewById(R.id.spSlot);
        CarRef = FirebaseDatabase.getInstance().getReference("Register");
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addMember();

            }
        });
    }
      private void  addMember(){
        String name = etName.getText().toString().trim();
        int vechical = Integer.parseInt(etVechical.getText().toString().trim());
        Long phone = Long.parseLong(etPhone.getText().toString().trim());
        String slot = spSlot.getSelectedItem().toString();
        if (TextUtils.isEmpty(name))
        {
            String id = CarRef.push().getKey();
            Register register = new Register();
            register.setName(name);
            register.setPhone(phone);
            register.setVechical(vechical);
            register.setSlot(slot);
            CarRef.setValue(register);
            Toast.makeText(this,"Booking Confirm",Toast.LENGTH_LONG).show();

        }else{
            Toast.makeText(this,"You should enter a name",Toast.LENGTH_LONG).show();
            }
      }
}
