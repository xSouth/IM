package com.xienan.im;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;

import com.xienan.im.view.MyVideoView;

public class MainActivity extends Activity {

    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private MyVideoView myVideoView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findView();

        initSettings();

        setListener();

        myVideoView = (MyVideoView) findViewById(R.id.myvideoview);


        myVideoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.entrance_video));
        myVideoView.start();
        myVideoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {

            @Override
            public void onPrepared(MediaPlayer mp) {
                // TODO Auto-generated method stub
                mp.start();
                mp.setLooping(true);
            }
        });
    }


    public void findView(){

    }

    public void initSettings(){

//        mainActivtiy_main_fragment = new MainActivtiy_main_fragment();
//        mainActivity_signin_fragment = new MainActivity_signin_fragment();
//        mainActivity_signup_fragment = new MainActivity_signup_fragment();
//        getFragmentManager().beginTransaction().add(R.id.activity_main_fragment_relativelayout, mainActivtiy_main_fragment).commit();

        fragmentManager = getFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.activity_main_fraglayout,new MainActivtiy_main_fragment(),"main_fragment");
        fragmentTransaction.commit();

    }

    public void setListener(){

    }
}
