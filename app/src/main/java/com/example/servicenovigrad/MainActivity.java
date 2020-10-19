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


public class MainActivity extends AppCompatActivity {
    private Button login, signup;
    private CheckBox customer, employee;
    private TextView welcome;
    private EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customer = (CheckBox) findViewById(R.id.checkBox2);
        employee = (CheckBox) findViewById(R.id.checkBox);
        login = (Button) findViewById(R.id.button2);
        signup = (Button) findViewById(R.id.button);
        welcome = (TextView) findViewById(R.id.textView);
        username = (EditText) findViewById(R.id.editTextTextPersonName);
        password = (EditText) findViewById(R.id.editTextTextPassword);

        customer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (customer.isChecked()) {

                }
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, sign_up.class));
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, welcomepage.class));
            }
        });
    }

    public void login(View view) {
        String user = username.getText().toString().trim();
        String pass = password.getText().toString().trim();
        if (user == null || pass == null) {
            Toast.makeText(this, "Please enter your email address and password", Toast.LENGTH_LONG).show();
        } else if (signin(user, pass)) {
            username.setText("");
            password.setText("");
            login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(MainActivity.this, welcomepage.class));
                }
            });
        }
    }

    public boolean signin(String username, String password) {
        validInput x = new validInput();
        boolean valid = true;
        StringBuilder errorMsg = new StringBuilder();
        errorMsg.append("Error: ");
        if (!x.isValidusername(username)) {
            valid = false;
            errorMsg.append("Invalid username");
        }
        if (!x.isValidpassword(password)) {
            valid = false;
            errorMsg.append("Invalid password");
        }

        if (!valid) {
            Toast.makeText(getApplicationContext(), errorMsg, Toast.LENGTH_LONG).show();
        }
        return valid;
    }
}