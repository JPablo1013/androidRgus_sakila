package com.example.peliculas2;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;


import com.example.peliculas2.GalleryPagerAdapter; // Agregar esta línea

public class GalleryFragment extends Fragment {

    private ViewPager viewPager;
    private int currentPage = 0;
    private CountDownTimer countDownTimer;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gallery, container, false);

        Button closeButton = view.findViewById(R.id.closeButton);
        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (getActivity() != null) {
                    getActivity().onBackPressed();
                }
            }
        });

        viewPager = view.findViewById(R.id.viewPager);
        GalleryPagerAdapter galleryPagerAdapter = new GalleryPagerAdapter(getChildFragmentManager());
        viewPager.setAdapter(galleryPagerAdapter);

        countDownTimer = new CountDownTimer(Long.MAX_VALUE, 5000) {
            @Override
            public void onTick(long millisUntilFinished) {
                if (currentPage < galleryPagerAdapter.getCount() - 1) {
                    currentPage++;
                } else {
                    currentPage = 0;
                }
                viewPager.setCurrentItem(currentPage, true);
            }

            @Override
            public void onFinish() {
            }
        }.start();

        return view;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

}

