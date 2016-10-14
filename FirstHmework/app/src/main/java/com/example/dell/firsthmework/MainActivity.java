package com.example.dell.firsthmework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
   private Button mfirstButton;
    private int mButtonPressed;
    private Button msecondTask;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mfirstButton= (Button) findViewById(R.id.firstButton);
        mfirstButton.setOnClickListener(this);
        msecondTask=(Button) findViewById(R.id.secondTask);
        msecondTask.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId()== R.id.firstButton){
            mButtonPressed++;
            if(mfirstButton!=null){
                mfirstButton.setText(String.valueOf(mButtonPressed));
            }
        }
        else if(v.getId()==R.id.secondTask){
            Intent intent=new Intent(MainActivity.this,SecondTaskActivity.class);
            startActivity(intent);
        }

    }
}
