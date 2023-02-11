package com.example.galleryapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity1 extends AppCompatActivity {
    int images[]={R.drawable.cat,R.drawable.cat1,R.drawable.cat2,R.drawable.dog,R.drawable.dog1,R.drawable.dog2,R.drawable.camel,R.drawable.camel1,R.drawable.camel2,R.drawable.horse,R.drawable.horse1,R.drawable.horse2,R.drawable.parrot,R.drawable.bird,R.drawable.blue_bird,R.drawable.rabbit,R.drawable.tiger,R.drawable.white_tiger};
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

        if(i==17)
            i=0;
    }
    public void changeBackgroundToPrev(View view){

        ImageView iv=(ImageView)findViewById(R.id.image);
        iv.setImageResource(images[i]);
        i--;

        if(i==0)
            i=17;
    }

}