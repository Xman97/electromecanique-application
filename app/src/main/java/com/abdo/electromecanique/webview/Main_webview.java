package com.abdo.electromecanique.webview;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.abdo.electromecanique.R;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class Main_webview extends AppCompatActivity {
    WebView webView;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_webview);


        //رسالة تظهر مع تشغيل التطبيق
        Toast.makeText(this,("create by melki-abdelatif"),Toast.LENGTH_LONG).show();

        // اعدادات webView
        webView =(WebView)findViewById(R.id.webView);
        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(Configs.WEBSITE_PATH);

        Toast.makeText(this,("جاري تحميل الصفحة....."),Toast.LENGTH_LONG).show();

        webView.setWebViewClient(new WebViewClient() {
            public void onPageFinished(WebView view, String url) {

            }});


    }
}
