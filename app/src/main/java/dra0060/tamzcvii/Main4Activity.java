package dra0060.tamzcvii;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class Main4Activity extends AppCompatActivity {

    ImageView wall1,wall2;
    Intent intent = new Intent();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        setResult(666,intent);
        wall1 = (ImageView) findViewById(R.id.imageView2);
        wall2 = (ImageView) findViewById(R.id.imageView3);

        wall1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction()== MotionEvent.ACTION_DOWN)
                {
                    wall1.getDrawable().setColorFilter(Color.argb(100,255,0,0), PorterDuff.Mode.DARKEN);
                }
                if(event.getAction()== MotionEvent.ACTION_UP)
                {
                    wall1.getDrawable().clearColorFilter();


                    intent.putExtra("wallpaper","w1");
                    finish();
                }
                return true;
            }
        });

        wall2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction()== MotionEvent.ACTION_DOWN)
                {
                    wall2.getDrawable().setColorFilter(Color.argb(100,255,0,0), PorterDuff.Mode.DARKEN);
                }
                if(event.getAction()== MotionEvent.ACTION_UP)
                {
                    wall2.getDrawable().clearColorFilter();
                    intent.putExtra("wallpaper","w2");

                    finish();
                }
                return true;
            }
        });

    }
}
