package dctc.gp.songlyrics;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class Home_Screen extends AppCompatActivity {


    private static int SPLASH_SCREEN=4000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home__screen);
new Handler().postDelayed(new Runnable() {
    @Override
    public void run() {

        Intent home=new Intent(Home_Screen.this,MainActivity.class);
                startActivity(home);
                finish();
            }
        },SPLASH_SCREEN);
    }
}
