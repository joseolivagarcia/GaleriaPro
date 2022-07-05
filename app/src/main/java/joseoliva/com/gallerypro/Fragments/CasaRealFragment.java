package joseoliva.com.gallerypro.Fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import joseoliva.com.gallerypro.ImageAdapter;
import joseoliva.com.gallerypro.MainActivity;
import joseoliva.com.gallerypro.R;


public class CasaRealFragment extends Fragment {

    View mView;

    public CasaRealFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_casa_real, container, false);
        ImageAdapter imageAdapter = new ImageAdapter(container.getContext());
        ViewPager imagegalery = mView.findViewById(R.id.image_galery);
        imagegalery.setAdapter(imageAdapter);
        return mView;


    }
}