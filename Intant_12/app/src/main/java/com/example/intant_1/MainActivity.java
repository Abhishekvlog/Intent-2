package com.example.intant_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText metFirstName;
    private EditText metLastName;
    private EditText metAge;
    private Button mbtnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intitViews();
        mbtnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String FirstName = metFirstName.getText().toString();
                String LastName = metLastName.getText().toString();
                String Age = metAge.getText().toString();
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);

                intent.putExtra("keyFirstName" ,FirstName);
                intent.putExtra("keyLastNAme", LastName);
                intent.putExtra("keyAge", Age);
                startActivity(intent);

            }
        });
    }

    private void intitViews() {
        metFirstName = findViewById(R.id.edfirstname);
        metLastName = findViewById(R.id.edlastname);
        metAge = findViewById(R.id.edage);
        mbtnNext = findViewById(R.id.btnnext);
    }
}