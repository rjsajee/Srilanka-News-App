package com.rjsajee.news;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class ShinhalaList extends AppCompatActivity {

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




        urls[0]="http://www.dinamina.lk/";
        urls[1]="http://www.divaina.lk/";
        urls[2]="http://www.lankadeepa.lk";
        urls[3]="http://www.hirunews.lk/";
        urls[4]="http://www.lakbima.lk/";
        urls[5]="http://www.gossiplankanews.lk";
        urls[6]="http://www.adaderana.lk/";
        urls[7]="http://www.silumina.lk/";
        urls[8]="http://www.mawbima.lk";
        urls[9]="http://www.ada.lk/#";
        urls[10]="http://www.bbc.com/sinhala";
        urls[11]="http://www.lankaviews.lk";
        urls[12]="http://www.deshaya.lk/";
        urls[13]="http://www.vimasuma.com/";
        urls[14]="http://www.sinhala.news.lk/";


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), ShinhalaWeb.class);
                intent.putExtra("links",urls[0]);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), ShinhalaWeb.class);
                intent.putExtra("links",urls[1]);
                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), ShinhalaWeb.class);
                intent.putExtra("links",urls[2]);
                startActivity(intent);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), ShinhalaWeb.class);
                intent.putExtra("links",urls[3]);
                startActivity(intent);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), ShinhalaWeb.class);
                intent.putExtra("links",urls[4]);
                startActivity(intent);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), ShinhalaWeb.class);
                intent.putExtra("links",urls[5]);
                startActivity(intent);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), ShinhalaWeb.class);
                intent.putExtra("links",urls[6]);
                startActivity(intent);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), ShinhalaWeb.class);
                intent.putExtra("links",urls[7]);
                startActivity(intent);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), ShinhalaWeb.class);
                intent.putExtra("links",urls[8]);
                startActivity(intent);
            }
        });

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), ShinhalaWeb.class);
                intent.putExtra("links",urls[9]);
                startActivity(intent);
            }
        });

        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), ShinhalaWeb.class);
                intent.putExtra("links",urls[10]);
                startActivity(intent);
            }
        });

        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), ShinhalaWeb.class);
                intent.putExtra("links",urls[11]);
                startActivity(intent);
            }
        });

        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), ShinhalaWeb.class);
                intent.putExtra("links",urls[12]);
                startActivity(intent);
            }
        });

        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), ShinhalaWeb.class);
                intent.putExtra("links",urls[13]);
                startActivity(intent);
            }
        });

        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), ShinhalaWeb.class);
                intent.putExtra("links",urls[14]);
                startActivity(intent);
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