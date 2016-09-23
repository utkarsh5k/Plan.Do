package com.example.test.plando;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void betamsg(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(MenuActivity.this);
        builder.setTitle("Work in progress...");
        builder.setMessage("This feature is currently unavailable since the app is still in development phase.");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Thankyou for your patience.", Toast.LENGTH_LONG).show();
            }
        });
        AlertDialog bmsg = builder.create();
        bmsg.show();
    }
    public void startToDo(View view)
    {
        Intent intent = new Intent(getApplicationContext(), ToDoActivity.class);
        startActivity(intent);
    }
}
