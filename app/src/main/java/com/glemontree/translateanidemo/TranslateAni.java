package com.glemontree.translateanidemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;

public class TranslateAni extends AppCompatActivity {
    private LinearLayout llTranslate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translate);
        llTranslate = (LinearLayout) findViewById(R.id.ll_translate);
        beginAnimation();
    }

    private void beginAnimation() {
        TranslateAnimation translate = new TranslateAnimation(0, 200, 0, 300);
        translate.setDuration(3000);
        llTranslate.startAnimation(translate);
    }
}
