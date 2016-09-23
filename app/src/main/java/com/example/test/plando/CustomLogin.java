package com.example.test.plando;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class CustomLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_login);
    }
    public void validate(View view)
    {
        EditText uname = (EditText) findViewById(R.id.user);
        EditText pass = (EditText) findViewById(R.id.pass);
        CheckBox chb = (CheckBox) findViewById(R.id.checkBox2);
        TextView error = (TextView) findViewById(R.id.error);
        String user = uname.getText().toString();
        String pwd = pass.getText().toString();
        boolean chkd = chb.isChecked();
        if(!chkd)
            error.setText("Please agree to Terms and Conditions!");
        else if(user.equals("admin") && pwd.equals("pass123"))
        {
            Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
            startActivity(intent);
        }
        else
            error.setText("Incorrect Username/Password!");
    }
}
