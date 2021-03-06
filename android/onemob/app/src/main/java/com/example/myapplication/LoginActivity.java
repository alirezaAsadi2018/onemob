package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.JsonPackage.JsonPostLogin;
import com.example.myapplication.ui.notifications.NotificationsFragment;
import com.example.myapplication.ui.videos.VideosFragment;

public class LoginActivity extends AppCompatActivity {

    EditText editTextUserName;
    EditText editTextPassword;
    Button btnLogin;
    TextView lblLoginToRegister;
    TextView lblLoginStatus;

    JsonPostLogin jsonPostLogin = null;

    String userName = "";
    String password = "";
    String token = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        try {
            setupUI();
            setupListeners();
        } catch (Exception e){
            e.printStackTrace();
            Log.e("Whole Exception!", e.getMessage());
        }
    }

    private void setupUI(){
        editTextUserName = findViewById(R.id.editTextUserNameLogin);
        editTextPassword = findViewById(R.id.editTextPasswordLogin);
        btnLogin = findViewById(R.id.btnLogin);
        lblLoginToRegister = findViewById(R.id.lblLoginToRegistration);
        lblLoginStatus = findViewById(R.id.lblLoginStatus);
    }

    private void setupListeners(){
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkUserPassEmpty() == 2){
                    checkUserPassTruth();
                }
            }
        });

        lblLoginToRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(LoginActivity.this, RegistrationActivity.class);
                startActivity(loginIntent);
            }
        });
    }

    //This method checks username and password fields to being empty.
    private int checkUserPassEmpty(){
        userName = editTextUserName.getText().toString();
        password = editTextPassword.getText().toString();
        int checkEmpty = 0;
        if (userName.equals("")){
            editTextUserName.setError("???????? ?????? ???????????? ?????? ???? ???????? ????????!");
        } else {
            checkEmpty++;
        }
        if (password.equals("")){
            editTextPassword.setError("???????? ?????? ???????? ?????? ???? ???????? ????????!");
        } else {
            checkEmpty++;
        }
        return checkEmpty;
    }

    //This method checks username and password are truth or not.
    private void checkUserPassTruth(){
        jsonPostLogin = (JsonPostLogin) new JsonPostLogin(userName,password,LoginActivity.this,editTextUserName,editTextPassword,lblLoginStatus).execute();
    }

}
