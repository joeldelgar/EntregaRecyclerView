package com.example.entrega4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EditTrackActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_track);

        Intent intent = getIntent();


        Button exit = (Button) findViewById(R.id.exit_btn);
        Button delete = (Button) findViewById(R.id.delete_btn);
        Button save = (Button) findViewById(R.id.save_btn);
    }

    public void onClick(View v){
        TextView song = (TextView) findViewById(R.id.TextSongName);
        TextView artist = (TextView) findViewById(R.id.artistTextView);
        int b = v.getId();
        try{
            switch (b){
                case R.id.exit_btn:

                    break;
                case R.id.delete_btn:

                    break;
                case R.id.save_btn:

                    break;
            }

        }catch (Exception e){
            song.setText("ERROR!");
            artist.setText("ERROR!");
        }
    }



}