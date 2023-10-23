package com.qwwwest.templatesample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.qwwwest.templatesample.a01_layout.L01_LinearActivity;
import com.qwwwest.templatesample.a01_layout.L02_FrameActivity;
import com.qwwwest.templatesample.a01_layout.L03_RelativeActivity;

public class HomeActivity extends AppCompatActivity {

    /* Personnel */
    Button btnLinearLayout, btnFrameLayout, btnRelativeLayout;

// 2. methode init pour l'init des widgets.
    public void initUI(){
        btnLinearLayout = findViewById(R.id.btn_linear_layout);
        btnFrameLayout = findViewById(R.id.btn_frame_layout);
        btnRelativeLayout = findViewById(R.id.btn_relative_layout);
    }

    public void setButtons() {
        btnLinearLayout.setOnClickListener(new View.OnClickListener() {
                                               @Override
                                               public void onClick(View v) {

                                                   startActivity( new Intent(HomeActivity.this, L01_LinearActivity.class));

                                               }
                                           }
        );
        btnFrameLayout.setOnClickListener(new View.OnClickListener() {
                                               @Override
                                               public void onClick(View v) {

                                                   startActivity( new Intent(HomeActivity.this, L02_FrameActivity.class));
                                               }
                                           }
        );
        btnRelativeLayout.setOnClickListener(new View.OnClickListener() {
                                               @Override
                                               public void onClick(View v) {

                                                   startActivity( new Intent(HomeActivity.this, L03_RelativeActivity.class));
                                               }
                                           }
        );
    }



    /* Life Cycle */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        initUI();
        setButtons();
    }
}