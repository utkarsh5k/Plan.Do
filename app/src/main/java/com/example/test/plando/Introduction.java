package com.example.test.plando;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;



public class Introduction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);
    }
    public void sendMessage(View view)
    {
        Intent intent = new Intent(this, CustomLogin.class);
        startActivity(intent);
    }
}
