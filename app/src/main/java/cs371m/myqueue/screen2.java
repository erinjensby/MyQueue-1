package cs371m.myqueue;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;


/**
 * Created by scottm on 6/7/2016.
 *
 * A simple about activity.
 */


public class screen2 extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_layout);
        setListener();
        Log.d("WelcomeActivity", "onCreate");
        Log.i("WelcomeActivity", "onCreate");
    }

    private void setListener(){
        Log.d("WelcomeActivity", "setListener");
        RelativeLayout rlayout = (RelativeLayout) findViewById(R.id.screen0);
        rlayout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.d("WelcomeActivity", "setListener");
                startActivity(new Intent(screen2.this, ItemDetailsActivity.class));
                //return true;
            }

        });

    }
}
