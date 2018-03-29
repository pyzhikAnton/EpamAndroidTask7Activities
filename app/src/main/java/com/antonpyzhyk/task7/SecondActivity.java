package com.antonpyzhyk.task7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d("TAG","onCreate method 2nd activity");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TAG","onStart method 2nd activity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TAG","onStop method 2nd activity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TAG","onDestroy method 2nd activity");
    }

    @Override
    public void onContentChanged() {
        super.onContentChanged();
        Log.d("TAG","onContentChanged method 2nd activity");
    }

    public void goToThirdActivity (View view){

        Intent intent = new Intent(this,ThirdActivity.class);
        Log.d("TAG","goToThirdActivity method 2nd activity");
        startActivity(intent);
    }
}
