package com.pointlessapps.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView txtFirstName;
    private TextView txtLastName;
    private TextView txtEmail;
    private EditText edtTxtFirstName;
    private EditText edtTxtLastName;
    private EditText edtTxtEmail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnRegister = findViewById(R.id.btnRegister);
        btnRegister.setOnClickListener(this);
        txtFirstName = findViewById(R.id.txtFirstName);
        txtLastName = findViewById(R.id.txtLastName);
        txtEmail = findViewById(R.id.txtEmail);
        edtTxtFirstName = findViewById(R.id.edtTxtFirstName);
        edtTxtLastName = findViewById(R.id.edtTxtLastName);
        edtTxtEmail = findViewById(R.id.edtTxtEmail);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.btnRegister:
                txtFirstName.setText("First Name: " + edtTxtFirstName.getText().toString());
                txtLastName.setText("Last Name: " + edtTxtLastName.getText().toString());
                txtEmail.setText("Email: " + edtTxtEmail.getText().toString());
                Toast.makeText(this, "Registered!", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}
