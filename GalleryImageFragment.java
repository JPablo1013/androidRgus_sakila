package com.example.peliculas2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class GalleryImageFragment extends Fragment {

    private static final String ARG_POSITION = "position";

    public GalleryImageFragment() {

    }

    public static GalleryImageFragment newInstance(int position) {
        GalleryImageFragment fragment = new GalleryImageFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_POSITION, position);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gallery_image, container, false);

        return view;
    }
}


