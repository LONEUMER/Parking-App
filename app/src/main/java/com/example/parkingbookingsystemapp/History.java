package com.example.parkingbookingsystemapp;

import android.nfc.Tag;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.jar.Attributes;

public class History extends AppCompatActivity {


    ListView listView;

    DatabaseReference ref;
    ArrayList<String> list;
    ArrayAdapter<String> adapter;
    Member user;
    private static final String TAG = "MyTag";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

       user = new Member();
        listView = (ListView)findViewById(R.id.listview);

       // Retrieve an instance of your database using getInstance() and reference the location you want to write to.


        ref = FirebaseDatabase.getInstance().getReference("Member");
        list = new ArrayList<>();
        adapter = new ArrayAdapter<String>(this,R.layout.user_info,R.id.userinfo,list);

        // Read from the database
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                list.clear();
               for (DataSnapshot ds: dataSnapshot.getChildren())
               {
                   user = ds.getValue(Member.class);

                   list.add("Name: " + user.getName()+" "+ " Phone No: " +user.getPhone()+" "+"Vehical No: " +user.getVehical()+" "+ "Slot No: " +user.getSpinnerslot());
               }

               listView.setAdapter(adapter);


            }
            // Failed to read value
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {


                Log.d(TAG,"Failed to Read Value", databaseError.toException());
            }
        });
    }
}
