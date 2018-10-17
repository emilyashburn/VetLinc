package com.example.mrmoize.vetlinc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public class ProviderInfo extends AppCompatActivity {
//    String[] categories = {"Job", "Community", "Health", "Food", "Utilities", "Shelter"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provider_info);
    }

//    public void addData(View view) {
//        EditText[] textFields = {(EditText) findViewById(R.id.nameTextField),
//                (EditText) findViewById(R.id.phoneTextField),
//                (EditText) findViewById(R.id.websiteTextField)};
//
//        Spinner typeSpinner = (Spinner) findViewById(R.id.typeSpinner);
//
//
//    }
    public void submit(View view){
        Intent intent = new Intent(this, SetUpActivity.class);
        startActivity(intent);
        setContentView(R.layout.activity_setup);
    }
}
