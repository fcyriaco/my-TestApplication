package com.pointlessapps.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnRegister = findViewById(R.id.btnRegister);
        btnRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.btnRegister:
                TextView txtFirstName = findViewById(R.id.txtFirstName);
                TextView txtLastName = findViewById(R.id.txtLastName);
                TextView txtEmail = findViewById(R.id.txtEmail);

                EditText edtTxtFirstName = findViewById(R.id.edtTxtFirstName);
                EditText edtTxtLastName = findViewById(R.id.edtTxtLastName);
                EditText edtTxtEmail = findViewById(R.id.edtTxtEmail);

                txtFirstName.setText("First Name: " + edtTxtFirstName.getText().toString());
                txtLastName.setText("Last Name: " + edtTxtLastName.getText().toString());
                txtEmail.setText("Email: " + edtTxtEmail.getText().toString());
                Toast.makeText(this, "Hey!", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}
