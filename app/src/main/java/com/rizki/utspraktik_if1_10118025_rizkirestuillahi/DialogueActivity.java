package com.rizki.utspraktik_if1_10118025_rizkirestuillahi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DialogueActivity extends AppCompatActivity {
    //  5 Juni 2021 10118025 Rizki Restu Illahi IF-1
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialogue);
    }

    public void ok(View view) {
        Intent intent = new Intent(DialogueActivity.this, MainActivity.class);
        startActivity(intent);
    }
}