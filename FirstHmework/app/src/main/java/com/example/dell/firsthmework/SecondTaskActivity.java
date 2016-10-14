package com.example.dell.firsthmework;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by dell on 10/1/2016.
 */
public class SecondTaskActivity extends Activity implements View.OnClickListener{
    private Button mFirstButton;
    private Button mSecondButton;
    private Button mThirdButton;
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_task_layout);
        mFirstButton= (Button) findViewById(R.id.first);
        mFirstButton.setOnClickListener(this);
        mSecondButton= (Button) findViewById(R.id.second);
        mSecondButton.setOnClickListener(this);
        mThirdButton= (Button) findViewById(R.id.third);
        mThirdButton.setOnClickListener(this);
        mTextView= (TextView) findViewById(R.id.textView);
        mTextView.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.second || v.getId()==R.id.first || v.getId()==R.id.third){
            mTextView.setText(getResources().getResourceEntryName(v.getId()));
        }
        else if(v.getId()==R.id.textView && mTextView!=null){


        }

    }
}