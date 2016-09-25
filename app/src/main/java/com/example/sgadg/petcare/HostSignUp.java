package com.example.sgadg.petcare;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class HostSignUp extends AppCompatActivity {
    String fname;
    String lname;
    String id;
    String profPic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_host_sign_up);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        Intent hostIntent = getIntent();
        fname = hostIntent.getStringExtra("fname");
        lname = hostIntent.getStringExtra("lname");
        id = hostIntent.getStringExtra("id");
        profPic = hostIntent.getStringExtra("profPic");
        TextView t = (TextView)findViewById(R.id.host_welcome);
        t.setText("Hi " + fname + ". Please enter your info.");
        Uri profPicUri = Uri.parse(profPic);
    }

}
