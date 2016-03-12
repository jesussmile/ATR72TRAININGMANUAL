package com.example.pannam.atr72trainingmanual;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by pannam on 3/11/2016.
 */
public class Test extends Fragment {


        View view_a;

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

            LinearLayout ll = new LinearLayout(getActivity());
            ll.addView(new TextView(getActivity()));

            view_a = ll;

            return view_a;
        }
    }

