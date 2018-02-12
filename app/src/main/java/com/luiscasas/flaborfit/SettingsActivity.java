package com.luiscasas.flaborfit;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.Switch;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        final ConstraintLayout background = (ConstraintLayout)findViewById(R.id.settingsBG);
        final Switch nightMode = (Switch)findViewById(R.id.switchBtn);

        nightMode.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    background.setBackgroundColor(Color.parseColor("#555555"));
                    nightMode.setText("Off");
                } else {
                    background.setBackgroundColor(Color.parseColor("#DDDDDD"));
                    nightMode.setText("On");
                }
            }
        });
    }
}
