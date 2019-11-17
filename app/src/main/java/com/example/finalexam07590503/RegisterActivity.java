package com.example.finalexam07590503;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.finalexam07590503.Model.Auth_Register;

public class RegisterActivity extends MainActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registeractivity);

        Button register_button = findViewById(R.id.register_button);
        register_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText full_name_edit_text = findViewById(R.id.full_name_edit_text);
                EditText username_edit_text = findViewById(R.id.username_edit_text);
                EditText password_edit_text = findViewById(R.id.password_edit_text);

                String inputFullName = full_name_edit_text.getText().toString();
                String inputUsername = username_edit_text.getText().toString();
                String inputPassword = password_edit_text.getText().toString();

                Auth_Register auth_register = new Auth_Register(inputFullName, inputUsername, inputPassword);

                boolean result = auth_register.check();

                if (result) {
                    Toast toast = Toast.makeText ( RegisterActivity.this, "Register successfully", Toast.LENGTH_LONG );
                    toast.show ( );
                } else {
                    Toast toast = Toast.makeText ( RegisterActivity.this, "All fields are required", Toast.LENGTH_LONG );
                    toast.show ( );
                }
            }
        });

    }
}
