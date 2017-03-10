package com.example.mmaybon.exam1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        EditText userTxt = (EditText) findViewById(R.id.userTxt);
        String str = userTxt.getText().toString();

        TextView text = (TextView) findViewById(R.id.response);
        text.setText(str + " is a great programmer!");

    }
}
