package com.example.kraikar.memecreator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements TopSectionFragment.TopSectionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void createMeme(String top, String bottom) {
        BottomSegmentFragment bottomSegmentFragment = (BottomSegmentFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentBottom);
        bottomSegmentFragment.setMemeText(top, bottom);
    }
}
