package com.example.lgnote.myapplication1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class ListActivity extends AppCompatActivity {
    private Spinner yearSpinner;
    private ArrayAdapter yearAdapter;
    private Spinner semesterSpinner;
    private ArrayAdapter semesterAdapter;
    private Spinner selectSpinner;
    private ArrayAdapter selectAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        yearSpinner = (Spinner) findViewById(R.id.yearspinner);
        yearAdapter = ArrayAdapter.createFromResource(
                this, R.array.year, android.R.layout.simple_spinner_item);
        yearAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        yearSpinner.setAdapter(yearAdapter);

        semesterSpinner = (Spinner) findViewById(R.id.semesterspinner);
        semesterAdapter = ArrayAdapter.createFromResource(
                this, R.array.semester, android.R.layout.simple_spinner_item);
        semesterAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        semesterSpinner.setAdapter(semesterAdapter);

        selectSpinner = (Spinner) findViewById(R.id.selectspinner);
        selectAdapter = ArrayAdapter.createFromResource(
                this, R.array.select, android.R.layout.simple_spinner_item);
        selectAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        selectSpinner.setAdapter(selectAdapter);

    }



}




