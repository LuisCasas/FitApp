package com.luiscasas.flaborfit;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_ITEM_TITLE = "extra.item.title";
    public static final String EXERCISE_WEIGHTS = "Weight Lifting";
    public static final String EXERCISE_YOGA = "Yoga";
    public static final String EXERCISE_CARDIO = "Cardio";
    public static final String SETTINGS_TITLE = "Night Mode";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout weightBtn = (RelativeLayout)findViewById(R.id.weightBtn);
        RelativeLayout yogaBtn = (RelativeLayout)findViewById(R.id.yogaBtn);
        RelativeLayout cardioBtn = (RelativeLayout)findViewById(R.id.cardioBtn);
        RelativeLayout settingsBtn = (RelativeLayout)findViewById(R.id.settingsBtn);

        weightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadDetailActivity(MainActivity.EXERCISE_WEIGHTS);
            }
        });

        yogaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadDetailActivity(MainActivity.EXERCISE_YOGA);
            }
        });

        cardioBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadDetailActivity(MainActivity.EXERCISE_CARDIO);
            }
        });

        settingsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadSettingsActivity(MainActivity.SETTINGS_TITLE);
            }
        });

    }

    private void loadDetailActivity(String exerciseTitle){

        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        intent.putExtra(MainActivity.EXTRA_ITEM_TITLE, exerciseTitle);
        startActivity(intent);

    }

    private void loadSettingsActivity(String settingsTitle){

        Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
        intent.putExtra(MainActivity.EXTRA_ITEM_TITLE, settingsTitle);
        startActivity(intent);
    }
}
