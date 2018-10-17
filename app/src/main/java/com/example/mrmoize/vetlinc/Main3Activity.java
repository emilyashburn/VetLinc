package com.example.mrmoize.vetlinc;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    String phone, web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        setFields();
    }

    public void setFields() {
        TextView[] labels = {(TextView) findViewById(R.id.link1Label),
                (TextView) findViewById(R.id.link2Label), (TextView) findViewById(R.id.link3Label)};

        Button[] callButtons = {(Button) findViewById(R.id.link1CallButton),
                (Button) findViewById(R.id.link2CallButton),
                (Button) findViewById(R.id.link3CallButton)};

        Button[] webButtons = {(Button) findViewById(R.id.link1WebButton),
                (Button) findViewById(R.id.link2WebButton),
                (Button) findViewById(R.id.link3WebButton)};

        labels[0].setText("Weaver House Night Shelter");
        labels[1].setText("Room at the Inn of Triad");
        labels[2].setText("The Servant Center");
        phone = "3365532665";
        web = "http://www.greensborourbanministry.com";
    }

    public void surf(View view) {
        Uri uri = Uri.parse(web);
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void call(View view) {

    }
}