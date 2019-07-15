package com.example.parkingbookingsystemapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mapactivity extends AppCompatActivity {

    Button btnmap;
    String uri ="geo:0,0?q=india";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapactivity);

        btnmap = (Button) findViewById(R.id.btnMap);
        btnmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse(uri);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW,gmmIntentUri);
                 mapIntent.setPackage("com.google.andriod.gms.maps");
                 if (mapIntent.resolveActivity(getPackageManager())!=null){
                     startActivity(mapIntent);
                 }

            }
        });

    }
}
