package com.tas.pesu.the_amateur_scientist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Main7Activity extends AppCompatActivity {

    TextView notif;
    DatabaseReference ndb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        notif = (TextView)findViewById(R.id.notif);
        ndb = FirebaseDatabase.getInstance("https://theamateurscientist-591ee.firebaseio.com/").getReference().child("Text");

        ndb.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String nat = dataSnapshot.getValue().toString();
                notif.setText(nat);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
}
