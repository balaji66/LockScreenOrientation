package com.durga.balaji66.lockscreenorientation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends LockScreen {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //This method is useful whenever we are fetching date from server at that time we will lock the screen orientation.
        lockOrientation(MainActivity.this);
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        //After completion of fetching the date from the sever we will unlock the screen orientation.
        unlockOrientation(MainActivity.this);
    }
}
