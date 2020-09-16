package com.rjsajee.news;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

import com.rjsajee.news.R;

public class ShinhalaWeb extends AppCompatActivity {

    WebView myweb;

    @Override
    public void onBackPressed() {
        if(myweb.canGoBack()){
            myweb.goBack();
        }
        else{
            super.onBackPressed();
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shinhala_web);

        myweb=findViewById(R.id.myshinhalaweb);

        Intent intent=getIntent();
        String webSite=intent.getStringExtra("links");

        myweb.setWebViewClient(new WebViewClient());
        myweb.loadUrl(webSite);

        WebSettings webSettings=myweb.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}
