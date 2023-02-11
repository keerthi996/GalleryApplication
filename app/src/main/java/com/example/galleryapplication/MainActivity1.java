package com.example.galleryapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity1 extends AppCompatActivity {
    int images[]={R.drawable.panda,R.drawable.cute_dog,R.drawable.cute_monkey,R.drawable.elephant,R.drawable.white_tiger,R.drawable.black_bird,R.drawable.black_bird,R.drawable.monkey,R.drawable.yellow_bird,R.drawable.tiger,R.drawable.cat2,R.drawable.dog1};
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        String imageName=getIntent().getStringExtra("name");
        Resources res=getResources();
        int imageId= res.getIdentifier(imageName,"drawable",getPackageName());
        ImageView iv=(ImageView)findViewById(R.id.image);
        iv.setImageResource(imageId);

    }
    public void changeBackgroundToNext(View view){
        ImageView iv=(ImageView)findViewById(R.id.image);
        iv.setImageResource(images[i]);
        i++;

        if(i==11)
            i=0;
    }
    public void changeBackgroundToPrev(View view){

        ImageView iv=(ImageView)findViewById(R.id.image);
        iv.setImageResource(images[i]);
        i--;

        if(i==0)
            i=11;
    }

}