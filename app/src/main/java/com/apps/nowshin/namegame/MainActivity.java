package com.apps.nowshin.namegame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Visibility;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void textVisible(View v)

    {
        TextView text = (TextView) findViewById(R.id.name);
        text.setVisibility(View.VISIBLE);
    }

    public void imageVisible(View v)

    {
        ImageView image = (ImageView) findViewById(R.id.imageView);
        image.setVisibility(View.VISIBLE);
    }

    public void reset(View v)

    {
        TextView text = (TextView) findViewById(R.id.name);
        text.setVisibility(View.INVISIBLE);
        ImageView image = (ImageView) findViewById(R.id.imageView);
        image.setVisibility(View.INVISIBLE);
    }

}
