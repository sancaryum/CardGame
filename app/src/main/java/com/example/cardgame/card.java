package com.example.cardgame;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.Button;

import androidx.appcompat.widget.AppCompatDrawableManager;

public class card extends Button {

    //Is card open or closed
    boolean openOrClosed = false;
    //ID variable of button's images
    int resimId;
    //ID variable of button's background
    int backgroundId;



    //We have to add this method after extending Button class.
    public card(Context context) {
        super(context);
        backgroundId = R.drawable.back;
        //backgroundId ile gösterdiğimiz resim objesini drawable objesine aktarıyoruz.
        Drawable d = AppCompatDrawableManager.get().getDrawable(context,backgroundId);
        //setting button's background with drawable object
        setBackground(d);


    }
}
