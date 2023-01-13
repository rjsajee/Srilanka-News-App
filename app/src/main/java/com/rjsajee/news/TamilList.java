package com.rjsajee.news;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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
import com.rjsajee.news.R;

public class TamilList extends AppCompatActivity {

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
    Button btn16;
    Button btn17;
    Button btn18;
    Button btn19;
    Button btn20;
    Button btn21;

    String[] urls = new String[21];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tamil_list);

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
        btn16=findViewById(R.id.tbtn16);
        btn17=findViewById(R.id.tbtn17);
        btn18=findViewById(R.id.tbtn18);
        btn19=findViewById(R.id.tbtn19);
        btn20=findViewById(R.id.tbtn20);
        btn21=findViewById(R.id.tbtn21);



        urls[0]="https://virakesari.lk/#";
        urls[1]="https://thinakkural.lk/#";
        urls[2]="https://thinakaran.lk";
        urls[3]="https://www.newuthayan.com/";
        urls[4]="https://www.valampurii.lk";
        urls[5]="https://www.bbc.com/tamil";
        urls[6]="https://www.tamilwin.com";
        urls[7]="https://www.jvpnews.com";
        urls[8]="https://www.eelanatham.net";
        urls[9]="https://www.athavannews.com";
        urls[10]="https://www.kathiravan.om";
        urls[11]="https://www.todayjaffna.com";
        urls[12]="https://www.meelparvai.net";
        urls[13]="https://www.battinaatham.net";
        urls[14]="https://www.srilankamuslim.lk";
        urls[15]="https://www.sooriyanfmnews.lk";
        urls[16]="https://www.newjaffna.com";
        urls[17]="https://www.karudannews.com";
        urls[18]="https://www.tamilcnn.lk";
        urls[19]="https://www.yarlosai.com";
        urls[20]="https://www.madawalanews.com";

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

        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = 16;
                setAds(a);
            }
        });

        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = 17;
                setAds(a);
            }
        });

        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = 18;
                setAds(a);
            }
        });

        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = 19;
                setAds(a);
            }
        });

        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = 20;
                setAds(a);
            }
        });

        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = 21;
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
            TamilList activityContext = TamilList.this;
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
                        Intent intent=new Intent(getApplicationContext(), TamilWeb.class);
                        intent.putExtra("links",urls[0]);
                        startActivity(intent);
                    }
                    else if(a==2) {
                        Intent intent=new Intent(getApplicationContext(), TamilWeb.class);
                        intent.putExtra("links",urls[1]);
                        startActivity(intent);
                    }
                    else if(a==3) {
                        Intent intent=new Intent(getApplicationContext(), TamilWeb.class);
                        intent.putExtra("links",urls[2]);
                        startActivity(intent);
                    }
                    else if(a==4) {
                        Intent intent=new Intent(getApplicationContext(), TamilWeb.class);
                        intent.putExtra("links",urls[3]);
                        startActivity(intent);
                    }
                    else if(a==5) {
                        Intent intent=new Intent(getApplicationContext(), TamilWeb.class);
                        intent.putExtra("links",urls[4]);
                        startActivity(intent);
                    }
                    else if(a==6) {
                        Intent intent=new Intent(getApplicationContext(), TamilWeb.class);
                        intent.putExtra("links",urls[5]);
                        startActivity(intent);
                    }
                    else if(a==7) {
                        Intent intent=new Intent(getApplicationContext(), TamilWeb.class);
                        intent.putExtra("links",urls[6]);
                        startActivity(intent);
                    }
                    else if(a==8) {
                        Intent intent=new Intent(getApplicationContext(), TamilWeb.class);
                        intent.putExtra("links",urls[7]);
                        startActivity(intent);
                    }
                    else if(a==9) {
                        Intent intent=new Intent(getApplicationContext(), TamilWeb.class);
                        intent.putExtra("links",urls[8]);
                        startActivity(intent);
                    }
                    else if(a==10) {
                        Intent intent=new Intent(getApplicationContext(), TamilWeb.class);
                        intent.putExtra("links",urls[9]);
                        startActivity(intent);
                    }
                    else if(a==11) {
                        Intent intent=new Intent(getApplicationContext(), TamilWeb.class);
                        intent.putExtra("links",urls[10]);
                        startActivity(intent);
                    }
                    else if(a==12) {
                        Intent intent=new Intent(getApplicationContext(), TamilWeb.class);
                        intent.putExtra("links",urls[11]);
                        startActivity(intent);
                    }
                    else if(a==13) {
                        Intent intent=new Intent(getApplicationContext(), TamilWeb.class);
                        intent.putExtra("links",urls[12]);
                        startActivity(intent);
                    }
                    else if(a==14) {
                        Intent intent=new Intent(getApplicationContext(), TamilWeb.class);
                        intent.putExtra("links",urls[13]);
                        startActivity(intent);
                    }
                    else if(a==15) {
                        Intent intent=new Intent(getApplicationContext(), TamilWeb.class);
                        intent.putExtra("links",urls[14]);
                        startActivity(intent);
                    }
                    else if(a==16) {
                        Intent intent=new Intent(getApplicationContext(), TamilWeb.class);
                        intent.putExtra("links",urls[15]);
                        startActivity(intent);
                    }
                    else if(a==17) {
                        Intent intent=new Intent(getApplicationContext(), TamilWeb.class);
                        intent.putExtra("links",urls[16]);
                        startActivity(intent);
                    }
                    else if(a==18) {
                        Intent intent=new Intent(getApplicationContext(), TamilWeb.class);
                        intent.putExtra("links",urls[17]);
                        startActivity(intent);
                    }
                    else if(a==19) {
                        Intent intent=new Intent(getApplicationContext(), TamilWeb.class);
                        intent.putExtra("links",urls[18]);
                        startActivity(intent);
                    }
                    else if(a==20) {
                        Intent intent=new Intent(getApplicationContext(), TamilWeb.class);
                        intent.putExtra("links",urls[19]);
                        startActivity(intent);
                    }
                    else if(a==21) {
                        Intent intent=new Intent(getApplicationContext(), TamilWeb.class);
                        intent.putExtra("links",urls[20]);
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
