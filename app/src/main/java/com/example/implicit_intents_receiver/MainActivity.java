package com.example.implicit_intents_receiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Intent intent = getIntent();
        Uri uri = intent.getData();

        if(uri != null) {
            String uri_string = "URI: " + uri.toString();

            TextView tv_uri_message = findViewById(R.id.tv_uri_message);
           tv_uri_message.setText(uri_string);
        }

    }
}
