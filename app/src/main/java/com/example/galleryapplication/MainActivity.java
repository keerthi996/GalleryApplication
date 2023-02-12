package com.example.galleryapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    String names[]={"panda","cute_dog","cute_monkey","elephant","white_tiger","black_bird","black_bird","monkey","yellow_bird","tiger","cat2","dog1"};
    String id[]={""};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void viewImage(View view ){
        int pos=-1;
        switch(view.getId()){
            case R.id.im1:
                pos=0;
                break;
            case R.id.im2:
                pos=1;
                break;
            case R.id.im3:
                pos=2;
                break;
            case R.id.im4:
                pos=3;
                break;
            case R.id.im5:
                pos=4;
                break;
            case R.id.im6:
                pos=5;
                break;
            case R.id.im7:
                pos=6;
                break;
            case R.id.im8:
                pos=7;
                break;
            case R.id.im9:
                pos=8;
                break;
            case R.id.im10:
                pos=9;
                break;
            case R.id.im11:
                pos=10;
                break;
            case R.id.im12:
                pos=11;
                break;
            case R.id.im13:
                pos=12;
                break;
        }
        Intent intent = new Intent(MainActivity.this,MainActivity1.class);
        intent.putExtra("name",names[pos]);
        intent.putExtra("position",pos);
        startActivity(intent);
    }
}