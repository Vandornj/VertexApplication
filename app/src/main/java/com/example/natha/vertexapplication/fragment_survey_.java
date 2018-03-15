package com.example.natha.vertexapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Nat on 2/17/2018.
 */

public class fragment_survey_ extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";

    public fragment_survey_() {
    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static fragment_survey_ newInstance(int sectionNumber) {
        fragment_survey_ fragment = new fragment_survey_();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_survey_, container, false);
        return rootView;
    }


}