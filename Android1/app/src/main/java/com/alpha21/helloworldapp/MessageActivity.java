package com.alpha21.helloworldapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        Intent callingIntent = getIntent();
        String msg = callingIntent.getStringExtra("message");
        TextView textView = findViewById(R.id.message_text);
        if (msg.trim().isEmpty())
            msg = "Hello World";

        textView.setText(msg);
    }

    public void openFinalActivity(View view) {
        //starting the Final Activity
        startActivity(new Intent(this, FinalActivity.class));
    }
}
