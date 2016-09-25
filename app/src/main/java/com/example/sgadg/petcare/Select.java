package com.example.sgadg.petcare;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.facebook.Profile;

public class Select extends AppCompatActivity {
    String fname;
    String lname;
    String id;
    String profPic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);
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
        Intent intent = getIntent();
        fname = intent.getStringExtra("fname");
        lname = intent.getStringExtra("lname");
        id = intent.getStringExtra("id");
        profPic = intent.getStringExtra("profPic");
        TextView welcome = (TextView) findViewById(R.id.welcome);
        welcome.setText("Welcome to Pet Care, " + fname + "!/nAre you a user or a host?");
    }

    public void launchUser(View view) {
        Intent userIntent = new Intent(Select.this, UserSignUp.class);
        userIntent.putExtra("id", id);
        userIntent.putExtra("fname", fname);
        userIntent.putExtra("lname", lname);
        userIntent.putExtra("profPic", profPic);
        startActivity(userIntent);
    }

    public void launchHost(View view) {
        Intent hostIntent = new Intent(Select.this, HostSignUp.class);
        hostIntent.putExtra("id", id);
        hostIntent.putExtra("fname", fname);
        hostIntent.putExtra("lname", lname);
        hostIntent.putExtra("profPic", profPic);
        startActivity(hostIntent);
    }
}
