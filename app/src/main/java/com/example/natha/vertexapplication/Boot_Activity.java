package com.example.natha.vertexapplication;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



public class Boot_Activity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boot_);

        int secondsDelayed = 1;
        new Handler().postDelayed(new Runnable() {

            public void run(){
                Intent mainIntent = new Intent(Boot_Activity.this,LoginActivity.class);
                Boot_Activity.this.startActivity(mainIntent);
                Boot_Activity.this.finish();
            }
        },secondsDelayed * 500);
    }

}
