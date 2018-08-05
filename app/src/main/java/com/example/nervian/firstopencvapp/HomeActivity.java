package com.example.nervian.firstopencvapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.Menu;
import android.view.MenuItem;

public class HomeActivity extends AppCompatActivity {

    private final int SELECT_PHOTO = 1;


    static final int  MEAN_BLUR = 1;

    static final int GAUSSIAN_BLUR = 2;

    static final int MEDIAN_BLUR = 3;

    static final int SHARPEN = 4;

    static final int DILATE = 5;

    static final int ERODE = 6;

    static final int THRESHOLD = 7;

    static final int ADAPTIVE_THRESHOLD = 8;



    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button bMean = (Button) findViewById(R.id.bMean);

        bMean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);

                i.putExtra("ACTION_MODE", MEAN_BLUR);

                startActivity(i);
            }
        });

        Button GAUSSIAN_BLUR1 = (Button) findViewById(R.id.GAUSSIAN_BLUR);

        GAUSSIAN_BLUR1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);

                i.putExtra("ACTION_MODE", GAUSSIAN_BLUR);

                startActivity(i);
            }
        });
        Button MEDIAN_BLUR1 = (Button) findViewById(R.id.MEDIAN_BLUR);

        MEDIAN_BLUR1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);

                i.putExtra("ACTION_MODE", MEDIAN_BLUR);

                startActivity(i);
            }
        });
        Button SHARPEN1 = (Button) findViewById(R.id.SHARPEN);

        SHARPEN1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);

                i.putExtra("ACTION_MODE", SHARPEN);

                startActivity(i);
            }
        });

        Button DILATE1 = (Button) findViewById(R.id.DILATE);

        DILATE1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);

                i.putExtra("ACTION_MODE", DILATE);

                startActivity(i);
            }
        });

        Button ERODE1 = (Button) findViewById(R.id.ERODE);

        ERODE1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);

                i.putExtra("ACTION_MODE", ERODE);

                startActivity(i);
            }
        });

        Button THRESHOLD1 = (Button) findViewById(R.id.THRESHOLD);

        THRESHOLD1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);

                i.putExtra("ACTION_MODE", THRESHOLD);

                startActivity(i);
            }
        });

        Button ADAPTIVE_THRESHOLD1 = (Button) findViewById(R.id.ADAPTIVE_THRESHOLD);

        ADAPTIVE_THRESHOLD1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);

                i.putExtra("ACTION_MODE", ADAPTIVE_THRESHOLD);

                startActivity(i);
            }
        });

    }




    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}
