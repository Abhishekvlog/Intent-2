package com.example.intant_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView mRFirstName;
    private TextView mRLastName;
    private TextView mRAge;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initViews();
        String FirstName = getIntent().getStringExtra("keyFirstName");
        String LastName = getIntent().getStringExtra("keyLastNAme");
        String Age = getIntent().getStringExtra("keyAge");

        mRFirstName.setText(FirstName);
        mRLastName.setText(LastName);
        mRAge.setText(Age);
    }

    private void initViews() {
        mRFirstName = findViewById(R.id.RFirstName);
        mRAge = findViewById(R.id.RAge);
        mRLastName = findViewById(R.id.RLastName);
    }
}