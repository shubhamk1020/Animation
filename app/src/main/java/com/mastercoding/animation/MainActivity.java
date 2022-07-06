package com.mastercoding.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Widgets
    TextView t1,t2;
    Button btn;
    Animation animate_btn,animate_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button);
        t1 =findViewById(R.id.textView);
        t2 =findViewById(R.id.textView2);

        // Now let's add the animation
        animate_btn = AnimationUtils.loadAnimation(this, R.anim.animation_btn);
        btn.setAnimation(animate_btn);

        animate_txt = AnimationUtils.loadAnimation(this, R.anim.animate_text);

        btn.setAnimation(animate_btn);

        // let's Create animation for the text
        t1.setAnimation(animate_txt);
        t2.setAnimation(animate_txt);
    }


}