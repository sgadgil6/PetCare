package com.example.sgadg.petcare;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class UserSignUp extends AppCompatActivity {
    String fname;
    String lname;
    String id;
    String profPic;
    String bio;
    String address;
    String city;
    Map<String, Integer> pets;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_sign_up);
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
        Intent userIntent = getIntent();
        fname = userIntent.getStringExtra("fname");
        lname = userIntent.getStringExtra("lname");
        id = userIntent.getStringExtra("id");
        profPic = userIntent.getStringExtra("profPic");
        t = (TextView)findViewById(R.id.user_welcome);
        t.setText("Hi " + fname + ". Please enter your info.");

    }

    public void submitUserProfile() {
        DatabaseReference ref = FirebaseDatabase.getInstance().getReference();
        address = ((EditText)findViewById(R.id.user_address)).getText().toString();
        city = ((EditText)findViewById(R.id.user_city)).getText().toString();
        bio = ((EditText)findViewById(R.id.user_bio)).getText().toString();
        HashMap<String, Integer> temp = new HashMap<>();
        temp.put("Dogs", Integer.parseInt(((EditText)findViewById(R.id.num_dogs)).getText().toString()));
        temp.put("Cats", Integer.parseInt(((EditText)findViewById(R.id.num_Cats)).getText().toString()));
        temp.put("Horses", Integer.parseInt(((EditText)findViewById(R.id.num_horses)).getText().toString()));
        pets = temp;
        User newUser = new User(fname, lname, address, city, profPic, bio, pets);
        ref.child("users").child(id).setValue(newUser);
    }

}
