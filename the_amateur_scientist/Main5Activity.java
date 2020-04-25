package com.tas.pesu.the_amateur_scientist;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Main5Activity extends AppCompatActivity {

    Button smsg;
    Button web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        smsg = (Button)findViewById(R.id.msg);
        web = (Button)findViewById(R.id.web);
        final Intent nint = new Intent(this, Main6Activity.class);

        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://pes.edu/theamateurscientist/contact/"));
                startActivity(intent);
            }
        });


        smsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(nint);
            }
        });
    }
}