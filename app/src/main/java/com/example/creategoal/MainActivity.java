//main code for a screen to get user entry to create a new goal
package com.example.creategoal;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    Button mButton;
    EditText mEdit;
    TextView mText;
    String msg;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = (Button)findViewById(R.id.button1);
        msg = "Congratulations! Building new nest...";

        mButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
               //mEdit   = (EditText)findViewById(R.id.editText1);
                mText = (TextView)findViewById(R.id.textView1);
                mText.setText(msg);
                //mText.setText("Congratulations! Building nest to save "+mEdit.getText().toString()+" euros...");
            }
        });
    }
}