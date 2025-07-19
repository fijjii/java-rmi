package edu.divyagyan.form;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {

    private EditText editTextFullName, editTextAddress, editTextUserName;
    private Button buttonSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);


        editTextFullName = findViewById(R.id.editTextFullName);
        editTextAddress = findViewById(R.id.editTextAddress);
        editTextUserName = findViewById(R.id.editTextUserName);
        buttonSignup = findViewById(R.id.buttonSignup);


        buttonSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleSignup();
            }
        });
    }

    private void handleSignup() {
        String fullName = editTextFullName.getText().toString().trim();
        String address = editTextAddress.getText().toString().trim();
        String userName = editTextUserName.getText().toString().trim();


        if (fullName.isEmpty() || address.isEmpty() || userName.isEmpty()) {
            Toast.makeText(SignupActivity.this, "All fields are required!", Toast.LENGTH_SHORT).show();
        } else {
            Intent intent = new Intent(SignupActivity.this, WelcomActivity.class);
            intent.putExtra("fullName", fullName);
            startActivity(intent);
        }
    }
}
