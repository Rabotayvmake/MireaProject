package ru.mirea.evteev.mireaproject;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class simplePlayer extends Fragment {

    public simplePlayer() {
        // Required empty public constructor
    }

    public static simplePlayer newInstance(String param1, String param2) {
        simplePlayer fragment = new simplePlayer();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_simple_player, container, false);
    }
}