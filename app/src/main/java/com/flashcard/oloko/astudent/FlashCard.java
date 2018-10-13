package com.flashcard.oloko.astudent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FlashCard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash_card);



    findViewById(R.id.flashcard_question).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            findViewById(R.id.flashcard_answer).setVisibility(v.VISIBLE);

               findViewById(R.id.flashcard_question).setVisibility(v.INVISIBLE);
        }
    });


    }






}
