package joseoliva.com.gallerypro.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import joseoliva.com.gallerypro.ImageAdapterCasaReal;
import joseoliva.com.gallerypro.ImageAdapterPhotocall;
import joseoliva.com.gallerypro.R;

public class PhotocallFragment extends Fragment {

    View mView;

    public PhotocallFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_photocall, container, false);
        ImageAdapterPhotocall imageAdapterPhotocall = new ImageAdapterPhotocall(container.getContext());
        ViewPager imagegalery = mView.findViewById(R.id.image_galery);
        imagegalery.setAdapter(imageAdapterPhotocall);
        return mView;

    }
}