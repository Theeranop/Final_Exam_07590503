package com.example.finalexam07590503;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.finalexam07590503.Model.Auth;

public class MainActivity extends AppCompatActivity {
    public void onClickNext(View view){
        Button register = (Button)findViewById(R.id.register_button);
        Intent intent = new Intent(MainActivity.this,RegisterActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginButton = findViewById(R.id.login_button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText emailEditText = findViewById(R.id.username_edit_text);
                EditText passwordEditText = findViewById(R.id.password_edit_text);

                String inputEmail = emailEditText.getText().toString();
                String inputPassword = passwordEditText.getText().toString();

                Auth auth = new Auth(inputEmail, inputPassword);

                boolean result = auth.check();

                if (result) {
                    Toast toast = Toast.makeText ( MainActivity.this, "Welcome", Toast.LENGTH_LONG );
                    toast.show ( );
                } else {
                    Toast toast = Toast.makeText ( MainActivity.this, "All fields are required", Toast.LENGTH_LONG );
                    toast.show ( );
                }
            }
        });

    }
}

