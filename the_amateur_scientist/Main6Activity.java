package com.tas.pesu.the_amateur_scientist;

import android.Manifest;
import android.content.Intent;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main6Activity extends AppCompatActivity {

    private static final int MY_PERMISSIONS_REQUEST_SEND_SMS = 1;
    private static final int MY_PERMISSIONS_REQUEST_READ_PHONE_STATE = 1;



    Button sbt;
    EditText name;
    EditText number;
    EditText query;
    String msg;
    String snum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        sbt = (Button)findViewById(R.id.sbt);
        name = (EditText)findViewById(R.id.name);
        number = (EditText)findViewById(R.id.number);
        query = (EditText)findViewById(R.id.query);

        ActivityCompat.requestPermissions(this,
                new String[]{Manifest.permission.SEND_SMS,Manifest.permission.READ_PHONE_STATE},
                MY_PERMISSIONS_REQUEST_SEND_SMS);



        sbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                msg = name.getText().toString() + "\n" + number.getText().toString() + "\n" + query.getText().toString();
                snum = "9448314963";
                Intent intent = new Intent(getApplicationContext(), Main6Activity.class);
                SmsManager sms = SmsManager.getDefault();
                sms.sendTextMessage(snum,null,msg,null,null);

                Toast.makeText(Main6Activity.this, "Message sent successfully", Toast.LENGTH_SHORT).show();
            }
        });


    }

}
