package com.example.michaelwilliams.favoritescripture;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Display;
import android.widget.EditText;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button subbutton;
    EditText book, chap, verse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        subbutton = (Button) findViewById(R.id.button);
        subbutton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        handleButtonClick(v);
    }

    public void handleButtonClick(View v) {
        Intent intent = new Intent(this, Display.class);

        book = (EditText) findViewById(R.id.book1);
        chap = (EditText) findViewById(R.id.chap1);
        verse = (EditText) findViewById(R.id.verse1);
        String scripture = "Your favorite scripture is found in " + book + " " + chap + ":" + verse;

        intent.putExtra("scripture", scripture);

        startActivity(intent);
    }
}
