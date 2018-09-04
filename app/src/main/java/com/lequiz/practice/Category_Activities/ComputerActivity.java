package com.lequiz.practice.Category_Activities;

import android.content.Intent;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.lequiz.practice.R;

import java.util.Objects;

public class ComputerActivity extends AppCompatActivity {

     Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer);

        toolbar = findViewById(R.id.computer_toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.back_button_computer);

        // Gradient Heading
        // Heading TextView gradient

        TextView learnHeaderTech = findViewById(R.id.heading_on_computer);
        Shader textShader = new LinearGradient(0, 0, 180, 0,
                new int[]{getResources().getColor(R.color.greenOnComputer), getResources().getColor(R.color.blueOnComputer)},
                new float[]{0, 1}, Shader.TileMode.CLAMP);
        learnHeaderTech.getPaint().setShader(textShader);

        // Hey UserName Initialization on learn section
//
//        TextView heyUserName = findViewById(R.id.hey_user_name);
//        String heyUserNameMaker = "Hey "+getString(R.string.user_first_name)+",";
//        heyUserName.setText(heyUserNameMaker);



         CardView startQuiz = findViewById(R.id.start_CardView_of_computer_quiz);
         startQuiz.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 startActivity(new Intent(ComputerActivity.this,ComputerQuiz.class));
             }
         });
    }



}