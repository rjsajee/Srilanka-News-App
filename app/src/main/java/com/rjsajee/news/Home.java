package com.rjsajee.news;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


public class Home extends AppCompatActivity {



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

                Intent int1=new Intent(Home.this, TamilList.class);
                startActivity(int1);
            }
        });

        Sinhala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int2=new Intent(Home.this, ShinhalaList.class);
                startActivity(int2);
            }
        });

        English.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int3=new Intent(Home.this, EnglishList.class);
                startActivity(int3);
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
