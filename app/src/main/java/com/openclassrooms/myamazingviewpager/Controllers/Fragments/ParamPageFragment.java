package com.openclassrooms.myamazingviewpager.Controllers.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.openclassrooms.myamazingviewpager.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ParamPageFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ParamPageFragment extends Fragment {

    public ParamPageFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance
     * @return A new instance of fragment ParamPageFragment.
     */

    public static ParamPageFragment newInstance() {
       return (new ParamPageFragment());

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_param_page, container, false);
    }
}