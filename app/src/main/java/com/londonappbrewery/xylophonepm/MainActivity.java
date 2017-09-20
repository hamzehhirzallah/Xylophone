package com.londonappbrewery.xylophonepm;


import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // Helpful Constants
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    // TODO: Add member variables here
    private SoundPool mSonudPool;
    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Create a new SoundPool
        mSonudPool = new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS, AudioManager.STREAM_MUSIC,0);


        // TODO: Load and get the IDs to identify the sounds
        mCSoundId = mSonudPool.load(getApplicationContext(),R.raw.note1_c,1);
        mDSoundId = mSonudPool.load(getApplicationContext(),R.raw.note2_d,1);
        mESoundId = mSonudPool.load(getApplicationContext(),R.raw.note3_e,1);
        

    }

    // TODO: Add the play methods triggered by the buttons
    public void playC(View v){
        Log.d("xylophone","Key C is pressed");
        mSonudPool.play(mCSoundId,LEFT_VOLUME,RIGHT_VOLUME,NO_LOOP,PRIORITY,NORMAL_PLAY_RATE);
    }
    public void playD(View v){
        Log.d("xylophone","Key d is pressed");
        mSonudPool.play(mDSoundId,LEFT_VOLUME,RIGHT_VOLUME,NO_LOOP,PRIORITY,NORMAL_PLAY_RATE);
    }
    public void playE(View v){
        Log.d("xylophone","Key e is pressed");
        mSonudPool.play(mESoundId,LEFT_VOLUME,RIGHT_VOLUME,NO_LOOP,PRIORITY,NORMAL_PLAY_RATE);
    }



}
