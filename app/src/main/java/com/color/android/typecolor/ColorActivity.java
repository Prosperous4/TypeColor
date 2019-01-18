package com.color.android.typecolor;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ColorActivity extends AppCompatActivity {

    RelativeLayout relativeLayout;
    TextView textView;
    TextView textView2;
    public static CharSequence color = "Default";

    public static final String TAG = "myLogs";
    int k = 0;
    String a[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);
        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);
        relativeLayout = (RelativeLayout) findViewById(R.id.relative_layout);

        Intent intent = getIntent();
        k = intent.getIntExtra("k", k);
        a = intent.getStringArrayExtra("a");

        color = this.getIntent().getCharSequenceExtra("color");

        String c = color.toString();


        if (c.equals("YELLOW")){
            relativeLayout.setBackgroundColor(Color.YELLOW);
            textView2.setText(getString(R.string.yellow));
        }
        if (c.equals("RED")){
            relativeLayout.setBackgroundColor(Color.RED);
            textView2.setText(getString(R.string.red));
        }
        if (c.equals("GREEN")){
            relativeLayout.setBackgroundColor(Color.GREEN);
            textView2.setText(getString(R.string.green));
        }
        if (c.equals("BLUE")){
            relativeLayout.setBackgroundColor(Color.BLUE);
            textView2.setText(getString(R.string.blue));
        }
        if (c.equals("WHITE")){
            relativeLayout.setBackgroundColor(Color.WHITE);
            textView2.setText(getString(R.string.white));
        }
        if (c.equals("PINK")){
            relativeLayout.setBackgroundColor(getResources().getColor(R.color.PINK));
            textView2.setText(getString(R.string.pink));
        }
        if (c.equals("BROWN")){
            relativeLayout.setBackgroundColor(getResources().getColor(R.color.BROWN));
            textView2.setText(getString(R.string.brown));
        }
        if (c.equals("VIOLET")){
            relativeLayout.setBackgroundColor(getResources().getColor(R.color.VIOLET));
            textView2.setText(getString(R.string.violet));
        }
        if (c.equals("ORANGE")){
            relativeLayout.setBackgroundColor(getResources().getColor(R.color.ORANGE));
            textView2.setText(getString(R.string.orange));
        }
        if (c.equals("PURPLE")){
            relativeLayout.setBackgroundColor(getResources().getColor(R.color.PURPLE));
            textView2.setText(getString(R.string.purple));
        }
        if (c.equals("BLACK")){
            relativeLayout.setBackgroundColor(Color.BLACK);
            textView.setTextColor(Color.WHITE);
            textView2.setTextColor(Color.WHITE);
            textView2.setText(getString(R.string.black));
        }
        if (c.equals("GRAY")){
            relativeLayout.setBackgroundColor(Color.GRAY);
            textView2.setText(getString(R.string.gray));
        }


        textView.setText(color);



    }


}
