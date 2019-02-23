package com.timcoder.ndkproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView mTextView;
    private NativeHelper mNativeHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mNativeHelper = new NativeHelper();
        // Example of a call to a native method
        mTextView = findViewById(R.id.sample_text);
        mTextView.setText(mNativeHelper.stringFromJNI());
    }


    public void nativeCall(View view) {
        mTextView.setText(mNativeHelper.buttonFromJNI());
    }

}
