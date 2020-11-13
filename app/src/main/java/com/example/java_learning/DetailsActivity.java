package com.example.java_learning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    private ImageView imageCharacterShow;
    private TextView textNameDetailShow, textDetailPageShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        imageCharacterShow = findViewById(R.id.imageCharacter);
        textNameDetailShow = findViewById(R.id.textNameDetail);
        textDetailPageShow = findViewById(R.id.textDetailPage);

        String StrName = getIntent().getStringExtra("Name");
        textNameDetailShow.setText(StrName);

        String StrDetail = getIntent().getStringExtra("Detail");
        textDetailPageShow.setText(StrDetail);

        int IntPic = getIntent().getIntExtra("Pic", R.drawable.kakashi_hatake);
        imageCharacterShow.setImageResource(IntPic);
    }
}