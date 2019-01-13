package com.mad.recyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    EditText mTextUsername;
    EditText mTextPassword;
    Button   mButtonLogin;
    TextView mTextViewRegister;
    Button id;
    TextView signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mTextUsername =(EditText)findViewById(R.id.edittext_username);
        mTextPassword =(EditText)findViewById(R.id.edittext_password);
        mButtonLogin =(Button) findViewById(R.id.button_login);

        id=findViewById(R.id.button_login);
      signup=findViewById(R.id.textview_register);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent signup = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(signup);
            }
        });

        id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent LoginIntent = new Intent(LoginActivity.this,MainActivity.class);
                startActivity(LoginIntent);
            }
        });


    }
}
