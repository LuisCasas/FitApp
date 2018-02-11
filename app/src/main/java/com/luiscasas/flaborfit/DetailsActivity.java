package com.luiscasas.flaborfit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView exerciseView = (TextView)findViewById(R.id.exerciseTitle);
        ImageView exerciseImg = (ImageView)findViewById(R.id.exerciseImg);
    }
}
