package id.asnproject.mediapembelajaran;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;

public class Main8Activity extends AppCompatActivity {
    ImageButton imageButton14;
float x1,x2,y1,y2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        imageButton14 = (ImageButton) findViewById(R.id.imageButton14);

        imageButton14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(Main8Activity.this, Main3Activity.class);
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
                if(x1 > x2){
                    Intent i = new Intent(Main8Activity.this, Main9Activity.class);
                    startActivity(i);
                }
                if(x1 < x2 ){
                    Intent j = new Intent(Main8Activity.this, Main7Activity.class);
                    startActivity(j);
                }
                break;
        }
        return false;
    }

}
