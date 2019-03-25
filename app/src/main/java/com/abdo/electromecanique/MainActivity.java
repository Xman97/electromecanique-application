package com.abdo.electromecanique;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void cardView1(View view) {
        Intent cardie1 = new Intent(this ,Main2Activity.class);
        startActivity(cardie1);
    }
}
