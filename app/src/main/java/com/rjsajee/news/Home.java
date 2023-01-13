package com.rjsajee.news;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;


public class Home extends AppCompatActivity {
    private AdView mAdView;
    private InterstitialAd mInterstitialAd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



        Button Tamil =(Button)findViewById(R.id.Tamil);
        Button Sinhala =(Button)findViewById(R.id.Shinhala);
        Button English =(Button)findViewById(R.id.English);



        Tamil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mInterstitialAd != null){
                    mInterstitialAd.show(Home.this);

                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            super.onAdDismissedFullScreenContent();
                            Intent int1 = new Intent(Home.this, TamilList.class);
                            startActivity(int1);
                            mInterstitialAd=null;
                        }
                    });
                }
                else {
                    Intent int1 = new Intent(Home.this, TamilList.class);
                    startActivity(int1);
                }
            }
        });

        Sinhala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mInterstitialAd != null){
                    mInterstitialAd.show(Home.this);

                    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            super.onAdDismissedFullScreenContent();
                            Intent int2=new Intent(Home.this, ShinhalaList.class);
                            startActivity(int2);
                            mInterstitialAd=null;
                        }
                    });
                }
                else {
                    Intent int2=new Intent(Home.this, ShinhalaList.class);
                    startActivity(int2);
                }
            }
        });

        English.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    if(mInterstitialAd != null){
                        mInterstitialAd.show(Home.this);

                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                            @Override
                            public void onAdDismissedFullScreenContent() {
                                super.onAdDismissedFullScreenContent();
                                Intent int3=new Intent(Home.this, EnglishList.class);
                                startActivity(int3);
                                mInterstitialAd=null;
                            }
                        });
                    }
                    else {
                        Intent int3=new Intent(Home.this, EnglishList.class);
                        startActivity(int3);
                    }
                }
        });

//        Banner Ad
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

//        Interstitial Ad

        InterstitialAd.load(this,getString(R.string.adunitIdInterstitial), adRequest, new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        // The mInterstitialAd reference will be null until
                        // an ad is loaded.
                        mInterstitialAd = interstitialAd;
                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error
                        mInterstitialAd = null;
                    }
                });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return  super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){

            case R.id.share:
                Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                String shareBody = "Your Body Here";
                String shareSubject = "Your Subject Here";

                sharingIntent.putExtra(Intent.EXTRA_TEXT,shareBody);
                sharingIntent.putExtra(Intent.EXTRA_SUBJECT,shareSubject);

                startActivity(Intent.createChooser(sharingIntent, "Share Using"));

                break;

        }
        return super.onOptionsItemSelected(item);
    }
}
