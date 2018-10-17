package com.example.mrmoize.vetlinc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SetUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup);
    }

    public void loadMain(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
//        setContentView(R.layout.activity_main);
    }

    public void loadProv(View view){
        Intent intent = new Intent(this, ProviderInfo.class);
        startActivity(intent);
//        setContentView(R.layout.activity_provider_info);
    }

}
