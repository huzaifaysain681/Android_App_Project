package com.example.projectscreen;// SplashScreenActivity.java
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class SplashScreenActivity extends AppCompatActivity {

    private static final int SPLASH_SCREEN_DURATION = 3000; // 2 seconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Start your main activity here
                Intent intent = new Intent(SplashScreenActivity.this, MainActivity.class);
                startActivity(intent);
                finish(); // Close this activity
            }
        }, SPLASH_SCREEN_DURATION);
    }
}
