package com.krbguide.kebunrayabogorguide;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;


public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash);

        initSplash();
    }

    private void initSplash() {

        new Handler().postDelayed(new Thread() {
            @Override
            public void run() {
                Intent mMaps = new Intent(SplashActivity.this, MapsActivity.class);
                SplashActivity.this.startActivity(mMaps);
                SplashActivity.this.finish();
                overridePendingTransition(R.layout.splash_fadein,R.layout.splash_fadeout);
            }
        }, 1000);

    }

}
