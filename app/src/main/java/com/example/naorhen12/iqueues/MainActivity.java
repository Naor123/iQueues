package com.example.naorhen12.iqueues;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
//goes to sign-up activity
   public void signingIn(View view) {


       Intent i = new Intent(this,SignUpProcess.class);
       startActivity(i);
   }
   //goes to log-in activity.
   public void loggingIn(View v)
   {
       //Intent i = new Intent()
   }
}
