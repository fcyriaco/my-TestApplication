package com.pointlessapps.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.TreeMap;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView txtFirstName;
    private TextView txtLastName;
    private TextView txtEmail;
    private EditText edtTxtFirstName;
    private EditText edtTxtLastName;
    private EditText edtTxtEmail;
    private CheckBox checkBox;
    private RadioGroup rgButtons;
    private boolean letterCase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnRegister = findViewById(R.id.btnRegister);
        btnRegister.setOnClickListener(this);

        checkBox = findViewById(R.id.chkBox);
        txtFirstName = findViewById(R.id.txtFirstName);
        txtLastName = findViewById(R.id.txtLastName);
        txtEmail = findViewById(R.id.txtEmail);
        edtTxtFirstName = findViewById(R.id.edtTxtFirstName);
        edtTxtLastName = findViewById(R.id.edtTxtLastName);
        edtTxtEmail = findViewById(R.id.edtTxtEmail);

        rgButtons = findViewById(R.id.rgButtons);
        rgButtons.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rbUpperCase:
                        letterCase = true;
                        break;
                    case R.id.rbLowerCase:
                        letterCase = false;
                        break;
                }
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.btnRegister:
                if(checkBox.isChecked()) {
                    if(letterCase) {
                        txtFirstName.setText("First Name: " + edtTxtFirstName.getText().toString().toUpperCase());
                        txtLastName.setText("Last Name: " + edtTxtLastName.getText().toString().toUpperCase());
                        txtEmail.setText("Email: " + edtTxtEmail.getText().toString().toUpperCase());
                    } else {
                        txtFirstName.setText("First Name: " + edtTxtFirstName.getText().toString().toLowerCase());
                        txtLastName.setText("Last Name: " + edtTxtLastName.getText().toString().toLowerCase());
                        txtEmail.setText("Email: " + edtTxtEmail.getText().toString().toLowerCase());
                    }
                    Toast.makeText(this, "Registered!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "Can't registry this!", Toast.LENGTH_SHORT).show();
                }
                break;
            default:
                break;
        }
    }
}
