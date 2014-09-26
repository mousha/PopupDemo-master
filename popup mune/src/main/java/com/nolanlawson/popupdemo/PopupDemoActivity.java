package com.nolanlawson.popupdemo;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.PopupWindow;

public class PopupDemoActivity extends Activity {
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button button1 = (Button) findViewById(android.R.id.button1);
        Button button2 = (Button) findViewById(android.R.id.button2);
        Button button3 = (Button) findViewById(android.R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);




        button1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                PopupWindow window = PopupHelper.newBasicPopupWindow(PopupDemoActivity.this);

                LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);

                View popupView = inflater.inflate(R.layout.popup, null);

                window.setContentView(popupView);
                window.setAnimationStyle(R.style.Animations_GrowFromBottomRight);
                window.showAtLocation(v, 50, 150, 600);


            }
        });


        button2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                PopupWindow window = PopupHelper.newBasicPopupWindow(PopupDemoActivity.this);

                LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);

                View popupView = inflater.inflate(R.layout.popup, null);

                window.setContentView(popupView);
                window.setAnimationStyle(R.style.Animations_PopDownMenuRight);
                window.showAtLocation(v, 40, 60, 220);


            }
        });





        button3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                PopupWindow window = PopupHelper.newBasicPopupWindow(PopupDemoActivity.this);

                LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);

                View popupView = inflater.inflate(R.layout.popup, null);

                window.setContentView(popupView);
                window.setAnimationStyle(R.style.ZoomDialogAnim);
                window.showAtLocation(v,40,10,400);


            }
        });




        button4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                PopupWindow window = PopupHelper.newBasicPopupWindow(PopupDemoActivity.this);

                LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);

                View popupView = inflater.inflate(R.layout.popup, null);

                window.setContentView(popupView);
                window.setAnimationStyle(R.style.DialogAnimation);
                window.showAtLocation(v,40,10,400);


            }
        });


        button5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                PopupWindow window = PopupHelper.newBasicPopupWindow(PopupDemoActivity.this);

                LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);

                View popupView = inflater.inflate(R.layout.popup, null);

                window.setContentView(popupView);
                window.setAnimationStyle(R.style.sligengDialogAnim);
                window.showAtLocation(v,40,10,400);


            }
        });




    }











}