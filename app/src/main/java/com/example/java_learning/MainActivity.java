package com.example.java_learning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView HeaderView;
    private ListView ListViewData;
    private Button btnViewInfo;
    private String UrlViewInfo = "https://github.com/NanthawatKTY/Practice_Kotlin/tree/master";

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
                TestSetTxt("Pratu");
                PlayClickViewSound();
                OpenWeb();
            }
        });
    // Main met created
    }

    private void TestSetTxt(String headerTxt){
        HeaderView.setText(headerTxt);
    } //Func SetText

    private void PlayClickViewSound(){
        MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.mouse_click);
        mediaPlayer.start();
    } //Func PlaySound

    private void OpenWeb(){
        Intent intentToWebInfo = new Intent(Intent.ACTION_VIEW);
        intentToWebInfo.setData(Uri.parse(UrlViewInfo));        //String URL uses parse()
        startActivity(intentToWebInfo);
    } // Func OpenWeb
}