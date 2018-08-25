package com.alpha21.helloworldapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button sendMessageBtn = findViewById(R.id.send_msg_btn);
        sendMessageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMessage(v);
            }
        });
    }

    public void sendMessage(View view){
        EditText messageEditText = findViewById(R.id.message);
        String message = messageEditText.getText().toString();
        Intent messageIntent = new Intent(this , MessageActivity.class);
        messageIntent.putExtra("message", message);
        startActivity(messageIntent);
    }
}
