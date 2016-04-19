package competition.eseed.com.cheeseman;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.media.Image;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

/**
 * Created by MorcosS on 4/19/16.
 */
public class CheesePiece  {
   ImageView img;
    public CheesePiece(View view) {
        img = (ImageView) view.findViewById(R.id.imageView6);
    }

    public ImageView  getImg() {
       return img;
    }





}
