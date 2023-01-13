package com.rjsajee.news;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

import com.rjsajee.news.R;

public class TamilWeb extends AppCompatActivity {

        WebView myweb;

    @Override
    public void onBackPressed() {
        startActivity(new Intent(this, TamilList.class));

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tamil_web);

        myweb=findViewById(R.id.mytamilweb);

        Intent intent=getIntent();
        String webSite=intent.getStringExtra("links");

        myweb.setWebViewClient(new WebViewClient());
        myweb.loadUrl(webSite);

        WebSettings webSettings=myweb.getSettings();
        webSettings.setJavaScriptEnabled(true);


    }
}
