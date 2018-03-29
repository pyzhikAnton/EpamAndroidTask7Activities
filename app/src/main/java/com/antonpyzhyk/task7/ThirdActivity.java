package com.antonpyzhyk.task7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Log.d("TAG","onCreate method 3rd activity");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TAG","onStart method 3rd activity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TAG","onStop method 3rd activity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TAG","onDestroy method 3rd activity");
    }

    @Override
    public void onContentChanged() {
        super.onContentChanged();
        Log.d("TAG","onContentChanged method 3rd activity");
    }

    public void goBackMainActivity (View view){

        Intent intent = new Intent(this,MainActivity.class);
        Log.d("TAG","goBackMainActivity method 3rd activity");
        startActivity(intent);
    }
}
