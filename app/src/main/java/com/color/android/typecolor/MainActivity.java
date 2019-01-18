package com.color.android.typecolor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "myLogs";

    EditText editText;
    public static CharSequence color;
    int k = 5;
    TextView textView;
    final public static String a[] = {"YELLOW", "RED", "GREEN", "BLUE", "WHITE", "PINK", "BROWN", "VIOLET", "ORANGE", "PURPLE", "BLACK", "GRAY"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
        textView = (TextView) findViewById(R.id.textView);

        color = editText.getText();

    }

    public void startActivity(View v) {

        Intent intent = new Intent(this, ColorActivity.class);

        Log.d(TAG, "Color value " + color);

        String c = color.toString();

        if (c.equals(a[0])||c.equals(a[1])||c.equals(a[2])||c.equals(a[3])||c.equals(a[4])||c.equals(a[5])||c.equals(a[6])||c.equals(a[7])||c.equals(a[8])||c.equals(a[9])||c.equals(a[10])||c.equals(a[11])) {

            intent.putExtra("k", k);
            intent.putExtra("color", color);
            intent.putExtra("a",a);
            startActivity(intent);

        }

    }

}
