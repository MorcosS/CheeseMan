package competition.eseed.com.cheeseman;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.Random;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    TranslateAnimation mAnimation, mAnimation1, mAnimation2, mAnimation3, mAnimation4, mAnimation5,mAnimation6
            ,mAnimation7,mAnimation8,mAnimation9;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView cheese = (ImageView) findViewById(R.id.imageView);
        ImageView cheese1 = (ImageView) findViewById(R.id.imageView1);
        ImageView cheese2 = (ImageView) findViewById(R.id.imageView2);
        ImageView cheese3 = (ImageView) findViewById(R.id.imageView3);
        ImageView cheese4 = (ImageView) findViewById(R.id.imageView4);
        ImageView cheeseman = (ImageView) findViewById(R.id.imageView5);
        ImageView cheeseman1 = (ImageView) findViewById(R.id.imageView6);
        ImageView cheeseman2 = (ImageView) findViewById(R.id.imageView7);
        ImageView cheeseman3 = (ImageView) findViewById(R.id.imageView8);
        ImageView cheeseman4 = (ImageView) findViewById(R.id.imageView9);

        // ImageView cheeseman2 = (ImageView) findViewById(R.id.imageView5);
        Random random = new Random();
        int i1 = random.nextInt(5000 - 1000 + 100) + 1000;
        mAnimation = new TranslateAnimation(
                TranslateAnimation.ABSOLUTE, 0f,
                TranslateAnimation.ABSOLUTE, 0f,
                TranslateAnimation.RELATIVE_TO_PARENT, 0f,
                TranslateAnimation.RELATIVE_TO_PARENT, 1.0f);
        mAnimation.setDuration(i1);
        mAnimation.setRepeatCount(-1);
        mAnimation.setRepeatMode(Animation.INFINITE);
        mAnimation.setInterpolator(new LinearInterpolator());
        i1 = random.nextInt(5000 - 1000 + 100) + 1000;
        mAnimation1 = new TranslateAnimation(
                TranslateAnimation.ABSOLUTE, 0f,
                TranslateAnimation.ABSOLUTE, 0f,
                TranslateAnimation.RELATIVE_TO_PARENT, 0f,
                TranslateAnimation.RELATIVE_TO_PARENT, 2.0f);

        mAnimation1.setDuration(i1);
        mAnimation1.setRepeatCount(-1);
        mAnimation1.setRepeatMode(Animation.INFINITE);
        mAnimation1.setInterpolator(new LinearInterpolator());
        i1 = random.nextInt(5000 - 1000 + 100) + 1000;
        mAnimation2 = new TranslateAnimation(
                TranslateAnimation.ABSOLUTE, 0f,
                TranslateAnimation.ABSOLUTE, 0f,
                TranslateAnimation.RELATIVE_TO_PARENT, 0f,
                TranslateAnimation.RELATIVE_TO_PARENT, 1.5f);
        mAnimation2.setDuration(i1);
        mAnimation2.setRepeatCount(-1);
        mAnimation2.setRepeatMode(Animation.INFINITE);
        mAnimation2.setInterpolator(new LinearInterpolator());
        i1 = random.nextInt(5000 - 1000 + 100) + 1000;
        mAnimation3 = new TranslateAnimation(
                TranslateAnimation.ABSOLUTE, 0f,
                TranslateAnimation.ABSOLUTE, 0f,
                TranslateAnimation.RELATIVE_TO_PARENT, 0f,
                TranslateAnimation.RELATIVE_TO_PARENT, 1.2f);
        mAnimation3.setDuration(i1);
        mAnimation3.setRepeatCount(-1);
        mAnimation3.setRepeatMode(Animation.INFINITE);
        mAnimation3.setInterpolator(new LinearInterpolator());
        i1 = random.nextInt(5000 - 1000 + 100) + 1000;
        mAnimation4 = new TranslateAnimation(
                TranslateAnimation.ABSOLUTE, 0f,
                TranslateAnimation.ABSOLUTE, 0f,
                TranslateAnimation.RELATIVE_TO_PARENT, 0f,
                TranslateAnimation.RELATIVE_TO_PARENT, 1.7f);
        mAnimation4.setDuration(i1);
        mAnimation4.setRepeatCount(-1);
        mAnimation4.setRepeatMode(Animation.INFINITE);
        mAnimation4.setInterpolator(new LinearInterpolator());
        cheese.setAnimation(mAnimation);
        cheese1.setAnimation(mAnimation1);
        cheese2.setAnimation(mAnimation2);
        cheese3.setAnimation(mAnimation3);
        cheese4.setAnimation(mAnimation4);
        i1 = random.nextInt(5000 - 1000 + 100) + 1000;
        mAnimation5 = new TranslateAnimation(
                TranslateAnimation.RELATIVE_TO_PARENT, 0f,
                TranslateAnimation.RELATIVE_TO_PARENT, 1.0f,
                TranslateAnimation.RELATIVE_TO_PARENT, 0f,
                TranslateAnimation.RELATIVE_TO_PARENT, 0f);
        mAnimation5.setDuration(i1);
        mAnimation5.setRepeatCount(-1);
        mAnimation5.setRepeatMode(Animation.REVERSE);
        mAnimation5.setInterpolator(new LinearInterpolator());
        cheeseman.setAnimation(mAnimation5);

        i1 = random.nextInt(5000 - 1000 + 500) + 1000;
        mAnimation6 = new TranslateAnimation(
                TranslateAnimation.RELATIVE_TO_PARENT, 0f,
                TranslateAnimation.RELATIVE_TO_PARENT, 1.0f,
                TranslateAnimation.RELATIVE_TO_PARENT, 0f,
                TranslateAnimation.RELATIVE_TO_PARENT, 0f);
        mAnimation6.setDuration(i1);
        mAnimation6.setRepeatCount(-1);
        mAnimation6.setRepeatMode(Animation.REVERSE);
        mAnimation6.setInterpolator(new LinearInterpolator());
        cheeseman1.setAnimation(mAnimation6);
        i1 = random.nextInt(5000 - 1000 + 500) + 1000;
        mAnimation7 = new TranslateAnimation(
                TranslateAnimation.RELATIVE_TO_PARENT, 0f,
                TranslateAnimation.RELATIVE_TO_PARENT, 1.0f,
                TranslateAnimation.RELATIVE_TO_PARENT, 0f,
                TranslateAnimation.RELATIVE_TO_PARENT, 0f);
        mAnimation7.setDuration(i1);
        mAnimation7.setRepeatCount(-1);
        mAnimation7.setRepeatMode(Animation.REVERSE);
        mAnimation7.setInterpolator(new LinearInterpolator());
        cheeseman2.setAnimation(mAnimation7);
        i1 = random.nextInt(5000 - 1000 + 500) + 1000;
        mAnimation8 = new TranslateAnimation(
                TranslateAnimation.RELATIVE_TO_PARENT, 0f,
                TranslateAnimation.RELATIVE_TO_PARENT, 1.0f,
                TranslateAnimation.RELATIVE_TO_PARENT, 0f,
                TranslateAnimation.RELATIVE_TO_PARENT, 0f);
        mAnimation8.setDuration(i1);
        mAnimation8.setRepeatCount(-1);
        mAnimation8.setRepeatMode(Animation.REVERSE);
        mAnimation8.setInterpolator(new LinearInterpolator());
        cheeseman3.setAnimation(mAnimation8);
        i1 = random.nextInt(5000 - 1000 + 500) + 1000;
        mAnimation9 = new TranslateAnimation(
                TranslateAnimation.RELATIVE_TO_PARENT, 0f,
                TranslateAnimation.RELATIVE_TO_PARENT, 1.0f,
                TranslateAnimation.RELATIVE_TO_PARENT, 0f,
                TranslateAnimation.RELATIVE_TO_PARENT, 0f);
        mAnimation9.setDuration(i1);
        mAnimation9.setRepeatCount(-1);
        mAnimation9.setRepeatMode(Animation.REVERSE);
        mAnimation9.setInterpolator(new LinearInterpolator());
        cheeseman4.setAnimation(mAnimation9);


    }

}
