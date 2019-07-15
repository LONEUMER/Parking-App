package com.example.parkingbookingsystemapp;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ViewBooking extends AppCompatActivity {
   TextView txDisplay;
Button btnnn;
FirebaseAuth auth;
DatabaseReference reff;
FirebaseUser user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_booking);
        txDisplay = (TextView) findViewById(R.id.view);
         btnnn =(Button)findViewById(R.id.btDisplay);

         user = auth.getCurrentUser();
         txDisplay.setText(user.getPhoneNumber());
         reff = FirebaseDatabase.getInstance().getReference().child(user.getPhoneNumber());
        reff.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String name = dataSnapshot.child("name").getValue().toString();
                String phone = dataSnapshot.child("phone").getValue().toString();
                String spinnerslot =dataSnapshot.child("spinnerslot").getValue().toString();
                String vehical = dataSnapshot.child("vehical").getValue().toString();
                Toast.makeText(getApplicationContext(),name +"\n" + phone,Toast.LENGTH_LONG).show();

    }


            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            Toast.makeText(getApplicationContext(),databaseError.getMessage(),Toast.LENGTH_LONG).show();
            }
        });
    }
}
