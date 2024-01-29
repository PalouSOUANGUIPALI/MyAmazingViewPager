package com.openclassrooms.myamazingviewpager.Controllers.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.openclassrooms.myamazingviewpager.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link NewsPageFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NewsPageFragment extends Fragment {

    public NewsPageFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance
     * @return A new instance of fragment NewsPageFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static NewsPageFragment newInstance() {
       return(new NewsPageFragment());

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_news_page, container, false);
    }
}