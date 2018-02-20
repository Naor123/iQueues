package com.example.naorhen12.iqueues;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;

public class DriverMainScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_main);

        ArrayList<String> time_per_day  = new ArrayList<>();
        time_per_day.add("08:00 - 08:30");
        time_per_day.add("08:30 - 09:00");
        time_per_day.add("09:00 - 09:30");
        time_per_day.add("09:30 - 10:00");
        time_per_day.add("10:00 - 10:30");
        time_per_day.add("10:30 - 11:00");
        time_per_day.add("11:00 - 11:30");
        time_per_day.add("11:30 - 12:00");
        time_per_day.add("12:00 - 12:30");
        time_per_day.add("12:30 - 13:00");
        time_per_day.add("13:00 - 13:30");
        time_per_day.add("13:30 - 14:00");
        time_per_day.add("14:00 - 14:30");
        time_per_day.add("14:30 - 15:00");
        time_per_day.add("15:00 - 15:30");
        time_per_day.add("15:30 - 16:00");
        time_per_day.add("16:30 - 17:00");


        Button dateBtn = findViewById(R.id.date_btn);
        Button statBtn= findViewById(R.id.stat_btn);
        TextView inputTv = findViewById(R.id.text_input);

        dateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Calendar calendar = Calendar.getInstance();
                int year = calendar.get(Calendar.YEAR);
                int month = calendar.get(Calendar.MONTH);
                int day = calendar.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dpd = new DatePickerDialog(DriverMainScreen.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {

                    }
                },year,month,day);
                    dpd.show();
            }
        });




    }
}
