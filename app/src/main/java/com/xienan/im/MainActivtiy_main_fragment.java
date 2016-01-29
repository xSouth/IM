package com.xienan.im;

import android.animation.Animator;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.daimajia.androidanimations.library.YoYo;

/**
 * Created by Administrator on 2016/1/25.
 */
public class MainActivtiy_main_fragment extends Fragment{
    private View mMainView;
    private TextView activity_main_fragment_layout_im;
    private Button activity_main_fragment_layout_gosignin_submit,activity_main_fragment_layout_gosignup_submit;
    private MainActivityButtonClick mainActivityButtonClick;

    private View mTarget;
    private YoYo.YoYoString rope;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        inflater = getActivity().getLayoutInflater();
        mMainView = inflater.inflate(R.layout.activity_main_fragment,container,false);
        findViewById();

        initSettings();

        setListener();

        return mMainView;
    }

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
    }

    public void findViewById(){
        mainActivityButtonClick = new MainActivityButtonClick();
        mTarget = mMainView.findViewById(R.id.activity_main_fragment_layout_im);
//        rope = YoYo.with(Techniques.FadeIn).duration(1000).playOn(mTarget);
        activity_main_fragment_layout_gosignin_submit = (Button)mMainView.findViewById(R.id.activity_main_fragment_layout_gosignin_submit);
        activity_main_fragment_layout_gosignup_submit = (Button)mMainView.findViewById(R.id.activity_main_fragment_layout_gosignup_submit);

    }

    public void initSettings(){
        activity_main_fragment_layout_gosignin_submit.setOnClickListener(mainActivityButtonClick);
        activity_main_fragment_layout_gosignup_submit.setOnClickListener(mainActivityButtonClick);
    }

    public void setListener(){

    }



    class MainActivityButtonClick implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.activity_main_fragment_layout_gosignin_submit:{

                }
                case R.id.activity_main_fragment_layout_gosignup_submit:{

                }
                default:{}
            }
        }
    }
}
