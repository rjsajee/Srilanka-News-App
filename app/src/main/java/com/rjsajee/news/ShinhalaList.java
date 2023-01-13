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
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

public class ShinhalaList extends AppCompatActivity {
    private RewardedAd mRewardedAd;

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn10;
    Button btn11;
    Button btn12;
    Button btn13;
    Button btn14;
    Button btn15;


    String[] urls = new String[15];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shinhala_list);

        btn1=findViewById(R.id.tbtn1);
        btn2=findViewById(R.id.tbtn2);
        btn3=findViewById(R.id.tbtn3);
        btn4=findViewById(R.id.tbtn4);
        btn5=findViewById(R.id.tbtn5);
        btn6=findViewById(R.id.tbtn6);
        btn7=findViewById(R.id.tbtn7);
        btn8=findViewById(R.id.tbtn8);
        btn9=findViewById(R.id.tbtn9);
        btn10=findViewById(R.id.tbtn10);
        btn11=findViewById(R.id.tbtn11);
        btn12=findViewById(R.id.tbtn12);
        btn13=findViewById(R.id.tbtn13);
        btn14=findViewById(R.id.tbtn14);
        btn15=findViewById(R.id.tbtn15);




        urls[0]="https://www.dinamina.lk/";
        urls[1]="https://www.divaina.lk/";
        urls[2]="https://www.lankadeepa.lk";
        urls[3]="https://www.hirunews.lk/";
        urls[4]="https://www.lakbima.lk/";
        urls[5]="https://www.gossiplankanews.lk";
        urls[6]="https://www.adaderana.lk/";
        urls[7]="https://www.silumina.lk/";
        urls[8]="https://www.mawbima.lk";
        urls[9]="https://www.ada.lk/#";
        urls[10]="https://www.bbc.com/sinhala";
        urls[11]="https://www.lankaviews.lk";
        urls[12]="https://www.deshaya.lk/";
        urls[13]="https://www.vimasuma.com/";
        urls[14]="https://www.sinhala.news.lk/";


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = 1;
                setAds(a);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = 2;
                setAds(a);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = 3;
                setAds(a);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = 4;
                setAds(a);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = 5;
                setAds(a);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = 6;
                setAds(a);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = 7;
                setAds(a);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = 8;
                setAds(a);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = 9;
                setAds(a);
            }
        });

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = 10;
                setAds(a);
            }
        });

        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = 11;
                setAds(a);
            }
        });

        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = 12;
                setAds(a);
            }
        });

        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = 13;
                setAds(a);
            }
        });

        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = 14;
                setAds(a);
            }
        });

        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = 15;
                setAds(a);
            }
        });

//        intiate Reward Ad

        AdRequest adRequest = new AdRequest.Builder().build();
        RewardedAd.load(this,getString(R.string.adunitIdReward), adRequest, new RewardedAdLoadCallback() {
            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                // Handle the error.
                mRewardedAd = null;
            }

            @Override
            public void onAdLoaded(@NonNull RewardedAd rewardedAd) {
                mRewardedAd = rewardedAd;
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

    void setAds(final int a){
        if (mRewardedAd != null) {
            ShinhalaList activityContext = ShinhalaList.this;
            mRewardedAd.show(activityContext, new OnUserEarnedRewardListener() {
                @Override
                public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
                    // Handle the reward.
                    int rewardAmount = rewardItem.getAmount();
                    String rewardType = rewardItem.getType();
                }
            });

            mRewardedAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                @Override
                public void onAdDismissedFullScreenContent() {
                    super.onAdDismissedFullScreenContent();
                    if(a==1){
                        Intent intent=new Intent(getApplicationContext(), ShinhalaWeb.class);
                        intent.putExtra("links",urls[0]);
                        startActivity(intent);
                    }
                    else if(a==2) {
                        Intent intent=new Intent(getApplicationContext(), ShinhalaWeb.class);
                        intent.putExtra("links",urls[1]);
                        startActivity(intent);
                    }
                    else if(a==3) {
                        Intent intent=new Intent(getApplicationContext(), ShinhalaWeb.class);
                        intent.putExtra("links",urls[2]);
                        startActivity(intent);
                    }
                    else if(a==4) {
                        Intent intent=new Intent(getApplicationContext(), ShinhalaWeb.class);
                        intent.putExtra("links",urls[3]);
                        startActivity(intent);
                    }
                    else if(a==5) {
                        Intent intent=new Intent(getApplicationContext(), ShinhalaWeb.class);
                        intent.putExtra("links",urls[4]);
                        startActivity(intent);
                    }
                    else if(a==6) {
                        Intent intent=new Intent(getApplicationContext(), ShinhalaWeb.class);
                        intent.putExtra("links",urls[5]);
                        startActivity(intent);
                    }
                    else if(a==7) {
                        Intent intent=new Intent(getApplicationContext(), ShinhalaWeb.class);
                        intent.putExtra("links",urls[6]);
                        startActivity(intent);
                    }
                    else if(a==8) {
                        Intent intent=new Intent(getApplicationContext(), ShinhalaWeb.class);
                        intent.putExtra("links",urls[7]);
                        startActivity(intent);
                    }
                    else if(a==9) {
                        Intent intent=new Intent(getApplicationContext(), ShinhalaWeb.class);
                        intent.putExtra("links",urls[8]);
                        startActivity(intent);
                    }
                    else if(a==10) {
                        Intent intent=new Intent(getApplicationContext(), ShinhalaWeb.class);
                        intent.putExtra("links",urls[9]);
                        startActivity(intent);
                    }
                    else if(a==11) {
                        Intent intent=new Intent(getApplicationContext(), ShinhalaWeb.class);
                        intent.putExtra("links",urls[10]);
                        startActivity(intent);
                    }
                    else if(a==12) {
                        Intent intent=new Intent(getApplicationContext(), ShinhalaWeb.class);
                        intent.putExtra("links",urls[11]);
                        startActivity(intent);
                    }
                    else if(a==13) {
                        Intent intent=new Intent(getApplicationContext(), ShinhalaWeb.class);
                        intent.putExtra("links",urls[12]);
                        startActivity(intent);
                    }
                    else if(a==14) {
                        Intent intent=new Intent(getApplicationContext(), ShinhalaWeb.class);
                        intent.putExtra("links",urls[13]);
                        startActivity(intent);
                    }
                    else if(a==15) {
                        Intent intent=new Intent(getApplicationContext(), ShinhalaWeb.class);
                        intent.putExtra("links",urls[14]);
                        startActivity(intent);
                    }
                    mRewardedAd=null;
                }
            });
        }
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(this, Home.class));
    }
}