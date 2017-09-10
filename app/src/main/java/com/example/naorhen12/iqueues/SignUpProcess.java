package com.example.naorhen12.iqueues;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;

public class SignUpProcess extends AppCompatActivity {

    private DatabaseReference Mdbref;
    private TextView myTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_process);
       // Mdbref = FirebaseDatabase.getInstance().getReference().child("Name");
//        myTxt = (TextView) findViewById(R.id.myTxt);
//        Mdbref.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                String name = dataSnapshot.getValue().toString();
//               // myTxt.setText(name);
//            }
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//
//            }
//        });


    }
}
