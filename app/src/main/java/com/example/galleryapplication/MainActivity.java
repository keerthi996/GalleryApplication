package com.example.galleryapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    String names[]={"cat","cat1","cat2","dog","dog1","dog2","camel","camel1","camel2","horse","horse1","horse2","parrot","bird","blue_bird","rabbit","tiger","white_tiger"};
    String id[]={""};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void viewImage(View view ){
        int pos=-1;
        switch(view.getId()){
            case R.id.b1:
                pos=0;
                break;
            case R.id.b2:
                pos=1;
                break;
            case R.id.b3:
                pos=2;
                break;
            case R.id.b4:
                pos=3;
                break;
            case R.id.b5:
                pos=4;
                break;
            case R.id.b6:
                pos=5;
                break;
            case R.id.b7:
                pos=6;
                break;
            case R.id.b8:
                pos=7;
                break;
            case R.id.b9:
                pos=8;
                break;
            case R.id.b10:
                pos=9;
                break;
            case R.id.b11:
                pos=10;
                break;
            case R.id.b12:
                pos=11;
                break;
            case R.id.b13:
                pos=12;
                break;
            case R.id.b14:
                pos=13;
                break;
            case R.id.b15:
                pos=14;
                break;
            case R.id.b16:
                pos=15;
                break;
            case R.id.b17:
                pos=16;
                break;
            case R.id.b18:
                pos=17;
                break;
        }
        Intent intent = new Intent(MainActivity.this,MainActivity1.class);
        intent.putExtra("name",names[pos]);
        intent.putExtra("position",pos);
        startActivity(intent);
    }
}