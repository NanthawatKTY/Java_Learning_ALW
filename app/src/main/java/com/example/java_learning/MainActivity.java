package com.example.java_learning;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView HeaderView;
    private ListView ListViewData;
    private Button btnViewInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HeaderView = findViewById(R.id.textViewHeader);
        ListViewData = findViewById(R.id.characterList);
        btnViewInfo = findViewById(R.id.btnViewInfo);

        btnViewInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HeaderView.setText("Test clicking");

                MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.mouse_click);
                mediaPlayer.start();
            }

        });
    }
}