package br.edu.ibta.aluno.mediaplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static br.edu.ibta.aluno.mediaplayer.R.raw.cat;
import static br.edu.ibta.aluno.mediaplayer.R.raw.cow;
import static br.edu.ibta.aluno.mediaplayer.R.raw.dog;
import static br.edu.ibta.aluno.mediaplayer.R.raw.horse;
import static br.edu.ibta.aluno.mediaplayer.R.raw.lion;
import static br.edu.ibta.aluno.mediaplayer.R.raw.pig;
import static br.edu.ibta.aluno.mediaplayer.R.raw.rooster;
import static br.edu.ibta.aluno.mediaplayer.R.raw.turkey;

public class MainActivity extends AppCompatActivity {

MediaPlayer mp = new MediaPlayer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dog (View view){
            mp=MediaPlayer.create(this, dog);
            mp.start();
    }

    public void cat (View view){
        mp= MediaPlayer.create(this,cat);
        mp.start();
    }

    public void horse (View view) {
        mp= MediaPlayer.create(this,horse);
        mp.start();
    }

    public void cow (View view) {
        mp= MediaPlayer.create(this,cow);
        mp.start();
    }

    public void pig (View view){
        mp= MediaPlayer.create(this,pig);
        mp.start();
    }

    public void rooster (View view) {
        mp= MediaPlayer.create(this,rooster);
        mp.start();
    }

    public void lion (View view) {
        mp= MediaPlayer.create(this,lion);
        mp.start();
    }

    public void turkey (View view){
        mp=MediaPlayer.create(this,turkey);
        mp.start();
    }
}
