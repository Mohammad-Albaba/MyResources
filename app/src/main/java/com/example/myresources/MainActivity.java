package com.example.myresources;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {
//private int level=0;
//boolean flip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        TextView textView=findViewById(R.id.textview);
//        InputStream inputStream=getResources().openRawResource(R.raw.text);

//        try {
//            InputStream inputStream=getAssets().open("textfile/text.txt");
//
//            byte[] buffer=new byte[inputStream.available()];
//            inputStream.read(buffer);
//            inputStream.close();
//            String fileContent=new String(buffer);
//            textView.setText(fileContent);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        ImageView view=findViewById(R.id.imageframeanimation);
//        AnimationDrawable animationDrawable= (AnimationDrawable) view.getDrawable();
//        animationDrawable.start();



//        ImageView view=findViewById(R.id.view);
//       Animation animation= AnimationUtils.loadAnimation(this,R.anim.animation_test);
//        view.setAnimation(animation);
//        animation.start();

//        View view=findViewById(R.id.view);
//        view.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Animator animator= AnimatorInflater.loadAnimator(MainActivity.this,R.animator.animator_test);
//                animator.setTarget(view);
//                animator.start();
//            }
//
//        });
//        ImageView imageView=findViewById(R.id.imageview);
//        Animator animator=AnimatorInflater.loadAnimator(MainActivity.this,R.animator.animator_test2);
//        animator.setTarget(imageView);
//        animator.start();
//
//        final TextView textView=findViewById(R.id.textView);
//        ValueAnimator valueAnimator= (ValueAnimator) AnimatorInflater.loadAnimator(MainActivity.this,R.animator.animator_number);
//        valueAnimator.start();
//        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
//            @Override
//            public void onAnimationUpdate(ValueAnimator animation) {
//                ConstraintLayout.LayoutParams layoutParams= (ConstraintLayout.LayoutParams) textView.getLayoutParams();
//                Integer value= (Integer) animation.getAnimatedValue();
//               int valueInPixles= (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,value ,getResources().getDisplayMetrics());
//                layoutParams.width=valueInPixles;
//                layoutParams.height=valueInPixles;
//                textView.setLayoutParams(layoutParams);
//            }
//        });



//        LevelListDrawable levelListDrawable= (LevelListDrawable) ResourcesCompat.getDrawable(getResources(), R.drawable.battery,null);
//        ImageButton imageButton=findViewById(R.id.imagebattery);
//        imageButton.setImageDrawable(levelListDrawable);
//        imageButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//            level+=5;
//            levelListDrawable.setLevel(level);
//            }
//        });

//

//        ImageView imageView=findViewById(R.id.imageview);
//        ClipDrawable clipDrawable=(ClipDrawable)imageView.getDrawable();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i=0 ;i<10000 ;i++){
//                    try {
//                        Thread.sleep(2);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    clipDrawable.setLevel(i);
//                }
//            }
//        }).start();
    }
}