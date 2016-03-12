package com.example.pannam.atr72trainingmanual;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by pannam on 3/2/2016.
 */
public class TabFourFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.introduction,container,false);
    }

//
//    RelativeLayout layout = new RelativeLayout(this);
//    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams
// (LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
//    layout.setLayoutParams(layoutParams);
//
//    RelativeLayout.LayoutParams params1 =
// new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT,
// LayoutParams.WRAP_CONTENT);
//    RelativeLayout.LayoutParams params2 = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
//    RelativeLayout.LayoutParams params3 = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
//    RelativeLayout.LayoutParams params4 = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
//
//    TextView tv1 = new TextView(this);
//    tv1.setId(1);
//    tv1.setText("textView1");
//
//    TextView tv2 = new TextView(this);
//    params2.addRule(RelativeLayout.RIGHT_OF, tv1.getId());
//    itemName.setId(2);
//    itemName.setText("textView2");
//
//    TextView tv3 = new TextView(this);
//    params3.addRule(RelativeLayout.BELOW, tv1.getId());
//    itemName.setId(3);
//    itemName.setText("textView3");
//
//    TextView tv4 = new TextView(this);
//    params4.addRule(RelativeLayout.RIGHT_OF, tv3.getId());
//    params4.addRule(RelativeLayout.ALIGN_BOTTOM, tv3.getId());
//    itemName.setId(4);
//    itemName.setText("textView4");
//
//    layout.addView(tv1, params1);
//    layout.addView(tv2, params2);
//    layout.addView(tv3, params3);
   // layout.addView(tv4, params4);
}

