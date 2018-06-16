package com.acadview.toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "This is my Toast in center", Toast.LENGTH_SHORT).show();

        Toast centerToast = Toast.makeText(this, "Center",Toast.LENGTH_SHORT);
        centerToast.setGravity(Gravity.CENTER, 0 ,0 );
        centerToast.show();
    }


    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Toast in onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Toast in onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Toast in onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "This is my Toast in onDestroyed", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "This is my Toast in onDestoyed", Toast.LENGTH_SHORT).show();
    }
}
