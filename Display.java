package com.example.michaelwilliams.favoritescripture;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.content.Intent;
import android.widget.TextView;


public class Display extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        LinearLayout lView = new LinearLayout(this);

        Intent myIntent = getSupportParentActivityIntent();
        Bundle bundle = myIntent.getBundleExtra("scripture");

        String text = bundle.getString("scripture");
        TextView txtView = new TextView(this);
        txtView.setText(text);

        lView.addView(txtView);
        setContentView(lView);
    }

}
