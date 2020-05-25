package com.example.datingapp.ui.home;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.akaita.android.circularseekbar.CircularSeekBar;
import com.example.datingapp.R;
import com.google.android.material.snackbar.Snackbar;

import java.text.DecimalFormat;

public class HomeFragment extends Fragment {

    private View homefrag;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homefrag = inflater.inflate(R.layout.fragment_home, container, false);
        CircularSeekBar seekBar= (CircularSeekBar)homefrag.findViewById(R.id.seekbar);
        CircularSeekBar seekBar1= (CircularSeekBar)homefrag.findViewById(R.id.seekbar1);
        seekBar.setProgressTextFormat(new DecimalFormat("###,###,###,##0"));
        seekBar.setProgress(18);
        seekBar.setRingColor(Color.LTGRAY);
        seekBar.setOnCenterClickedListener(new CircularSeekBar.OnCenterClickedListener() {
            @Override
            public void onCenterClicked(CircularSeekBar seekBar, float progress) {
                Snackbar.make(seekBar,"Reset", Snackbar.LENGTH_SHORT).show();
                seekBar.setProgress(18);
            }
        });



        seekBar.setOnCircularSeekBarChangeListener(new CircularSeekBar.OnCircularSeekBarChangeListener() {
            @Override
            public void onProgressChanged(CircularSeekBar seekBar, float progress, boolean fromUser) {
                if(progress<30)
                {
                    seekBar.setRingColor(Color.MAGENTA);
                }
                else {
                    if(progress<50)
                    {
                        seekBar.setRingColor(Color.GRAY);
                    }
                    else{
                    seekBar.setRingColor(Color.YELLOW);
                }}
            }

            @Override
            public void onStartTrackingTouch(CircularSeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(CircularSeekBar seekBar) {

            }
        });






        seekBar1.setProgressTextFormat(new DecimalFormat("###,###,###,##0"));
        seekBar1.setProgress(19);
        seekBar1.setRingColor(Color.GREEN);
        seekBar1.setOnCenterClickedListener(new CircularSeekBar.OnCenterClickedListener() {
            @Override
            public void onCenterClicked(CircularSeekBar seekBar1, float progress) {
                Snackbar.make(seekBar1,"Reset", Snackbar.LENGTH_SHORT).show();
                seekBar1.setProgress(19);
            }
        });

        seekBar1.setOnCircularSeekBarChangeListener(new CircularSeekBar.OnCircularSeekBarChangeListener() {
            @Override
            public void onProgressChanged(CircularSeekBar seekBar1, float progress, boolean fromUser) {
                if(progress<30)
                {
                    seekBar1.setRingColor(Color.parseColor("#FFFFFF"));
                }
                else {
                    if(progress<45)
                    {
                        seekBar1.setRingColor(Color.YELLOW);
                    }
                    else{
                        seekBar1.setRingColor(Color.MAGENTA);
                    }}
            }

            @Override
            public void onStartTrackingTouch(CircularSeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(CircularSeekBar seekBar) {

            }
        });
        return homefrag;
    }
}
