package com.example.user.colors;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    Switch sw1;
    ToggleButton tb1;
    LinearLayout mainlayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button) findViewById(R.id.btn1);
        sw1=(Switch) findViewById(R.id.sw1);
        tb1=(ToggleButton)findViewById(R.id.tb1);
        mainlayout=(LinearLayout) findViewById(R.id.mainlayout);
    }

    public void change(View view) {
        if(sw1.isChecked()&&tb1.isChecked()){
            mainlayout.setBackgroundColor(Color.GREEN);}
            else{
                if(sw1.isChecked()){
                    mainlayout.setBackgroundColor(Color.BLUE);
                }
                else{
                    if(tb1.isChecked()){
                        mainlayout.setBackgroundColor(Color.YELLOW);
                    }
                    else{
                        mainlayout.setBackgroundColor(Color.WHITE);
                    }

                }


            }
       }
    }
