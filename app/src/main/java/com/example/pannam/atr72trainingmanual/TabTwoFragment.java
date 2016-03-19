package com.example.pannam.atr72trainingmanual;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by pannam on 3/2/2016.
 */
public class TabTwoFragment extends Fragment {
    View view_a;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

//        final TextView rowTextView = (TextView) new TextView(
//                getActivity());
//        rowTextView.setText(name);
        //  final TextView rowTextView;

//        //return inflater.inflate(R.layout.fragment_2,container,false);
//        LinearLayout ll = new LinearLayout(getActivity());
//       ll.addView(new TextView(getActivity()));
//
//        view_a = ll;
//
//
//
//        return view_a;

        final LinearLayout layoutHorizontal = new LinearLayout(
                getActivity());


        layoutHorizontal
                .setOrientation(LinearLayout.HORIZONTAL);

        final TextView rowTextView = (TextView) new TextView(
                getActivity());
        rowTextView.setText("Dynamically created Layout from Fragment");
        layoutHorizontal.addView(rowTextView);
        return layoutHorizontal;


    }
}
