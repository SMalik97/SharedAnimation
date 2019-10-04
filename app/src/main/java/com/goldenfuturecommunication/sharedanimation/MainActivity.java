package com.goldenfuturecommunication.sharedanimation;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
CardView cardview;
ImageView img;
TextView txt1,txt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardview=(CardView)findViewById(R.id.cardview);
        img=(ImageView)findViewById(R.id.img);
        txt1=(TextView)findViewById(R.id.txt1);
        txt2=(TextView)findViewById(R.id.txt2);

        cardview.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),second_activity.class);

                Pair[]  pairs=new Pair[3];
                pairs[0]=new Pair<View,String>(img,"imgtransition");
                pairs[1]=new Pair<View,String>(txt1,"nametransition");
                pairs[2]=new Pair<View,String>(txt2,"descriptiontransition");
                    ActivityOptions options=ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,pairs);

                startActivity(i,options.toBundle());
            }
        });

    }
}
