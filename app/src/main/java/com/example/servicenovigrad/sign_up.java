package com.example.servicenovigrad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class sign_up extends AppCompatActivity {

    private Button signin;
    private EditText name,username, email, phonenumber, password, confirmpassword;
    private CheckBox userroles;

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);

    signin = (Button)findViewById(R.id.button3);
    name = (EditText) findViewById(R.id.editTextTextPersonName2);
    username = (EditText) findViewById(R.id.editTextTextPersonName6);
    email = (EditText) findViewById(R.id.editTextTextPersonName7);
    phonenumber = (EditText) findViewById(R.id.editTextTextPersonName8);
    password = (EditText) findViewById(R.id.editTextTextPassword2);
    confirmpassword = (EditText) findViewById(R.id.editTextTextPassword3);
    userroles = (CheckBox)findViewById(R.id.checkBox3);

    signin.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(sign_up.this, MainActivity.class));
        }
    });
    }

    public boolean signup(String email, String phonenumber, String username, String name, String password){
        validInput x = new validInput();
        boolean valid = true;
        StringBuilder errorMsg = new StringBuilder();
        errorMsg.append("Error: ");
        if(!x.isValidemail(email)){
            valid = false;
            errorMsg.append("Invalid email");
        }
        if(!x.isValidusername(username)){
            valid = false;
            errorMsg.append("Invalid username")
;        }
        if (!x.isValidphonenumber(phonenumber)) {
            valid = false;
            errorMsg.append("Invalid phonenumber");
        }
        if(!x.isValidname(name)){
            valid = false;
            errorMsg.append("Invalid name");
        }
        if(!x.isValidpassword(password)){
            valid = false;
            errorMsg.append("Invalid password");
        }

        if(!valid){
            Toast.makeText(getApplicationContext(), errorMsg, Toast.LENGTH_LONG).show();
        }
        return valid;
    }
}
