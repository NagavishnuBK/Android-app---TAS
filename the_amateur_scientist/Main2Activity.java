package com.tas.pesu.the_amateur_scientist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.net.Uri;

public class Main2Activity extends AppCompatActivity {

    Button e1;
    Button e2;
    Button e3;
    Button e4;
    Button e5;
    Button e6;
    Button e7;
    Button e8;
    Button e9;
    Button e10;
    Button e11;
    Button e12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        e1 = (Button)findViewById(R.id.e1);
        e2 = (Button)findViewById(R.id.e2);
        e3 = (Button)findViewById(R.id.e3);
        e4 = (Button)findViewById(R.id.e4);
        e5 = (Button)findViewById(R.id.e5);
        e6 = (Button)findViewById(R.id.e6);
        e7 = (Button)findViewById(R.id.e7);
        e8 = (Button)findViewById(R.id.e8);
        e9 = (Button)findViewById(R.id.e9);
        e10 = (Button)findViewById(R.id.e10);
        e11 = (Button)findViewById(R.id.e11);
        e12 = (Button)findViewById(R.id.e12);

        e1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://pes.edu/theamateurscientist/tas/competition/science-project/"));
                startActivity(intent);
            }
        });

        e2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://pes.edu/theamateurscientist/tas/competition/model-making/"));
                startActivity(intent);
            }
        });

        e3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://pes.edu/theamateurscientist/tas/competition/quiz/"));
                startActivity(intent);
            }
        });

        e4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://pes.edu/theamateurscientist/tas/competition/the-amazing-race/"));
                startActivity(intent);
            }
        });

        e5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://pes.edu/theamateurscientist/tas/competition/ideathon"));
                startActivity(intent);
            }
        });

        e6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://pes.edu/theamateurscientist/tas/competition/uv-painting/"));
                startActivity(intent);
            }
        });

        e7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://pes.edu/theamateurscientist/tas/competition/inquisitors-trials/"));
                startActivity(intent);
            }
        });

        e8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://pes.edu/theamateurscientist/codewars/"));
                startActivity(intent);
            }
        });

        e9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://pes.edu/theamateurscientist/psych/"));
                startActivity(intent);
            }
        });

        e10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://pes.edu/theamateurscientist/blogger/"));
                startActivity(intent);
            }
        });

        e11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://pes.edu/theamateurscientist/fun-fair/"));
                startActivity(intent);
            }
        });

        e12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://pes.edu/theamateurscientist/tas/competition/facebook-events/"));
                startActivity(intent);
            }
        });


    }
}
