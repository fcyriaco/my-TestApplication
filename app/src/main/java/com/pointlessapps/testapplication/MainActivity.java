package com.pointlessapps.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // relaciona com activity_main.xml
        setContentView(R.layout.activity_main);
    }

    // funcao para tratar o click no botao
    public void onButtonClick(View view) {
        // cria o objeto txtBox relacionado com o campo txtMessage da activity_main.txt
        TextView txtBox = findViewById(R.id.txtMessage);
        // cria o objeto edtTxtName para entrada de texto.
        EditText edtTxtName = findViewById(R.id.editTxtName);
        // modifica o texto na caixa.
        txtBox.setText("Hello " + edtTxtName.getText().toString());
    }
}

// https://www.youtube.com/watch?v=fis26HvvDII
// pausado em 1:00:06
