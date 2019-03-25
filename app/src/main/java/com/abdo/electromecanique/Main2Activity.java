package com.abdo.electromecanique;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.abdo.electromecanique.pdf.main_pdfview;
import com.abdo.electromecanique.video.main_youtube;
import com.abdo.electromecanique.webview.Main_webview;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void listView1(View view) {
        Intent pdfview2 = new Intent(this , main_pdfview.class);
        startActivity(pdfview2);
    }

    public void youtubeview1(View view) {
        Intent youtubeview2 = new Intent(this, main_youtube.class);
        startActivity(youtubeview2);
    }

    public void webview1(View view) {
        Intent webview2 = new Intent(this, Main_webview.class);
        startActivity(webview2);
    }
}
