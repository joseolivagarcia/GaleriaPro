package joseoliva.com.gallerypro.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import joseoliva.com.gallerypro.ImageAdapterCasaReal;
import joseoliva.com.gallerypro.ImageAdapterCurri;
import joseoliva.com.gallerypro.R;


public class CurriFragment extends Fragment {

    View mView;

    public CurriFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_curri, container, false);
        ImageAdapterCurri imageAdapterCurri = new ImageAdapterCurri(container.getContext());
        ViewPager imagegalery = mView.findViewById(R.id.image_galery);
        imagegalery.setAdapter(imageAdapterCurri);
        return mView;
    }
}