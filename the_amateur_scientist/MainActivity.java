package com.tas.pesu.the_amateur_scientist;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button events;
    Button schedule;
    Button gallery;
    Button contact;
    Button notification;
    Button settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        events = (Button)findViewById(R.id.events);
        schedule = (Button)findViewById(R.id.schedule);
        gallery = (Button)findViewById(R.id.gallery);
        contact = (Button)findViewById(R.id.contact);
        notification = (Button)findViewById(R.id.notification);
        settings = (Button)findViewById(R.id.settings);

        final Intent eve = new Intent(this,Main2Activity.class);
        events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(eve);
            }
        });

        final Intent sch = new Intent(this,Main3Activity.class);
        schedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(sch);
            }
        });

        final Intent gal = new Intent(this,Main4Activity.class);
        gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(gal);
            }
        });

        final Intent con = new Intent(this,Main5Activity.class);
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(con);
            }
        });

        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://goo.gl/forms/NWdUfncwGONbj1P32"));
                startActivity(intent);
            }
        });

        final Intent notif = new Intent(this, Main7Activity.class);

        notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(notif);
            }
        });

    }
}

