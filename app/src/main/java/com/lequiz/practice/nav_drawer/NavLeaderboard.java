package com.lequiz.practice.nav_drawer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import com.lequiz.practice.adapters.NavLeaderboardWord;
import com.lequiz.practice.adapters.NavLeaderboardWordAdapter;
import com.lequiz.practice.base.FullScreenStatusOnly;
import com.lequiz.practice.R;

import java.util.ArrayList;
import java.util.Objects;

public class NavLeaderboard extends AppCompatActivity {

    protected Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav_leaderboard);


        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_back_arrow_ramu);
        // for status bar color
        FullScreenStatusOnly fullScreenStatusOnly = new FullScreenStatusOnly(this);


        ArrayList<NavLeaderboardWord> leaderboardWords = new ArrayList<>();
        leaderboardWords.add(new NavLeaderboardWord(R.drawable.ramshek,"Ramshek Rama",100000,1));
        leaderboardWords.add(new NavLeaderboardWord(R.drawable.profile_image,"Rishabh Raj",15500,2));
        leaderboardWords.add(new NavLeaderboardWord(R.drawable.reasoning,"Mithlesh Arya",12000,4));
        leaderboardWords.add(new NavLeaderboardWord(R.drawable.current_affairs,"Jyotsana Devi",2000,5));
        leaderboardWords.add(new NavLeaderboardWord(R.drawable.computer,"Rashi Bhabhi",2020,9));
        leaderboardWords.add(new NavLeaderboardWord(R.drawable.mathematics,"Botali Devi",1500,10));
        leaderboardWords.add(new NavLeaderboardWord(R.drawable.general_science,"Suraj Soni",1200,16));
        leaderboardWords.add(new NavLeaderboardWord(R.drawable.technology,"Mithlesh Ranaji",1000,14));
        leaderboardWords.add(new NavLeaderboardWord(R.drawable.special,"Akshay Cha",900,13));
        leaderboardWords.add(new NavLeaderboardWord(R.drawable.sport,"Bull ",850,11));
        leaderboardWords.add(new NavLeaderboardWord(R.drawable.computer,"Ramshek Rama",810,17));
        leaderboardWords.add(new NavLeaderboardWord(R.drawable.mathematics,"Ramshek Rama",800,18));
        leaderboardWords.add(new NavLeaderboardWord(R.drawable.technology,"Ramshek Rama",750,19));
        leaderboardWords.add(new NavLeaderboardWord(R.drawable.profile_image,"Ramshek Rama",700,21));


        NavLeaderboardWordAdapter leaderboardWordAdapter = new NavLeaderboardWordAdapter(this,leaderboardWords);

        ListView listView = findViewById(R.id.leaderboard_list_view);

        listView.setAdapter(leaderboardWordAdapter);


    }
}
