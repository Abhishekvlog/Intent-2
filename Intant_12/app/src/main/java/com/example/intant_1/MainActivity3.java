package com.example.intant_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {
    private Button mbtnCamera;
    private Button mbtnShare;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        intitView();
        mbtnCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(intent);
            }
        });
        mbtnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent implicit = new Intent();
                implicit.setAction(Intent.ACTION_SEND);
                implicit.putExtra(Intent.EXTRA_TEXT,"Hello");
                implicit.setType("text/plain");
                startActivity(implicit);
            }
        });
    }

    private void intitView() {
        mbtnCamera = findViewById(R.id.btnCamera);
        mbtnShare = findViewById(R.id.btnShare);
    }
}