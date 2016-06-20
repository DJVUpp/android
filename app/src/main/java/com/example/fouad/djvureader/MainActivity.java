package com.example.fouad.djvureader;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView txt;
    private Button tryapp;
    private Animation fadein,fadein2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt= (TextView) findViewById(R.id.textView2);
        tryapp= (Button) findViewById(R.id.button2);

       // txt.startAnimation(AnimationUtils.loadAnimation(this,android.R.anim.slide_in_left));

        fadein2=AnimationUtils.loadAnimation(this,R.anim.fade2);
        txt.startAnimation(fadein2);

        fadein=AnimationUtils.loadAnimation(this,R.anim.fade);
        tryapp.startAnimation(fadein);

        tryapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Navigation_Drawer.class);
                startActivity(i);
                finish();
            }
        });
       
        
    }
}
