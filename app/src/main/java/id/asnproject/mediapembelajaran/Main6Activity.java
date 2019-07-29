package id.asnproject.mediapembelajaran;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;

public class Main6Activity extends AppCompatActivity {
    float x1, x2, y1, y2;
    ImageButton imageButton12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        imageButton12 = (ImageButton) findViewById(R.id.imageButton12);

        imageButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(Main6Activity.this, Main3Activity.class);
                startActivity(c);
            }
        });
    }
    public boolean onTouchEvent(MotionEvent touchevent){
        switch (touchevent.getAction()){
            case MotionEvent.ACTION_DOWN:
                x1 = touchevent.getX();
                y1 = touchevent.getY();
                break;
            case MotionEvent.ACTION_UP:
                x2 = touchevent.getX();
                y2 = touchevent.getY();
                if(x1 < x2){
                    Intent i = new Intent(Main6Activity.this, Main4Activity.class);
                    startActivity(i);
                }
                break;
        }
        return false;
    }

}
