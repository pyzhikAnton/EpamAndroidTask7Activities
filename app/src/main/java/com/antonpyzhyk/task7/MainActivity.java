package com.antonpyzhyk.task7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("TAG","onCreate method 1st activity");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TAG","onStart method 1st activity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TAG","onStop method 1st activity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TAG","onDestroy method 1st activity");
    }

    @Override
    public void onContentChanged() {
        super.onContentChanged();
        Log.d("TAG","onContentChanged method 1st activity");
    }

    public void goToSecondActivity (View view){

    Intent intent = new Intent(this,SecondActivity.class);
    Log.d("TAG","goToSecondActivity method 1st activity");
    startActivity(intent);
    }
}
