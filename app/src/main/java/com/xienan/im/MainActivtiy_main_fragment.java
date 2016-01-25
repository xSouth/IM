package com.xienan.im;

import android.animation.Animator;
import android.app.Fragment;
import android.os.Bundle;

/**
 * Created by Administrator on 2016/1/25.
 */
public class MainActivtiy_main_fragment extends Fragment{


    @Override
    public Animator onCreateAnimator(int transit, boolean enter, int nextAnim) {
        return super.onCreateAnimator(transit, enter, nextAnim);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        findViewById();

        initSettings();

        setListener();
    }

    public void findViewById(){

    }

    public void initSettings(){

    }

    public void setListener(){

    }
}
