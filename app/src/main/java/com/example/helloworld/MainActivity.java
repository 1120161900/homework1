package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.lang.String;

public class MainActivity extends AppCompatActivity {
    private EditText input_username, input_password;
   private Button loginin;
    private static final String TAG = "MainActivity";
    private void init() {
        input_username = findViewById(R.id.input_username);
        input_password=findViewById(R.id.input_password);
      loginin=findViewById(R.id.loginin);
    }
    private String username;
    private  String password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

       loginin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
             // System.out.println("点击发生");
               username= input_username.getText().toString();
               password = input_password.getText().toString();
               Log.d(TAG,username);
                Log.d(TAG, password);
    }
        });





    }
}
